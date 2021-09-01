package com.education.dao;

import com.education.model.College;
import com.education.model.University;

public class CollegeDaoImpl implements CollegeDaoIntf {

	@Override
	public College findCollegeById(University[] universities, int collegeIdKey) {
		
		College tempCollege = null;

		for (int i = 0; i < universities.length; i++) {
			
			College[] arrCollege = universities[i].getColleges();
			
			for (int j = 0; j < arrCollege.length; j++) {
				
				if (arrCollege[j].getCollegeId() == collegeIdKey) 
				{
					tempCollege = arrCollege[j];
				}
				
			}
			
		}
		
		return tempCollege;
	}

	@Override
	public College[] findCollegeByName(University[] universities, String collegeNameKey) {
		
		College[] tempColleges = new College[universities.length];
		
		int cIndex = 0;
		
		for (int i = 0; i < universities.length; i++) {
			
			College[] arrCollege = universities[i].getColleges();
			
			for (int j = 0; j < arrCollege.length; j++) {
				
				if (arrCollege[j].getCollegeName().equals(collegeNameKey))
				{
					tempColleges[cIndex] = arrCollege[j];
					cIndex += 1;
				}
				
			}
			
		}
		
		return tempColleges;
	}

}
