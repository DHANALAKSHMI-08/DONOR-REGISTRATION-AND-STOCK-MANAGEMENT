package com.cts.blood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.blood.model.UserRegisterModel;
import com.cts.blood.repository.UserRepository;






@Controller
public class HomeController {
	

	@Autowired
private UserRepository userRepo;
	

	

	@GetMapping("/")
	public String welcome() 
	{
		return "HomePage";
	}
	
	
     @GetMapping("/userLogin")
	    public String userLoginPage() {
	        return "userLogin";
	    }
	
	
	
	 @GetMapping("/userRegister")
	    public String userRegistrationPage(Model model) {
	       UserRegisterModel userModel = new UserRegisterModel();
	        model.addAttribute("userModel", userModel);
	        return "userRegister";
	    }

	   
	    @PostMapping("/userLogin")
	    public String saveUsers(UserRegisterModel userModel) {
	    	System.out.println(userModel);
	        userRepo.save(userModel);
	        return "redirect:/userLog";
	    }
	    
	    
	    @PostMapping("/admin/home")
	    public String adminhome()
	    {
	    	return "Index";
	    }
	    
	    

		@GetMapping("/Service")
		public String service() 
		{
			return "Service";
		}
		
		
		@GetMapping("/Aboutus")
		public String aboutus() 
		{
			return "Aboutus";
		}
		
		
		
		@GetMapping("/Contactus")
		public String contact()
		{
			return "Contact";
		}
		
		
		
	   
	

    
    
    

   

}
