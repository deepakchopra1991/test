package com.sapient.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.demo.model.MatchDetails;

@Repository
public interface MatchDetailsRepository extends JpaRepository<MatchDetails,Integer>{
	
	MatchDetails findByIdentifier(Integer id);
	

}
