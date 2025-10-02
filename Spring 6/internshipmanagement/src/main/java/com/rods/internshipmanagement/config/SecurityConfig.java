package com.rods.internshipmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // disable CSRF for simplicity (enable if needed)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()  // allow all requests without auth
                )
                .formLogin(form -> form.disable()) // disable default login form
                .httpBasic(basic -> basic.disable()); // disable HTTP basic auth too

        return http.build();
    }
}
