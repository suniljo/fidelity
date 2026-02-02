package com.fidelity.app.services;

import com.fidelity.app.dao.UserRepository;

class UserService {
    private UserRepository userRepository;

    // Constructor injection is preferred by @InjectMocks
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getUserName() {
        return userRepository.findName();
    }
}
