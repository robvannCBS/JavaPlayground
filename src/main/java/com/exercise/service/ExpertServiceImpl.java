package com.exercise.service;

import com.exercise.entity.Expert;
import com.exercise.repository.ExpertRepository;

public class ExpertServiceImpl implements ExpertService {
	private ExpertRepository repository;
	public ExpertServiceImpl(ExpertRepository repository){
		this.repository = repository;
	}

	@Override
	public Expert getExpertById(int id) {
		return repository.findExpertById(id);
	}
}
