package com.aayu.pkg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld HelloWorld()
	{
		return new HelloWorld();
	}

}
