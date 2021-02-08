package com.balagi.balagicatalogservice.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rating implements Serializable{
	
	private static final long serialVersionUID = 6947995051740666777L;
	
	private String movieId;
	private String rating;

	public Rating(String movieId, String rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public Rating() {
		super();
	}
	
	
}
