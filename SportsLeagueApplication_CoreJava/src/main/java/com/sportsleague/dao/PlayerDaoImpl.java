package com.sportsleague.dao;

import java.util.ArrayList;
import java.util.List;

import com.sportsleague.exception.CustomException;
import com.sportsleague.model.Club;
import com.sportsleague.model.Player;

public class PlayerDaoImpl implements PlayerDaoIntf {
	
	// ***************************************************************************************
	//	Search By ID
	@Override
	public Player findPlayerById(List<Club> clubs, int playerIdKey) throws CustomException {
		
		Player tempPlayer = null;
		
		for (Club club : clubs) {
			
			List<Player> players = club.getPlayers();
			
			for (Player player : players) {
				
				if (player.getPlayerId() == playerIdKey) 
				{
					tempPlayer = player;
				}
				
			}
			
		}
		
		return tempPlayer;
	}
	
	// ***************************************************************************************
	// Search By Name
	@Override
	public List<Player> findPlayerByName(List<Club> clubs, String playerNameKey) throws CustomException {
		
		List<Player> tempPlayers = new ArrayList<>();
		
		for (Club club : clubs) {
			
			List<Player> players = club.getPlayers();
			
			for (Player player : players) {
				
				if (player.getPlayerName().equals(playerNameKey)) 
				{
					tempPlayers.add(player);
				}
				
			}
			
		}
		
		return tempPlayers;
	}

}
