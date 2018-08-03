package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class ConsoleMessageRenderer implements MessageRenderer {

	private MessageProvider provider;

	@Override
	public void render() {
		System.out.println(provider.getMessage() + " On Console");
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}
}
