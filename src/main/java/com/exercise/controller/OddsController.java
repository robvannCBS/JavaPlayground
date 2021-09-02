package com.exercise.controller;

import com.exercise.dto.OddsDTO;
import com.exercise.service.OddsService;

public class OddsController {
	OddsService oddsService;

	public OddsController(OddsService oddsService) {
		this.oddsService = oddsService;
	}

	public OddsDTO getOddsById(int id) {
		return oddsService.getOddsById(id);
	}
}
