package com.education.service;

import com.education.model.University;

public interface UniversityServiceIntf {

	public abstract University findUniversityById(University[] universities, int uniIdKey);

	public abstract University[] findUniversityByName(University[] universities, String uniNameKey);

}
