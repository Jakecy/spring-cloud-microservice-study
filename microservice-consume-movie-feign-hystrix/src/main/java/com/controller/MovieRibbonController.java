package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myfeignClient.UserClient;



@RestController
public class MovieRibbonController {
	
	
	/**
	 * 现在让movie微服务利用feign来调用userservice
	 * @return
	 */

	//注入UserClient
	@Autowired
	private  UserClient  userClient;
	
	
	/**
	 * 使用userClient来完成服务调用
	 * @return
	 */
	
	@RequestMapping(value = "/movie-ribbon/queryuser", method = RequestMethod.GET)
	public String query() {
		System.out.println("....call movieRibbon....");
		String result = userClient.query();
		return result;
	}
}
