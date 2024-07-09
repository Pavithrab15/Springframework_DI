package com.consumer;

import com.Services.MessageService;

public class MyXMLApplication {
	private MessageService service;


	public void setService(MessageService svc) {
		this.service = svc;
	}
	public boolean processMessage(String msg,String rec) {
		return this.service.sendMessage(msg,rec);
	}
	

}
