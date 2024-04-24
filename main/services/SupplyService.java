package com.cts.blood.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.blood.model.BloodGroupModel;
import com.cts.blood.model.SupplyModel;
import com.cts.blood.repository.BloodGroupRepository;
import com.cts.blood.repository.SupplyRepository;



@Service
public class SupplyService {
    @Autowired
    private SupplyRepository supplyRepository;
    @Autowired
    private BloodGroupRepository bloodGroupRepository;

    public void supplyBlood(String type, int units) {
        type = type.toUpperCase(); // convert type to uppercase
        BloodGroupModel bloodGroup = bloodGroupRepository.findByType(type)
            .orElseThrow(() -> new IllegalArgumentException("No blood group found with type"));
        if (bloodGroup.getUnits() < units) {
            throw new IllegalArgumentException("Not enough units in stock for blood group " );
        }
        bloodGroup.setUnits(bloodGroup.getUnits() - units);
        bloodGroupRepository.save(bloodGroup);
//If it is not persent object(add)
        SupplyModel supply = new SupplyModel();
        supply.setType(type);
        supply.setUnits(units);
        supplyRepository.save(supply);
    }
}

