package com.wordle.demo.model;

public class Guess {
	
	public String palabra;

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public Guess(String palabra) {
		super();
		this.palabra = palabra;
	}

	public Guess() {
	}
	
	

}
