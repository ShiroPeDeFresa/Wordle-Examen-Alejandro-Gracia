package com.wordle.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public abstract class AbstractGuessService implements GuessService {

	String palabraCorrecta;
	int longitud;
	int intentos;
	int intentosGastados;

	List<String> palabrasProbadas = new ArrayList<String>();
	
	public List<String> getPalabrasUsadas(){
		return this.palabrasProbadas;	
		}
	
	public String getPalabraCorrecta() {
		return this.palabraCorrecta;
	}
	
	public String comprobar(String palabra) {
		intentosGastados++;
		palabrasProbadas.add(palabra);
		if (palabra.length()>longitud || palabra.length()<longitud) {
			return "la palabra insertada debe tener " + longitud + " letras";
		}
		String resultado="";
		for (int x=0; x<palabra.length(); x++) {
			if (x > intentos) {
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
			return resultado + "intento " + intentosGastados;
		}
	}
	
	public String limiteIntentos() {
		if (intentosGastados == intentos) {
			return "Has perdido, el numero Maximo de intentos era " + (intentos + 1) + " y la palabra correcta era " + palabraCorrecta;
		}
		else {
			return "prosigue";
		}
	}
}
