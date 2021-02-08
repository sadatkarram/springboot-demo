package com.balagi.balagiinfoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balagi.balagiinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class InfoServiceController {
	
	@GetMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie("Transformers","Mov1");
		
	}

}
