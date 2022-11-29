package com.empresa.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Embeddable
public class lcocambPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cl_tipmon;
	private LocalDate cl_fectcamb;
	
	
	public lcocambPk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lcocambPk(String id1, LocalDate id2) {
		
	}
	public String getCl_tipmon() {
		return cl_tipmon;
	}
	public void setCl_tipmon(String cl_tipmon) {
		this.cl_tipmon = cl_tipmon;
	}
	public LocalDate getCl_fectcamb() {
		return cl_fectcamb;
	}
	public void setCl_fectcamb(LocalDate cl_fectcamb) {
		this.cl_fectcamb = cl_fectcamb;
	}
	
	
}
