package com.cg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.pojo.organisation.Organisation;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organisation organisation = (Organisation) context.getBean("organisation");
		organisation.toString();
		
		
		

	}

}
