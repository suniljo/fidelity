package com.fidelity.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fidelity.security.entities.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
	
	Optional<MyUser> findByUsername(String username);
}