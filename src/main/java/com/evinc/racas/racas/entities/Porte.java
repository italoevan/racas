package com.evinc.racas.racas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Porte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String porte;

	public Integer getId() {
		return this.id;
	};
	
	

	public String getPorte() {
		return this.porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

}
