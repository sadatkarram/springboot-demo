package com.balagi.balagiratingservice.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRating implements Serializable {

	private static final long serialVersionUID = 5461074514956387278L;

	private List<Rating> ratings;

	public UserRating(List<Rating> ratings) {
		super();
		this.ratings = ratings;
	}

	public UserRating() {
		super();
	}
}
