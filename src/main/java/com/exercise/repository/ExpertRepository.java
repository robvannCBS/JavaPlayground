package com.exercise.repository;

import com.exercise.entity.Expert;

public class ExpertRepository {
	public Expert findExpertById(int expertId){
		return new Expert(123, "Lee Roy", "Jenkins");
	}
}
