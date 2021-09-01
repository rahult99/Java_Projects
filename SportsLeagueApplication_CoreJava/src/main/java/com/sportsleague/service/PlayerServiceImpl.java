package com.sportsleague.service;

import java.util.List;

import com.sportsleague.dao.PlayerDaoImpl;
import com.sportsleague.dao.PlayerDaoIntf;
import com.sportsleague.exception.CustomException;
import com.sportsleague.model.Club;
import com.sportsleague.model.Player;

public class PlayerServiceImpl implements PlayerServiceIntf {
	
	// ***************************************************************************************
	// Search By ID
	@Override
	public Player findPlayerById(List<Club> clubs, int playerIdKey) throws CustomException {
		
		Player tempPlayer = null;
		
		if (clubs != null)
		{
			int idKeyLength = String.valueOf(playerIdKey).length();
			
			if (idKeyLength == 3) {
				
				PlayerDaoIntf playerDaoIntf = new PlayerDaoImpl();
				
				tempPlayer = playerDaoIntf.findPlayerById(clubs, playerIdKey);
			}
			else
			{
				throw new CustomException("Please Enter 3-Digit Player ID");
			}
			
			
		}
		else 
		{
			throw new CustomException("Data is Empty.");
		}
		
		return tempPlayer;
	}
	
	// ***************************************************************************************
	// Search By Name
	@Override
	public List<Player> findPlayerByName(List<Club> clubs, String playerNameKey) throws CustomException {
		
		List<Player> tempPlayers = null;
		
		if (clubs != null) 
		{
			
			PlayerDaoIntf playerDaoIntf = new PlayerDaoImpl();
			
			tempPlayers = playerDaoIntf.findPlayerByName(clubs, playerNameKey);
			
		}
		else 
		{
			throw new CustomException("Data is Empty.");
		}
		
		return tempPlayers;
	}

}
