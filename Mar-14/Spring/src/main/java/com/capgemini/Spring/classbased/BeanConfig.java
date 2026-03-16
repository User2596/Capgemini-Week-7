package com.capgemini.Spring.classbased;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.capgemini.Spring.classbased")
public class BeanConfig {
	
	@Bean
	public List<Integer> listProvider() {
		return List.of(1, 2, 3, 4, 5, 6);
	}
	
	@Bean(name = "hero")
	public Bike bikeProvider() {
		Bike bike = new Bike();
		bike.setBikeId(12);
		bike.setBikeName("Hero Xtreme");
		bike.setColour("Green");
		
		return bike;
	}
	
}
