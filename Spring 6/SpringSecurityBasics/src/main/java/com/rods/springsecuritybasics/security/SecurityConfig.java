package com.rods.springsecuritybasics.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.DaoAuthenticationConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    private UserDetailsService userDetailsService;


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {


        // Here we are using the lambda function and disabling the csrf
        http
                .csrf(customizer -> customizer.disable())
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
//                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        // here we are also going to make the session stateless ==> each new request will have new sessionID


        return http.build();
    }


    @Bean
    public AuthenticationProvider authProvider() {

        // DAO (Data access object for speaking with the database)
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService);
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        return provider;


    }


}


// Two ways of configuring the scurityconfig file
// 1] Using Lambda 2] Using Conventional Approach


// configuring using the imperative method
//        Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
//            @Override
//            public void customize(CsrfConfigurer<HttpSecurity> configurer) {
//                configurer.disable();
//            }
//        };
//
//        http.csrf(custCsrf);
//
//        Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> custHttp = new Customizer<AuthorizeHttpRequestsConfigurer<org.springframework.security.config.annotation.web.builders.HttpSecurity>.AuthorizationManagerRequestMatcherRegistry>() {
//            @Override
//            public void customize(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry registry) {
//                registry.anyRequest().authenticated();
//            }
//        };
//
//        http.authorizeHttpRequests(custHttp);


// Implementing our own UserDetailsService
// Bydefault the userdetailsservice will scan the application.properties for username/pass
//   @Bean
//    public UserDetailsService userDetailsService() {
//        // Here we are not getting the data of users from the database ==> Instead we are using Hardcoded Values;
//
//        UserDetails user = User.withDefaultPasswordEncoder()
//                .username("sian")
//                .password("fatboy")
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("deepak")
//                .password("admin@123")
//                .roles("ADMIN")
//                .build();
//
//
//        return new InMemoryUserDetailsManager(user,admin);
//
//    }
