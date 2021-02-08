package com.balagi.balagiratingservice.model;

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
}
