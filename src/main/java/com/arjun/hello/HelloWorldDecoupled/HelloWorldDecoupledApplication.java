package com.arjun.hello.HelloWorldDecoupled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.arjun.hello.HelloWorldDecoupled.other.MessageRenderer;

@SpringBootApplication
public class HelloWorldDecoupledApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldDecoupledApplication.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
		
		
	}

}
