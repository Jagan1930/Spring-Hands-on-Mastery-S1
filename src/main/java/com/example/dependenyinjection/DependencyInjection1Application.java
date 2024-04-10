package com.example.dependenyinjection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjection1Application {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyInjection1Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Product product = (Product) context.getBean("product");
		
		Battery battery = (Battery) context.getBean("battery");
		Disc disc = (Disc) context.getBean("disc");
		
		System.out.println(product);
		
		System.out.println(battery);
		System.out.println(disc);
		
		//((ClassPathXmlApplicationContext) context).close();
	}

}
