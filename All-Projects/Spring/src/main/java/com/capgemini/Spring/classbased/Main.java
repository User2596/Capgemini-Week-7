package com.capgemini.Spring.classbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		People people = context.getBean(People.class);
		Bike bike = context.getBean("hero", Bike.class);
		PojoClass pojoClass = context.getBean(PojoClass.class);
		
		System.out.println(people);
		System.out.println(bike);
		System.out.println(pojoClass);
	}
	
}
