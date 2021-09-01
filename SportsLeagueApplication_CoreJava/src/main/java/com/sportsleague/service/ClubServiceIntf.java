package com.sportsleague.service;

import java.util.List;

import com.sportsleague.exception.CustomException;
import com.sportsleague.model.Club;

public interface ClubServiceIntf {

	public abstract Club findClubById(List<Club> clubs, int clubIdKey) throws CustomException;

	public abstract List<Club> findClubByName(List<Club> clubs, String clubNameKey) throws CustomException;

}
