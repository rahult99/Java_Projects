package com.education.service;

import com.education.dao.UniversityDaoImpl;
import com.education.dao.UniversityDaoIntf;
import com.education.model.University;

public class UniversityServiceImpl implements UniversityServiceIntf {

	@Override
	public University findUniversityById(University[] universities, int uniIdKey) {
		
		University tempUniversity = null;
		
		if(universities != null) 
		{
			UniversityDaoIntf universityDaoIntf = new UniversityDaoImpl();
			
			tempUniversity = universityDaoIntf.findUniversityById(universities, uniIdKey);
		}
		
		return tempUniversity;
	}

	@Override
	public University[] findUniversityByName(University[] universities, String uniNameKey) {
		
		University[] tempUniversities = null;
		
		if (universities != null)
		{
			UniversityDaoIntf universityDaoIntf = new UniversityDaoImpl();
			
			tempUniversities = universityDaoIntf.findUniversityByName(universities, uniNameKey);
		}
		
		return tempUniversities;
	}

}
