package com.cts.blood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.blood.model.UserRegisterModel;

public interface UserRepository extends JpaRepository<UserRegisterModel, Long>{

	UserRegisterModel findByUsername(String username);
	

}
