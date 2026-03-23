package com.capgemini.springboot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class Demo {
	
	@RequestMapping("/")
//	@ResponseBody
	public String show() {
		return "Hello World!";
	}
	
}
