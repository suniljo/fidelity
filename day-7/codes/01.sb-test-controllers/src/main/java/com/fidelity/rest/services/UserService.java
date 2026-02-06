package com.fidelity.rest.services;

import com.fidelity.rest.dto.UserDto;

public interface UserService {
	public UserDto getUserById(Long id);
}
