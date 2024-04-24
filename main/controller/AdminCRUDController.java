package com.cts.blood.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cts.blood.model.UserRegisterModel;
import com.cts.blood.repository.BloodGroupRepository;
import com.cts.blood.repository.UserRepository;


@Controller
public class AdminCRUDController {
	
	@Autowired
	private BloodGroupRepository bloodRepo;

	@Autowired
	private UserRepository userRepository;
	
		
	@GetMapping("/DisplayUsers")
    public String displayDonorDetails(Model model)
	{
        List<UserRegisterModel> donorList = userRepository.findAll();
        model.addAttribute("donors", donorList);
        return "DisplayUsers";
	}
	
	
	
	
	

	@GetMapping("/viewBloodStock")
	public String DisplayStock(Model model) {
		model.addAttribute("viewstock", bloodRepo.findAll());
		return "DisplayStocks";
	}
	
	
	
	

}
		
	
