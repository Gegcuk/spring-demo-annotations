package ru.gegcuk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class);
		Coach poloCoach = context.getBean("poloCoach", Coach.class);
		
		//call a method on bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(poloCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
