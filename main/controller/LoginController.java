package com.cts.blood.controller;
 
import java.util.Objects;
 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.cts.blood.model.Login;
import com.cts.blood.services.LoginService;
 
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
 
 
 
@Controller
public class LoginController {
    
    @Autowired
    private LoginService userService;
     
    
    @GetMapping("/login")
           
    public ModelAndView login() {
       ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Login());//new object 
        return mav;
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("user") Login user )
    {
        
        Login oauthUser = userService.login(user.getUsername(), user.getPassword());//method calling
        
 
       //check
        if(Objects.nonNull(oauthUser))
        {    
  
            return "redirect:/admin/home";
        
            
        } 
        else
        {
            return "redirect:/";
            
        
        }
 
}
    
    
    
  	@GetMapping("/admin/home")
  	public String adminpage()
  	{
  		
  		return "Index";
  	}
  	
    
    
  
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
        
      
        return "redirect:/login";
    }
   
}