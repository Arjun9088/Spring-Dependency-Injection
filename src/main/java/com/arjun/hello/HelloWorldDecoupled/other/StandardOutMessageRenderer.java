package com.arjun.hello.HelloWorldDecoupled.other;

public class StandardOutMessageRenderer implements MessageRenderer
{

	private MessageProvider messageProvider;
	@Override
	public void render() {
		if(messageProvider == null)
		{
			throw new RuntimeException("You must set the message Provider property of the class" + StandardOutMessageRenderer.class.getName());
		}
		
		System.out.println(messageProvider.getMessage());
		
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}

}
