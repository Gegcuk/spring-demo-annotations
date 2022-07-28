package ru.gegcuk.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("I'm inside default constructor");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("I'm in predestroy method");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("I'm in starting method");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("I'm inside setter");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("I'm inside doMyCrazyStuff()");
//		this.fortuneService = fortuneService;
//	}

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
