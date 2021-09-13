package com.exercise;

import com.exercise.controller.OddsController;
import com.exercise.dto.OddsDTO;
import com.exercise.repository.OddsRepository;
import com.exercise.service.OddsService;
import com.exercise.service.OddsServiceImpl;

public class Application {

	static public void main(String[] args){
		OddsRepository oddsRepository = new OddsRepository();
		OddsService oddsService = new OddsServiceImpl(oddsRepository);
		OddsController controller = new OddsController(oddsService);

		OddsDTO dto = controller.getOddsById(1);

		System.out.println(dto);
	}
}
