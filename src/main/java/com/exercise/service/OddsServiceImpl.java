package com.exercise.service;

import com.exercise.dto.OddsDTO;
import com.exercise.entity.Odds;
import com.exercise.repository.OddsRepository;

public class OddsServiceImpl implements OddsService{

	private OddsRepository oddsRepository;

	public OddsServiceImpl(OddsRepository oddsRepository) {
		this.oddsRepository = oddsRepository;
	}

	@Override
	public OddsDTO getOddsById(int id) {
		Odds odds = oddsRepository.findById(id);

		return new OddsDTO(odds);
	}
}
