package com.arjun.hello.HelloWorldDecoupled.other;

public class HelloWorldMessageProvider implements MessageProvider 
{

	@Override
	public String getMessage() {
		return "Hello world";
	}

}
