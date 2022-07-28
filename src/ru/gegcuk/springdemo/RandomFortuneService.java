package ru.gegcuk.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	String[] fortunes = {"Beware of the wolfs", "Diligence is the mother of good lick", "the journey is the reward"};
 
	@Override
	public String getFortune() {
		return fortunes[(int) Math.round(Math.random() * 3)];
	}

}
