package com.sportsleague.dao;

import java.util.List;

import com.sportsleague.exception.CustomException;
import com.sportsleague.model.Club;
import com.sportsleague.model.Player;

public interface PlayerDaoIntf {
	
	public abstract Player findPlayerById(List<Club> clubs, int playerIdKey) throws CustomException;
	
	public abstract List<Player> findPlayerByName(List<Club> clubs, String playerNameKey) throws CustomException;

}
