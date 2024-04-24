package com.cts.blood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.blood.model.UserLoginModel;
import com.cts.blood.model.UserRegisterModel;
import com.cts.blood.services.UserLoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;




@Controller
public class UserController {
	
	@Autowired
	private UserLoginService userLoginService;
	
	@GetMapping("/userLog")
	public String UserLogin(@Valid Model model) {
		System.out.println("inside login");
		model.addAttribute("user", new UserLoginModel());
		return "userLogin";
	}
	
	@PostMapping("/userLog")
	public String loginSubmit(@Valid @ModelAttribute UserRegisterModel userRegisterModel, BindingResult bindingResult) 
	{
		System.out.println("inside Post login");
		boolean success = userLoginService.userLogin(userRegisterModel);
		System.out.println(success);
		String res = "";
		if (bindingResult.hasErrors())
		{
			System.out.println(bindingResult);
			res = "userLogin";
		}else if(success)
		{
			res = "redirect:/user/homepage";
		}else 
		{
			res = "redirect:/userLog";
		}
		return res;
	}
	
	
	

    @RequestMapping(value = {"/logoutdonor"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
        
      
        return "redirect:/userLog";
    }
 
	
	
	
	
}
