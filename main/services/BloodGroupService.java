package com.cts.blood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.blood.model.BloodGroupModel;
import com.cts.blood.repository.BloodGroupRepository;



@Service
public class BloodGroupService {

	 @Autowired
	    private BloodGroupRepository bloodGroupRepository;

	 public void donateBlood(String type, int units) {
	        type = type.toUpperCase(); 
	        BloodGroupModel bloodGroup = bloodGroupRepository.findByType(type)
	            .orElse(new BloodGroupModel(type));//it creates a new BloodGroupModel with the given type.
	        bloodGroup.setUnits(bloodGroup.getUnits() + units);
	        bloodGroupRepository.save(bloodGroup);
	    }
}
