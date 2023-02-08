package com.wordle.demo.service;

import org.springframework.stereotype.Service;

@Service
public abstract class AbstractGuessService implements GuessService {

	String palabraCorrecta;
	
	public String getPalabraCorrecta() {
		return this.palabraCorrecta;
	}
	
	public String comprobar(String palabra) {
		for (int n = 0, n <palabra.length (), n + +) { 
			char c = str.charAt (n); 
			System.out.println (c); 
		}
		if(palabra.equals(palabraCorrecta)) {
			return "hola";
		}
		return "nop";
	}
}
