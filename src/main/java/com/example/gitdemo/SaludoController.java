package com.example.gitdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

	@GetMapping("/hola")
	public String saludo() {
		return "Hola Mundo";
	}
}
