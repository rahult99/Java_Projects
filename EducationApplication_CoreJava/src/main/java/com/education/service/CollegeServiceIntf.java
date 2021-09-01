package com.education.service;

import com.education.model.College;
import com.education.model.University;

public interface CollegeServiceIntf {

	public abstract College findCollegeById(University[] universities, int collegeIdKey);

	public abstract College[] findCollegeByName(University[] universities, String collegeNameKey);

}
