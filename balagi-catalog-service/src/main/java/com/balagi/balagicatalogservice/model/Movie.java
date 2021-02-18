package com.balagi.balagicatalogservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie implements Serializable{

	private static final long serialVersionUID = -833980366579719009L;
	
	private String name;
	private String desc;
	
	public Movie(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public Movie() {
		super();
	}
	
	
}
