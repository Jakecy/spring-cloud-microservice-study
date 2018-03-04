package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import ribbonCofig.MyRibbonConfiguration;


@SpringBootApplication
@EnableDiscoveryClient
@Configuration
@RibbonClient(name = "microservice-user", configuration = MyRibbonConfiguration.class)
public class MovieRibbonApplication {

	  @Bean
	  @LoadBalanced
	  public RestTemplate restTemplate() {
	    return new RestTemplate();
	  }
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MovieRibbonApplication.class, args);
		System.out.println("........MovieRibbon微服务启动完成!!!......");
	}

}
