package com.balagi.balagiconfigservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting}")
	private String greetingMsg;
	/*
	 * @Value("${my.default.value : DEFAULT-VALUE-CONTROLLER }") private String
	 * defaultValue;
	 * 
	 * @Value("${my.list.value}") private List<String> listValue;
	 */

	/*
	 * @Value("#{${my.map.value}}") private Map<String, Integer> mapValue;
	 */
	/*
	 * @Autowired TestDataSource testDataSource;
	 */
	@Autowired
	private Environment env;

	@GetMapping("/greeting")
	public String greeting() {
		return greetingMsg;
	}

	/*
	 * @GetMapping("/envdetails") public String envdetails() { return
	 * env.getProperty("spring.profiles.active"); //return env.toString(); }
	 */

}
