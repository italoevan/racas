package com.evinc.racas.racas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cachorro {
	
	@Id	
	private Integer id;
	private String name;
	
}
