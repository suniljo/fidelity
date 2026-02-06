package com.fidelity.security.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfigurations {
	
	 @Bean
	 public SecurityFilterChain customSecurityConfigurations(HttpSecurity http) throws Exception {
	   System.out.println("custom security configurations");
	   http.authorizeHttpRequests((request) ->request.anyRequest()
						       						 .authenticated());

	   http.csrf(csrf ->csrf.disable());
	 
	   http.httpBasic(Customizer.withDefaults()); // configures HTTP Basic authentication.
	   
	   http.formLogin(Customizer.withDefaults());

	   DefaultSecurityFilterChain filterChain = http.build();

	   return filterChain; 
	 }
}
