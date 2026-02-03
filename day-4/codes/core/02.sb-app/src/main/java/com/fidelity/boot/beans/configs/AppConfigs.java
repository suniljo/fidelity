package com.fidelity.boot.beans.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fidelity.boot.utils.DataSecurity;

@Configuration
public class AppConfigs {

	public AppConfigs() {
		System.out.println("AppConfigs :: Constructor");
	}
	
	//@Bean
	@Bean(value = "security", initMethod = "initMethod", destroyMethod = "destroyMethod")
	//@Scope(value = "singleton")
	@Scope(value = "prototype")
	public DataSecurity generateSecurity() {
		return new DataSecurity();
	}
}
