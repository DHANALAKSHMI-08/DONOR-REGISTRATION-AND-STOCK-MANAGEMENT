package com.cts.blood.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.blood.model.BloodGroupModel;
import com.cts.blood.services.BloodGroupService;

@Controller
public class BloodGroupController {

    @Autowired
    private BloodGroupService bloodGroupService;
    
    
    @GetMapping("/donate")
    public String DonateNow(Model model) {
    	BloodGroupModel blood = new BloodGroupModel();
    	model.addAttribute("donates", blood);
    	return "donate";
    }

    @PostMapping("/donate")
    public String donate(@RequestParam String type, @RequestParam int units, BloodGroupModel bloodGroupModel) {
    	bloodGroupService.donateBlood(type, units);
    	//method call then value
//        bloodRepo.save(bloodGroupModel);
        return "redirect:/user/homepage";
    }
}
