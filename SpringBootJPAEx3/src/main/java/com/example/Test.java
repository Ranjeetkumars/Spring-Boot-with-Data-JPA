package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test {
	
	@Bean
	public Demo  demo() {
		Demo a1 = new Demo();
		return  a1;
	}

}





