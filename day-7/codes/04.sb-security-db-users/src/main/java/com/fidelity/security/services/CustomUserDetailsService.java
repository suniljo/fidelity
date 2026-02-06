package com.fidelity.security.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fidelity.security.entities.MyUser;
import com.fidelity.security.repository.MyUserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private MyUserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> optUser = userRepo.findByUsername(username);

		if (optUser.isPresent()) {
			MyUser userObj = optUser.get();
			return User.builder().username(userObj.getUsername()).password(userObj.getPassword()).build();
		}
		throw new UsernameNotFoundException(username);
	}

}

