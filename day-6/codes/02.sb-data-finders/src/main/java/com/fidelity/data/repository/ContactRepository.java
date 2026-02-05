package com.fidelity.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fidelity.data.entities.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

	Optional<Contact> findByContactName(String cname);

	Contact findByContactNumber(String cnumber);

	Optional<Contact> findByContactNameAndContactNumber(String ctName, String ctNumber);

	List<Contact> findByContactNameOrContactNumber(String ctName, String ctNumber);

	//@Query("select contactName from com.fidelity.data.entities.Contact") //HQL - Hibernate Query Language
	//@Query(value="select contactName from com.fidelity.data.entities.Contact") //HQL - Hibernate Query Language
	@Query(value="select contact_name from contact_master", nativeQuery=true) //SQL
	List<String> findAllContactNames();
	
	//@Query("from com.fidelity.data.entities.Contact where contactName=?1") //positional parameters
	//@Query("from com.fidelity.data.entities.Contact where contactName=:cname") //named parameters
	//@Query("select ct from com.fidelity.data.entities.Contact ct where contactName = :cname")
	@Query(value = "select * from CONTACT_MASTER where CONTACT_NAME=:cname", nativeQuery = true) //SQL - native query
	Optional<Contact> findByCntName(String cname);
	
	@Query("select ct from com.fidelity.data.entities.Contact ct where contactName LIKE :cnameLike%")
	List<Contact> findContactsWhereNamesWith(String cnameLike);	
}
