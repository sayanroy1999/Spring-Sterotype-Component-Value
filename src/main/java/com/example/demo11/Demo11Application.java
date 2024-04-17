package com.example.demo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo11Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo11Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=context.getBean("ob", Student.class);
		System.out.println(student);

	}

}
