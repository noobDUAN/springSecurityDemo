package com.wayne.wayneBlog.config.springSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity.authorizeHttpRequests(auth -> {
                    auth.anyRequest().authenticated();
                })
                .formLogin(form -> {
                    form.loginPage("/login/view");
                    form.loginProcessingUrl("/login/doLogin");
                    form.defaultSuccessUrl("/index/view");
                    form.permitAll();
                }).build();
    }

}
