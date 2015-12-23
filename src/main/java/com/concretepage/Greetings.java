package com.concretepage;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@Cacheable("greeting") 
public class Greetings {
	public Greetings()
	{
		System.out.println("COnstructor of Grretings");
	}
	
	public String getGreetings(String name){
		System.out.println("*********** NOT FROM CACHE");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("http-outbound-config.xml");
		GreetingGateway greetingGateway = context.getBean("greetingGateway", GreetingGateway.class);
		String reply = greetingGateway.greeting(name);
		System.out.println(reply);
		//Greeting greet =new Greeting(0, "");
		/*try {
			ObjectMapper objectMapper = new ObjectMapper();
			greet= objectMapper.readValue(reply, Greeting.class);
			System.out.println(greet.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}*/		
		return reply;
	}

}
