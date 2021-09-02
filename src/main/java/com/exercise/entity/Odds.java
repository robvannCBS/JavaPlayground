package com.exercise.entity;

import com.exercise.value.OddsType;

public class Odds {
	private int id;
	private int value;
	private OddsType type;
	private int expertId;

	public Odds(int id, int value, OddsType type, int expertId){
		this.id = id;
		this.value = value;
		this.type = type;
		this.expertId = expertId;
	}
	public int getId() {
		return id;
	}

	public int getValue() {
		return value;
	}

	public OddsType getType() {
		return type;
	}

	public int getExpertId() {
		return expertId;
	}
}
