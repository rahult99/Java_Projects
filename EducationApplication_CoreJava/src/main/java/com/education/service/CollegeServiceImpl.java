package com.education.service;

import com.education.dao.CollegeDaoImpl;
import com.education.dao.CollegeDaoIntf;
import com.education.model.College;
import com.education.model.University;

public class CollegeServiceImpl implements CollegeServiceIntf {

	@Override
	public College findCollegeById(University[] universities, int collegeIdKey) {
		
		College tempCollege = null;
		
		if (universities != null)
		{
			CollegeDaoIntf collegeDaoIntf = new CollegeDaoImpl();
			
			tempCollege = collegeDaoIntf.findCollegeById(universities, collegeIdKey);
		}
		
		return tempCollege;
	}

	@Override
	public College[] findCollegeByName(University[] universities, String collegeNameKey) {
		
		College[] tempColleges = null;
		
		if (universities != null)
		{
			CollegeDaoIntf collegeDaoIntf = new CollegeDaoImpl();
			
			tempColleges = collegeDaoIntf.findCollegeByName(universities, collegeNameKey);
		}
		
		return tempColleges;
	}

}
