package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode
@Embeddable
public class lcobancPk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="bl_codbco")
	private String bl_codbco;
	
	@Column(name="bl_flcaja")
	private String bl_flcaja;
	
	
	
	

	public lcobancPk() {
		super();
	}

	public lcobancPk(String bl_codbco, String bl_flcaja) {
		super();
		this.bl_codbco = bl_codbco;
		this.bl_flcaja = bl_flcaja;
	}

	public String getBl_codbco() {
		return bl_codbco;
	}

	public void setBl_codbco(String bl_codbco) {
		this.bl_codbco = bl_codbco;
	}

	public String getBl_flcaja() {
		return bl_flcaja;
	}

	public void setBl_flcaja(String bl_flcaja) {
		this.bl_flcaja = bl_flcaja;
	}

	
}
