package com.balagi.balagicatalogservice.model;

import lombok.Data;

@Data
public class Rating {
	private String movieId;
	private String rating;

	public Rating(String movieId, String rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
}
