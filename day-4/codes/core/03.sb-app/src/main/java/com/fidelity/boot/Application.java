package com.fidelity.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fidelity.boot.beans.DBConnection;
import com.fidelity.boot.beans.Ticket;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ApplicationContext context = SpringApplication.run(Application.class, args);
	  System.out.println();
	  
	  Ticket ticket = context.getBean(Ticket.class);
	  System.out.println(ticket);
	  System.out.println();
	  
	  DBConnection dbCon = context.getBean(DBConnection.class);
	  System.out.println(dbCon);
	}
}
