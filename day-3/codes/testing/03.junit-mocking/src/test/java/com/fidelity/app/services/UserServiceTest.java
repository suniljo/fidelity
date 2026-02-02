package com.fidelity.app.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.fidelity.app.dao.UserRepository;

//1. Extend the test with MockitoExtension
@ExtendWith(MockitoExtension.class)
class UserServiceTest {
	// 2. Create the dependency mock
    @Mock
    UserRepository userRepository;

    // 3. Automatically inject the mock into this class
    @InjectMocks
    UserService userService;

    @Test
    void testGetUser() {
        // Define behavior for the mock
        when(userRepository.findName()).thenReturn("John Doe");

        // Test the service
        String name = userService.getUserName();
        assertEquals("John Doe", name);
    }

}
