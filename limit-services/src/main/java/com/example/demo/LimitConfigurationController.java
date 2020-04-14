package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.LimitConfiguration;
import com.example.demo.configuration.Configuration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitFromConfiguration()
	{
		return new LimitConfiguration(1000,1);
	}

}
