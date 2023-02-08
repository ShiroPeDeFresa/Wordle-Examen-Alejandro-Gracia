package com.wordle.demo.service;

import org.springframework.stereotype.Service;

@Service
public abstract class AbstractGuessService implements GuessService {

	String palabraCorrecta;
	int longitud;
	int intentos;
	
	public String getPalabraCorrecta() {
		return this.palabraCorrecta;
	}
	
	public String comprobar(String palabra) {
		if (palabra.length()>longitud || palabra.length()<longitud) {
			return "la palabra insertada debe tener " + longitud + " letras";
		}
		String resultado="";
		for (int x=0; x<palabra.length(); x++) {
			if (x > intentos) {
				return "Has perdido, el numero Maximo de intentos era" + intentos + " y la palabra correcta era " + palabraCorrecta;
			}
			if(palabra.charAt(x) == palabraCorrecta.charAt(x)) {
				resultado = resultado + palabra.charAt(x);
			}
			else if(palabra.charAt(x) != palabraCorrecta.charAt(x)) {
				resultado = resultado + "_";
			}

		}

		if(palabra.equals(palabraCorrecta)) {
			return "Correcto";
		}
		else {
			return resultado;
		}
	}
}
