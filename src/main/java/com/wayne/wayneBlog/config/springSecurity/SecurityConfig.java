package com.wayne.wayneBlog.config.springSecurity;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * 过滤器链
     *
     * @param httpSecurity
     * @return
     * @throws Exception
     */
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


    /**
     * 使用@Async等方法产生的线程，将会继承旧的securityContext属性
     * @return
     */
    @Bean
    public InitializingBean initializingBean() {
        return () -> SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
    }
}
