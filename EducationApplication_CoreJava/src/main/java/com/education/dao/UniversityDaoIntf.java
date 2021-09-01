package com.education.dao;

import com.education.model.University;

public interface UniversityDaoIntf {
	
	public abstract University findUniversityById(University[] universities, int uniIdKey);
	
	public abstract University[] findUniversityByName(University[] universities, String uniNameKey);

}
