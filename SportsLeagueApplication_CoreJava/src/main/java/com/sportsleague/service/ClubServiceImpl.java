package com.sportsleague.service;

import java.util.List;

import com.sportsleague.dao.ClubDaoImpl;
import com.sportsleague.dao.ClubDaoIntf;
import com.sportsleague.exception.CustomException;
import com.sportsleague.model.Club;

public class ClubServiceImpl implements ClubServiceIntf {

	@Override
	public Club findClubById(List<Club> clubs, int clubIdKey) throws CustomException {
		
		Club tempClub = null;
		
		if (clubs != null) 
		{	
			int idKeyLength = String.valueOf(clubIdKey).length();
			
			if (idKeyLength == 4) 
			{
				ClubDaoIntf clubDaoIntf = new ClubDaoImpl();
				
				tempClub = clubDaoIntf.findClubById(clubs, clubIdKey);
			} 
			else
			{
				throw new CustomException("Please Enter 4-Digit Club ID");
			}
			
		}
		else 
		{
			throw new CustomException("Data is Empty.");
		}
		
		return tempClub;
	}

	@Override
	public List<Club> findClubByName(List<Club> clubs, String clubNameKey) throws CustomException {
		
		List<Club> tempClubs = null;
		
		if (clubs != null)
		{
			
			ClubDaoIntf clubDaoIntf = new ClubDaoImpl();
			
			tempClubs = clubDaoIntf.findClubByName(clubs, clubNameKey);
			
		}
		else 
		{
			throw new CustomException("Data is Empty.");
		}
		
		return tempClubs;
	}

}
