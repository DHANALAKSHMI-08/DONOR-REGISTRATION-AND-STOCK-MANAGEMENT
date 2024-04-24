package com.cts.blood.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.blood.model.SupplyModel;


@Repository
	public interface SupplyRepository extends JpaRepository<SupplyModel, Long> {
	    Optional<SupplyModel> findByType(String type);
	}


