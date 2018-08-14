package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class PDFMessageRenderer implements MessageRenderer {
	private MessageProvider provider;
	
	
	public PDFMessageRenderer(MessageProvider provider) {
	System.out.println("Arg Ctor Created for PDF");
		this.provider = provider;
	}

	public PDFMessageRenderer() {
	System.out.println("No arg Ctor created for PDF");
	}

	@Override
	public void render() {
		System.out.println(provider.getMessage() + " On PDF :)");
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;
	}
}
