package com.wordle.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Hard")
public class GuessServiceHard extends AbstractGuessService {
	
	public GuessServiceHard() {
		palabraCorrecta = "miaumiau";
		longitud=8;
		intentos=5;
	}

}
