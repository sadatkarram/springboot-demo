package com.balagi.balagicatalogservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.balagi.balagicatalogservice.model.Rating;
import com.balagi.balagicatalogservice.model.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class MovieRating {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "getFallbackRating", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
			@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000") })
	public UserRating getRating() {
		UserRating userRatings = restTemplate.getForObject("http://balagi-rating-service/rating/user/User1",
				UserRating.class);
		return userRatings;
	}

	private UserRating getFallbackRating() {
		UserRating userRating = new UserRating();
		userRating.setRatings(Arrays.asList(new Rating("0", "0")));
		return userRating;

	}

}
