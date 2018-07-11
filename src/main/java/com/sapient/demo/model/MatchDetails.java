package com.sapient.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="matchdetails")
public class MatchDetails {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	@JsonIgnore
	private Integer identifier;
	
	@NotNull
	@Column(name="team1")
	private String team1;

	@NotNull
	@Column(name="team2")
	private String team2;
	

	@NotNull
	@Column(name="result")
	private String result;
	
	@NotNull
	@Column(name="winningteamscore")
	private String winningTeamScore;
	
	@NotNull
	@Column(name="rotatedscore")
	private String rotatedScore;

	

	public Integer getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getWinningTeamScore() {
		return winningTeamScore;
	}

	public void setWinningTeamScore(String winningTeamScore) {
		this.winningTeamScore = winningTeamScore;
	}

	public String getRotatedScore() {
		return rotatedScore;
	}

	public void setRotatedScore(String rotatedScore) {
		this.rotatedScore = rotatedScore;
	}
	
	
	

}
