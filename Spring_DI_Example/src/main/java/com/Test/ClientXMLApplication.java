package com.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
				MyXMLApplication app=context.getBean(MyXMLApplication.class);
				app.processMessage("Hii Ramesh", "ramesh@gmail.com");
				context.close();
		// TODO Auto-generated method stub

	}

}