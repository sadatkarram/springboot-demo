package com.balagi.balagicatalogservice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balagi.balagicatalogservice.model.CatalogItem;
import com.balagi.balagicatalogservice.model.Movie;
import com.balagi.balagicatalogservice.model.Rating;
import com.balagi.balagicatalogservice.model.UserRating;
import com.balagi.balagicatalogservice.service.MovieInfo;
import com.balagi.balagicatalogservice.service.MovieRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	MovieInfo movieInfo;

	@Autowired
	MovieRating movieRating;

	@GetMapping("/{userId}")
	// @HystrixCommand(fallbackMethod = "getFallbackCatalog")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

		UserRating userRatings = movieRating.getRating();
		List<Rating> ratings = userRatings.getRatings();

		return ratings.stream()
				.map(rating -> {
						Movie movie = movieInfo.getInfo();
						return new CatalogItem(movie.getName(), "DescSample", rating.getRating());
				})
				.collect(Collectors.toList());
		// return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
	}

	// No longer needed as we add fallback on respective services it was calling
	public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") String userId) {
		return Arrays.asList(new CatalogItem("No Movie", "fallbackDescSample", "0"));

	}

}
