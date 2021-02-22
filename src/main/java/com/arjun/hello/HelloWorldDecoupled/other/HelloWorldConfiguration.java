package com.arjun.hello.HelloWorldDecoupled.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public MessageProvider provider()
	{
		return new HelloWorldMessageProvider();
	}
	
	@Bean
	public MessageRenderer renderer()
	{
		MessageRenderer msr =  new StandardOutMessageRenderer();
		msr.setMessageProvider(provider());
		return msr;
	}
	

}
