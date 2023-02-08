package com.wordle.demo.service;

import java.util.List;

public interface GuessService {

	String comprobar(String palabra);
	
	String getPalabraCorrecta();
	
	String limiteIntentos();
	
	List<String> getPalabrasUsadas();
}
