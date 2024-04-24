package com.cts.blood.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.blood.model.BloodGroupModel;


public interface BloodGroupRepository extends JpaRepository<BloodGroupModel, Long>{
	Optional<BloodGroupModel> findByType(String type);
}