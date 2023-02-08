package com.wordle.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Easy")
public class GuessServiceEasy extends AbstractGuessService {
	
	public GuessServiceEasy() {
		palabraCorrecta = "miu";
		longitud=3;
		intentos=20;
	}

}
