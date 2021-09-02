package com.exercise.service;

import com.exercise.dto.OddsDTO;
import com.exercise.entity.Expert;
import com.exercise.entity.Odds;
import com.exercise.repository.OddsRepository;

public class OddsServiceImpl implements OddsService{

	private OddsRepository oddsRepository;
	private ExpertService expertService;

	public OddsServiceImpl(OddsRepository oddsRepository, ExpertService expertService) {
		this.oddsRepository = oddsRepository;
		this.expertService = expertService;
	}

	@Override
	public OddsDTO getOddsById(int id) {
		Odds odds = oddsRepository.findById(id);
		Expert expert = expertService.getExpertById(odds.getExpertId());
		return new OddsDTO(odds, expert);
	}
}
