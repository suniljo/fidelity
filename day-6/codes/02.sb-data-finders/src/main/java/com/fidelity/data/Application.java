package com.fidelity.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fidelity.data.entities.Contact;
import com.fidelity.data.repository.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private ContactRepository contactRepo;
	private Contact contact;
	
	// constructor injection
	@Autowired
	public Application(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Optional<Contact> optContact = contactRepo.findByContactName("Praveen");
		if(optContact.isPresent()) {
			contact = optContact.get();
			System.out.println(contact);
		}else {
			System.err.println("No matching contact found!!");
		}
		System.out.println("-".repeat(100));
		
		contact = contactRepo.findByContactNumber("984858687898");
		System.out.println(contact);
		System.out.println("-".repeat(100));
		
		optContact = contactRepo.findByContactNameAndContactNumber("Praveen","984858687892");
		if(optContact.isPresent()) {
			contact = optContact.get();
			System.out.println(contact);
		}else {
			System.err.println("No matching contact found!!");
		}
		System.out.println("-".repeat(100));
		
		
		List<Contact> contacts = contactRepo.findByContactNameOrContactNumber("Praveen","984858687893");
		contacts.forEach(System.out::println);
		System.out.println("-".repeat(100));
		
		
		List<String> contactNames = contactRepo.findAllContactNames();
		contactNames.forEach(ctname -> System.out.println(ctname));
		System.out.println();
		System.out.println("-".repeat(100));
		
		String cname = "Ajay";
		optContact = contactRepo.findByCntName(cname);
		if(optContact.isPresent()) {
			contact = optContact.get();
			System.out.println(contact);
		}else {
			System.err.print("no matching contact for contact Name: "+ cname);
		}
		System.out.println();
		
		contacts = contactRepo.findContactsWhereNamesWith("S");
		contacts.forEach(System.out::println);
		System.out.println();		
	}
	
	/*
	@PostConstruct
	public void initializeData() {
		Contact ct1 = new Contact("Tiya", "984858687896");
		Contact ct2 = new Contact("Laya", "984858687897");
		Contact ct3 = new Contact("Lena", "984858687898");
		Contact ct4 = new Contact("Vicky", "984858687899");
		Contact ct5 = new Contact("Sagar", "984858687890");
		
		List<Contact> contacts = List.of(ct1, ct2, ct3, ct4, ct5);
		
		contactRepo.saveAll(contacts);
	}
	*/
}
