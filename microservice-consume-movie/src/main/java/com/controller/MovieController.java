package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
	
	
	
	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public String query() {
		return "user_query_result";
	}
}
