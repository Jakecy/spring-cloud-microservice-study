package com.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User2Controller {

	@RequestMapping(value = "/user/query", method = RequestMethod.GET)
	public String query() {
		System.out.println("........userservice-2-called.....");
		return "user_query_result";
	}
}
