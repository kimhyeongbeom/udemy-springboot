package com.in28minutes.springboot.myfirstwebapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {
    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        UserDetails userDetails1 = createUser("in28minutes", "dummy");
        UserDetails userDetails2 = createUser("ranga", "dummy");
        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }
    private UserDetails createUser(String username, String password) {
        return User.builder()
                .passwordEncoder(input -> passwordEncoder().encode(input))
                .username(username)
                .password(password)
                .roles("ADMIN", "USER")
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // 모든요청은 승인되어야 한다.
        http.authorizeRequests(
                auth -> auth.anyRequest().authenticated()
        );

        // 로그인페이지 설정
        http.formLogin(Customizer.withDefaults());

        // CSRF를 disable
        http.csrf(AbstractHttpConfigurer::disable);

        // Frame을 사용할 수 있도록
        http.headers(
            headersConfigurer ->
                headersConfigurer
                    .frameOptions(
                        HeadersConfigurer.FrameOptionsConfig::sameOrigin
                    )
        );
        return http.build();
    }
}
