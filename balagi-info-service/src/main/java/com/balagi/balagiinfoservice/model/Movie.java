package com.balagi.balagiinfoservice.model;

import lombok.Data;

@Data
public class Movie {
	private String name;
	private String desc;
	
	public Movie(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
}
