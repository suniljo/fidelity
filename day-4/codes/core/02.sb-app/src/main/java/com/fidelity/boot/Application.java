package com.fidelity.boot;
import com.fidelity.boot.beans.controllers.AccountController;
import com.fidelity.boot.utils.DataSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.fidelity.boot.beans.Car;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("-".repeat(100));
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println("-".repeat(100));
		
		//Car carBean = context.getBean(Car.class);
		//Car carBean = (Car) context.getBean("car");
		//Car carBean = context.getBean("car", Car.class);
		
		Car carBean = (Car) context.getBean("mycar");		
		carBean.startJourney();

		System.out.println("-".repeat(100));
		
		//DataSecurity securityBean = context.getBean(DataSecurity.class);
		//DataSecurity securityBean = (DataSecurity) context.getBean("generateSecurity");
		DataSecurity securityBean = (DataSecurity) context.getBean("security");
		
		String data = "Fidelity Investmments";
		String encodedData = securityBean.encodeData(data);
		System.out.println(encodedData);
		
		DataSecurity securityBean1 = (DataSecurity) context.getBean("security");
		context.close();
	}

}
