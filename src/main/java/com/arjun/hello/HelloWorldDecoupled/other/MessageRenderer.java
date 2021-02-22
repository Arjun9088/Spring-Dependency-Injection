package com.arjun.hello.HelloWorldDecoupled.other;

public interface MessageRenderer {
	
	void render();
	
	void setMessageProvider(MessageProvider messageProvider);
	
	MessageProvider getMessageProvider();

}
