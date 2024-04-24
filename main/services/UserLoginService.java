package com.cts.blood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.blood.model.UserRegisterModel;
import com.cts.blood.repository.UserRepository;

@Service
public class UserLoginService {
	@Autowired
	private UserRepository userRepository;
	
	public boolean userLogin(UserRegisterModel userRegisterModel) {
		UserRegisterModel userReg = userRepository.findByUsername(userRegisterModel.getUsername());
		if(userReg != null && userReg.getPassword().equals(userRegisterModel.getPassword())){
			return true;
		} else {
			return false;
		}
	}
}
