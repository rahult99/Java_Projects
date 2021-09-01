package com.education.dao;

import com.education.model.University;

public class UniversityDaoImpl implements UniversityDaoIntf {

	@Override
	public University findUniversityById(University[] universities, int uniIdKey) {
		
		University tempUniversity = null;
		
		for (int i = 0; i < universities.length; i++) {
			
			if (universities[i].getUniversityId() == uniIdKey)
			{
				tempUniversity = universities[i];
			}
			
		}
		
		return tempUniversity;
	}

	@Override
	public University[] findUniversityByName(University[] universities, String uniNameKey) {
		
		University[] tempUniversities = new University[universities.length];
		
		for (int i = 0; i < universities.length; i++) {
			
			if (universities[i].getUniversityName().equals(uniNameKey))
			{
				tempUniversities[i] = universities[i];
			}
			
		}
		
		return tempUniversities;
	}

}
