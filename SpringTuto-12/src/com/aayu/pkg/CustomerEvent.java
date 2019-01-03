package com.aayu.pkg;

import org.springframework.context.ApplicationEvent;

public class CustomerEvent extends ApplicationEvent{

	public CustomerEvent(Object source)
	{
		super(source);
	}
	public String toString() {
		return "My custom Event";
	}
}
