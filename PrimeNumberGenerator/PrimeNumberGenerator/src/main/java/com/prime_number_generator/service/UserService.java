package com.prime_number_generator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prime_number_generator.model.User;
import com.prime_number_generator.repository.UserRepository;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

	public User save(User user) {
		// TODO Auto-generated method stub
	 return userRepository.save(user);
	}
}