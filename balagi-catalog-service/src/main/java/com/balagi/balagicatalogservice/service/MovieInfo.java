package com.balagi.balagicatalogservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.balagi.balagicatalogservice.model.Movie;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class MovieInfo {

	@Autowired
	WebClient.Builder webClientBuilder;

	@HystrixCommand(fallbackMethod = "getFallbacktInfo", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000") })
	public Movie getInfo() {
		Movie movie = webClientBuilder.build().get().uri("http://balagi-info-service/movies/Mov1").retrieve()
				.bodyToMono(Movie.class).block();
		return movie;
	}

	private Movie getFallbacktInfo() {
		Movie movie = new Movie();
		movie.setDesc("Fallback Desc");
		movie.setName("Fallback movie name");
		return movie;

	}

}
