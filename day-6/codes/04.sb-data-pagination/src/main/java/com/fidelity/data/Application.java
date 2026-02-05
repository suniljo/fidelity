package com.fidelity.data;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.fidelity.data.entities.Contact;
import com.fidelity.data.repository.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	private ContactRepository contactRepo;
	static String projectName = "Money Transfer Application";
	
	// constructor injection
	public Application(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
		LOGGER.info("Application initalization");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		LOGGER.info("Spring Container Initialized - {}", projectName);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		//--fetch first 5 contacts
		Pageable pageable = Pageable.ofSize(5);
		Page<Contact> contactsPage = contactRepo.findAll(pageable);
		List<Contact> contacts = contactsPage.getContent();
		printContacts(contacts);
		*/
		
		/*
		//int pageNo = 0; //first page
		int pageNo = 1; //first page
		int pageSize = 5; //no of records
		PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
		Page<Contact> contactPage = contactRepo.findAll(pageRequest);
		List<Contact> contacts = contactPage.getContent();
		printContacts(contacts);
		*/
		
		long noOfContacts = contactRepo.count();
		int pageSize = 3;
		long noOfPages = noOfContacts / pageSize;
		
		if(noOfContacts % pageSize > 0) {
			noOfPages++;
		}
		
		for(int pageNo=0; pageNo<noOfPages; pageNo++) {
			PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
			Page<Contact> contactPage = contactRepo.findAll(pageRequest);
			List<Contact> contacts = contactPage.getContent();
			
			printContacts(contacts, pageNo, noOfPages);	
			System.out.println();
			LOGGER.info("printing page: {} of {}", (pageNo+1), noOfPages);
		}
	}
	
	private void printContacts(List<Contact> contacts, int pageNo, long noOfPages) {
		System.out.println("=============== Page "+ (pageNo+1) + " / "+ noOfPages + " ===============");
		contacts.forEach(ct -> System.out.println(ct));		
	}

	private void printContacts(List<Contact> contacts) {
		contacts.forEach(System.out::println);		
	}	
}
