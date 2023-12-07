package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello World!</b>";
	}
	
	/*@GetMapping("/bsm")
	public List<String> bsm() {
        return Arrays.asList"<b>Persistência</b>", 
        		"<b>Mentalidade de Crescimento</b>",
        		"<b>Responsabilidade Pessoal</b>"; 
	} */
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>Lista de BSM’s da Generation:</b> <br />Persistência<br />Mentalidade de Crescimento<br />Responsabilidade Pessoal<br />"
	+ "Orientação ao Futuro<br />Trabalho em Equipe<br />Comunicação<br />Proatividade<br />";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "<b>Objetivos de Aprendizagem da Semana:</b> Aprender e Praticar o Spring, MySQL e o Insomnia";
	}
}
