package com.sportsleague.model;

/**
 * 
 * @author Rahul
 *
 */

public class Player {

	private int playerId;
	private String playerName;
	private int playerJerseyNumber;
	private int playerAge;
	private String playerPosition;
	private Club club;

	// Non-Parameterized Constructor
	public Player() {
		super();
	}

	// Parameterized Constructor
	public Player(int playerId, String playerName, int playerJerseyNumber, int playerAge, String playerPosition) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerJerseyNumber = playerJerseyNumber;
		this.playerAge = playerAge;
		this.playerPosition = playerPosition;
		//this.club = club;
	}

	// Getters and Setters
	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerJerseyNumber() {
		return playerJerseyNumber;
	}

	public void setPlayerJerseyNumber(int playerJerseyNumber) {
		this.playerJerseyNumber = playerJerseyNumber;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerJerseyNumber="
				+ playerJerseyNumber + ", playerAge=" + playerAge + ", playerPosition=" + playerPosition + ", club="
				+ club + "]";
	}
	
	

}
