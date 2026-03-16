package com.capgemini.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
//
//    	  Employee employee = (Employee) context.getBean("employee2");
//        Student student = (Student) context.getBean("student1");
//        
//        System.out.println(student);
//        System.out.println(employee);
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("annotation-config.xml");
    	
    	User user = (User) context.getBean(User.class);
    	
    	System.out.println(user);
        
    }
}
