package com.balagi.balagiratingservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balagi.balagiratingservice.model.Rating;

@RestController
@RequestMapping("/rating")
public class RatingServiceControler {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("MovId", "4");
	}

	@GetMapping("/user/{iserId}")
	public List<Rating> getUserRating(@PathVariable("movieId") String movieId) {
		List<Rating> ratings = Arrays.asList(new Rating("Mov1", "2"), new Rating("Mov2", "3"), new Rating("Mov3", "4"),
				new Rating("Mov4", "5"));
		return ratings;
	}

}
