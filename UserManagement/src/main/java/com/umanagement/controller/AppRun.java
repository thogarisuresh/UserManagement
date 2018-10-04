package com.umanagement.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppRun { /*extends  SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AppRun.class);
	}*/

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AppRun.class, args);
	}
	
	
	
}
