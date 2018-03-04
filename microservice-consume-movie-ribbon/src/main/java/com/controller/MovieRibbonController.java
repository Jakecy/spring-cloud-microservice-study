package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class MovieRibbonController {
	
	//在movie中注入RestTemplete已完成服务调用
	
	@Autowired
	private  RestTemplate  restTemplate;
	
	@RequestMapping(value = "/movie-ribbon/queryuser", method = RequestMethod.GET)
	public String query() {
		System.out.println("....call movieRibbon....");
		//return "movie";
		 return this.restTemplate.getForObject("http://microservice-user/user/query", String.class);
		// url=serviceID+requestmapping
		//return 	restTemplate.getForObject("http://localhost:7000/user/query", String.class);
	}
}
