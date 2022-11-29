package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoCiemPk implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String cm_periodo;
	private String cm_subdia;
	
	
	
	public lcoCiemPk() {
		super();
	}

	public lcoCiemPk(String cm_periodo, String cm_subdia) {
		super();
		this.cm_periodo = cm_periodo;
		this.cm_subdia = cm_subdia;
	}

	public String getCm_periodo() {
		return cm_periodo;
	}

	public void setCm_periodo(String cm_periodo) {
		this.cm_periodo = cm_periodo;
	}

	public String getCm_subdia() {
		return cm_subdia;
	}

	public void setCm_subdia(String cm_subdia) {
		this.cm_subdia = cm_subdia;
	}
	
	
	
}
