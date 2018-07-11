package com.sapient.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.demo.model.MatchDetails;
import com.sapient.demo.repository.MatchDetailsRepository;

@RestController
public class MatchDetailsController {
	
	private MatchDetailsRepository matchDetailsRepository;

	@Autowired
	public MatchDetailsController(MatchDetailsRepository matchDetailsRepository) {
		super();
		this.matchDetailsRepository = matchDetailsRepository;
	}
	
	@RequestMapping(path="/cricketScores",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<MatchDetails> getMatch(@RequestParam Integer matchId){
		MatchDetails matchDetails = matchDetailsRepository.findByIdentifier(matchId);
	
		return ResponseEntity.status(HttpStatus.OK).body(matchDetails);
	}

}
