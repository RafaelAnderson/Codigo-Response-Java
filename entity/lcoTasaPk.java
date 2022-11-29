package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoTasaPk implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String tl_tiptasa  ;
	String tl_codtasa ;
	
	public lcoTasaPk(String tl_tiptasa, String tl_codtasa) {
		super();
		this.tl_tiptasa = tl_tiptasa;
		this.tl_codtasa = tl_codtasa;
	}

	public lcoTasaPk() {
		super();
	}

	public String getTl_tiptasa() {
		return tl_tiptasa;
	}

	public void setTl_tiptasa(String tl_tiptasa) {
		this.tl_tiptasa = tl_tiptasa;
	}

	public String getTl_codtasa() {
		return tl_codtasa;
	}

	public void setTl_codtasa(String tl_codtasa) {
		this.tl_codtasa = tl_codtasa;
	}
	
	
	
}
