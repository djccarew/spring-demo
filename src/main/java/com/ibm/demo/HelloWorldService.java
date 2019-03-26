package com.ibm.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
 
	public String sayHelloWorld() {
		return "Hello World !";
	}
 
}
