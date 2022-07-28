package ru.gegcuk.springdemo;

import org.springframework.stereotype.Component;

@Component
public class poloCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run on horse for 1 hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
