package com.education.dao;

import com.education.model.College;
import com.education.model.University;

public interface CollegeDaoIntf {
	
	public abstract College findCollegeById(University[] universities, int collegeIdKey );
	
	public abstract College[] findCollegeByName(University[] universities, String collegeNameKey);

}
