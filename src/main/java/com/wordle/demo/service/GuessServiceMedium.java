package com.wordle.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Medium")
public class GuessServiceMedium extends AbstractGuessService {
	
	public GuessServiceMedium() {
		palabraCorrecta = "miauu";
		longitud=5;
		intentos=10;
	}
}
