package com.fidelity.data;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import com.fidelity.data.entities.Contact;
import com.fidelity.data.repository.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private ContactRepository contactRepo;
	
	// constructor injection
	public Application(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Iterable<Contact> contacts = contactRepo.findAll();
		
		//-- approach -1 -- using findBy orderBy ----
		
		//List<Contact> contacts = contactRepo.findByOrderByContactName();
		//List<Contact> contacts = contactRepo.findByOrderByContactNameAsc();
		//List<Contact> contacts = contactRepo.findByOrderByContactNameDesc();
		//List<Contact> contacts = contactRepo.findByOrderByContactNameDescContactNumberAsc();
		//contacts.stream().forEach(System.out::println);
		
		
		
		//-- approach-2 -- using pre-defined findAll() method of JpaRepository 
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName"));
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").ascending());
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").descending());
		//List<Contact> contacts = contactRepo.findAll(Sort.by("contactName", "contactNumber"));
		List<Contact> contacts = contactRepo.findAll(Sort.by("contactName").ascending().and(Sort.by("contactNumber").descending()));
		contacts.stream().forEach(System.out::println);
	}
}
