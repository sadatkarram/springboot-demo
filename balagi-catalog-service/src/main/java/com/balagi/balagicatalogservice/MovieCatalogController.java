package com.balagi.balagicatalogservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.balagi.balagicatalogservice.model.CatalogItem;
import com.balagi.balagicatalogservice.model.Movie;
import com.balagi.balagicatalogservice.model.Rating;
import com.balagi.balagicatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	WebClient.Builder webClientBuilder;

	@GetMapping("/{userId}")
	public List<CatalogItem> getCatalog(String userId) {

		UserRating userRatings= webClientBuilder.build()
				.get()
				.uri("http://localhost:8883/ratings/user/user1")
				.retrieve()
				.bodyToMono(UserRating.class)
				.block();
		List<Rating> ratings =userRatings.getRatings();

		return ratings.stream().map(rating -> {
			// Movie movie = restTemplate.getForObject("http://localhost:8882/movies/Mov1",
			// Movie.class);
			Movie movie = webClientBuilder.build().get().uri("http://localhost:8882/movies/Mov1").retrieve()
					.bodyToMono(Movie.class).block();

			return new CatalogItem(movie.getName(), "DescSample", rating.getRating());
		}).collect(Collectors.toList());

		// return Collections.singletonList(new CatalogItem("Transformers", "Test", 4));
	}

}
