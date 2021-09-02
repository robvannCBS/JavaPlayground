package com.exercise.dto;

import com.exercise.entity.Expert;
import com.exercise.entity.Odds;
import com.exercise.value.OddsType;

public class OddsDTO {
	private int id;
	private int value;
	private OddsType type;
	private Expert expert;

	public OddsDTO(Odds odds, Expert expert){
		this.id = odds.getId();
		this.value = odds.getValue();
		this.type = odds.getType();
		this.expert = expert;
	}

	@Override
	public String toString() {
		return "OddsDTO{" +
				"id=" + id +
				", value=" + value +
				", type=" + type +
				", expert=" + expert +
				'}';
	}
}
