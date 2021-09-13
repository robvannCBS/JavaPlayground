package com.exercise.dto;

import com.exercise.entity.Odds;
import com.exercise.value.OddsType;

public class OddsDTO {
	private int id;
	private int value;
	private OddsType type;

	public OddsDTO(Odds odds){
		this.id = odds.getId();
		this.value = odds.getValue();
		this.type = odds.getType();
	}

	@Override
	public String toString() {
		return "OddsDTO{" +
				"id=" + id +
				", value=" + value +
				", type=" + type +
				'}';
	}
}
