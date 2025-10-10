package com.rods.springsecuritybasics.security.filter;


import com.rods.springsecuritybasics.Service.JwtService;
import com.rods.springsecuritybasics.Service.MyUserDetailsService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

// Creating a JWT Filter in order to verify the token provided by the client
@Component
public class JwtFilter extends OncePerRequestFilter {


    @Autowired
    JwtService jwtService;

    @Autowired
    ApplicationContext context;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        String authHeader = request.getHeader("Authorization");
        String token = null;
        String userName = null;

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            // Here the  first starting part of the Auth string will be "Bearer <token_starts>"
            token = authHeader.substring(7);
            // implement the extractUserName in the jwtService class for extracting the username of the client
            userName = jwtService.extractUserName(token);
        }

        // check if the username is not null and the securitycontextholder has not yet been authenticated then simply move forward with
        // verifying the token for the given username
        if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {

            // loading the userdetails using th MyUserDetailsService which has been implemented
            UserDetails userDetails = context.getBean(MyUserDetailsService.class).loadUserByUsername(userName);

            // the validate token has been implemented in the JwtService class
            if (jwtService.validateToken(token, userDetails)) {
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                // if the token is valid then we can just move ahead with the other filter by setting the SecurityContextHolder
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
        }
        // passing onto other chains
        filterChain.doFilter(request, response);
    }
}
