package com.cts.blood.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.cts.blood.model.Login;
import com.cts.blood.repository.LoginRepository;
 
 
 
@Service
public class LoginService {
    @Autowired
    private LoginRepository repo;
    
    
  public Login login(String username, String password) {
      Login user = repo.findByUsernameAndPassword(username,password);
      return user;
  }

 
}
