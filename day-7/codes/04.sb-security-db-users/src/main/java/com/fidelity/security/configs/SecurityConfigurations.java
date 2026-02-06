package com.fidelity.security.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.fidelity.security.services.CustomUserDetailsService;

@Configuration
public class SecurityConfigurations {
    @Autowired
    private CustomUserDetailsService userDtlsService;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
	@Bean
	public SecurityFilterChain customSecurityConfigs(HttpSecurity httpSecurity) {
	
		httpSecurity.authorizeHttpRequests(httpRequest -> httpRequest.requestMatchers("/register/**")
																	 	.permitAll()
																	 	.anyRequest()
																	 	.authenticated());

		httpSecurity.csrf(csrf -> csrf.disable());
		
		httpSecurity.httpBasic(Customizer.withDefaults()); // configures HTTP Basic authentication.
		
		SecurityFilterChain filterChain = httpSecurity.build();
		
		return filterChain;
	}
	

    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDtlsService);
        provider.setPasswordEncoder(passwordEncoder);
        
        return provider;
    }	
}
