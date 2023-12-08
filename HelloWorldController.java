package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsms")
	public String bsms() {
		return "Orientação ao Futuro/n"
				+ "Responsabilidade Pessoal/n"
				+ "Mentalidade de Crescimento/n"
				+ "Persistência/n/n"
				+ "Trabalho em equipe/n"
				+ "Atenção aos Detalhes/n"
				+ "Proatividade/n"
				+ "Comunicação";
	}
	
	@GetMapping("/lista-aprendizagem")
	public String listaAprendizagem() {
		return "-Entender melhor as APIs/n"
				+ "-Aprender mais boas práticas para aplicar em projetos já realizados";
	}
}
