package com.capgemini.Spring.classbased;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PojoClass {

	@Autowired
	@Qualifier("hero")
	private Bike bike;
	
	@Autowired
	private People people;
	
	@Autowired
	private List<People> peoples;

	@Override
	public String toString() {
		return "PojoClass [bike=" + bike + ", people=" + people + ", peoples=" + peoples + "]";
	}
	
}
