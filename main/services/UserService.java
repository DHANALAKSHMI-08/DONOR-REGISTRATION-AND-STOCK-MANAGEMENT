package com.cts.blood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.blood.repository.UserRepository;

@Service
public class UserService {
    
	@Autowired
	private UserRepository userRepository;

}
