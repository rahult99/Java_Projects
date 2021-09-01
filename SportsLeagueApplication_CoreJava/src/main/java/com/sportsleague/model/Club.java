package com.sportsleague.model;

import java.util.List;

/**
 * 
 * @author Rahul
 *
 */

public class Club {
	
	private int clubId;
	private String clubName;
	private List<Player> players;
	
	// Non-Parameterized Constructor
	public Club() {
		super();
	}
	
	// Parameterized Constructor
	public Club(int clubId, String clubName, List<Player> players) {
		super();
		this.clubId = clubId;
		this.clubName = clubName;
		this.players = players;
	}
	
	// Getters and Setters
	public int getClubId() {
		return clubId;
	}

	public void setClubId(int clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return "Club [clubId=" + clubId + ", clubName=" + clubName + "]";
	}
	
	

}
