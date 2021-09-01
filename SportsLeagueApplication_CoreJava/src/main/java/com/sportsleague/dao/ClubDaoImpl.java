package com.sportsleague.dao;

import java.util.ArrayList;
import java.util.List;

import com.sportsleague.exception.CustomException;
import com.sportsleague.model.Club;

public class ClubDaoImpl implements ClubDaoIntf {

	@Override
	public Club findClubById(List<Club> clubs, int clubIdKey) throws CustomException {
		
		Club tempClub = null;
		
		for (Club club : clubs) {
			
			if (club.getClubId() == clubIdKey)
			{
				tempClub = club;
			} 
			
		}
		
		return tempClub;
	}

	@Override
	public List<Club> findClubByName(List<Club> clubs, String clubNameKey) throws CustomException {
		
		List<Club> tempClubs = new ArrayList<>();
		
		for (Club club : clubs) {
			
			if (club.getClubName().equals(clubNameKey))
			{
				tempClubs.add(club);
			}
			
		}
		
		return tempClubs;
	}

}
