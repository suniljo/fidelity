package com.fidelity.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fidelity.data.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {


}
