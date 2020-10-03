package com.upemor.sesioncuatro.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class saludoRest {
	
	@GetMapping("/saludo")
	public String SaludoRest()
	{
		return "Hola mundo desde mi aplicación";
	}

}
