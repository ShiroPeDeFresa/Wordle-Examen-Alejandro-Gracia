package com.wordle.demo.service;

import org.springframework.stereotype.Component;

@Component
public class GuessServiceEasy extends AbstractGuessService {
	
	public GuessServiceEasy() {
		palabraCorrecta = "miau";
	}

}
