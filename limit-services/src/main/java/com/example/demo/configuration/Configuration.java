package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
    private int maxium;
    private int minimum;
    
	public int getMaxium() {
		return maxium;
	}
	public void setMaxium(int maxium) {
		this.maxium = maxium;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	public Configuration(int maxium, int minimum) {
		super();
		this.maxium = maxium;
		this.minimum = minimum;
	}
    
	
    
}
