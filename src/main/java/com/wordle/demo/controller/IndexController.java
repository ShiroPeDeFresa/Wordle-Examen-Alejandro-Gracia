package com.wordle.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wordle.demo.model.Guess;
import com.wordle.demo.service.GuessService;


@Controller
public class IndexController {
	
	
	public GuessService guessService;

	@Autowired
	public IndexController(GuessService guessService) {
		this.guessService = guessService;
	}

	
	@GetMapping("/")
	public ModelAndView goToIndexPage() {
		ModelAndView modelAndView = new ModelAndView("index");
		Guess guess = new Guess(guessService.getPalabraCorrecta());
		modelAndView.addObject("guess", guess);
		return modelAndView;
	}	
	
	@PostMapping("/guessPalabra")
	public ModelAndView intentoAcierto(@ModelAttribute("guess") Guess guess) {
		System.out.println(guess.palabra);

		ModelAndView modelAndView = new ModelAndView("index");
		String resultado = guessService.comprobar(guess.palabra);
		modelAndView.addObject("resultado", resultado);
		return modelAndView;
	}
	


}
