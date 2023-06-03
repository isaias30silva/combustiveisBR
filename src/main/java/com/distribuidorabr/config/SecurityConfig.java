package com.distribuidorabr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import static org.springframework.security.config.Customizer.withDefaults;
import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class SecurityConfig {
	
	private final JwtAuthenticationFilter jwtAuthFilter;
	
	private final AuthenticationProvider authenticationProvider;

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
        		.csrf().disable()
        		.httpBasic(withDefaults())
                .authorizeHttpRequests()
                .requestMatchers(HttpMethod.POST, "/authenticate").permitAll()
                .requestMatchers(HttpMethod.POST, "/register").permitAll()
                .requestMatchers("/products/**").hasAnyAuthority("USER", "ADMIN")
                .requestMatchers("/employee/**").hasAnyAuthority("USER", "ADMIN")
                .requestMatchers("/companies/**").hasAnyAuthority("USER", "ADMIN")
                .requestMatchers("/order/**").hasAnyAuthority("USER", "ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);
        
		return http.build();
		 
		 
	}
	
}
