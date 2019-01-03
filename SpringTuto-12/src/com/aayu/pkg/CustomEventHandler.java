package com.aayu.pkg;


import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomerEvent> {

	@Override
	public void onApplicationEvent(CustomerEvent event) {
		
		System.out.println(event.toString());		
	}	
}
