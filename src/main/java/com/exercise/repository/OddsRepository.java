package com.exercise.repository;

import com.exercise.entity.Odds;
import com.exercise.value.OddsType;

public class OddsRepository {

	public Odds findById(int id) {
		return new Odds(1, -200, OddsType.MONEY_LINE, 123);
	}
}
