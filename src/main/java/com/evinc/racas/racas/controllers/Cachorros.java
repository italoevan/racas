package com.evinc.racas.racas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evinc.racas.racas.entities.Racas;
import com.evinc.racas.racas.repositories.RacasRepository;

@RestController
@RequestMapping(path = "/racas")
public class Cachorros {
	
	final RacasRepository repository;
	
	public Cachorros(RacasRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping
	public void postRaca(@RequestBody Racas racas) {
		repository.save(racas);
	}
	
	@GetMapping
	public Iterable<Racas>  getRacas() {
		return repository.findAll();
	}
}
