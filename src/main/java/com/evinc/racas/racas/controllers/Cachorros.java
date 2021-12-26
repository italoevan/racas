package com.evinc.racas.racas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cachorros")
public class Cachorros {
	
	@GetMapping
	public String getMehod() {
		return "Funfando";
	}
}
