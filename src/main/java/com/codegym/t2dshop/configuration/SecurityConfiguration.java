package com.codegym.t2dshop.configuration;

import com.codegym.t2dshop.repository.UserRepository;
import com.codegym.t2dshop.security.AccessDeniedFilter;
import com.codegym.t2dshop.security.AuthEntryPoint;
import com.codegym.t2dshop.security.AuthFilter;
import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackageClasses = {
        AuthEntryPoint.class, UserDetailsService.class,
        UserRepository.class, AccessDeniedFilter.class})
public class SecurityConfiguration {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthEntryPoint authEntryPoint;

    @Autowired
    private AccessDeniedFilter accessDeniedFilter;

    @Bean
    public Filter authenticationFilter() {
        return new AuthFilter();
    }

    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.getSharedObject(AuthenticationManagerBuilder.class).build();
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
        authManagerBuilder.userDetailsService(userDetailsService)
                          .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    protected SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable);

        httpSecurity.exceptionHandling(
                exception -> exception.authenticationEntryPoint(authEntryPoint));

        httpSecurity
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        httpSecurity.authorizeHttpRequests(
                req -> req.requestMatchers("/api/**", "/api/auth/login","/api/categories/**", "/api/auth/logout").permitAll());

        httpSecurity.authorizeHttpRequests(
                req -> req.requestMatchers("/api/roles/**").hasAnyRole("ADMIN"));

        httpSecurity.authorizeHttpRequests(
                req -> req.requestMatchers("/api/users/**").hasAnyRole("ADMIN", "USER"));

        httpSecurity.addFilterBefore(authenticationFilter(), UsernamePasswordAuthenticationFilter.class);

        httpSecurity.rememberMe(req -> req.tokenRepository(new InMemoryTokenRepositoryImpl()));

        httpSecurity.addFilterAfter(accessDeniedFilter, FilterSecurityInterceptor.class);

        return httpSecurity.build();
    }
}
