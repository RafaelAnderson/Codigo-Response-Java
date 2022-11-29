package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Embeddable
public class lcoNdomPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nd_periodo ;
	private String nd_subdia;
	private String nd_compro;
	private String nd_tipreg;
	
	public lcoNdomPk(String nd_periodo, String nd_subdia, String nd_compro, String nd_tipreg) {
		super();
		this.nd_periodo = nd_periodo;
		this.nd_subdia = nd_subdia;
		this.nd_compro = nd_compro;
		this.nd_tipreg = nd_tipreg;
	}

	public lcoNdomPk() {
		super();
	}

	public String getNd_periodo() {
		return nd_periodo;
	}

	public void setNd_periodo(String nd_periodo) {
		this.nd_periodo = nd_periodo;
	}

	public String getNd_subdia() {
		return nd_subdia;
	}

	public void setNd_subdia(String nd_subdia) {
		this.nd_subdia = nd_subdia;
	}

	public String getNd_compro() {
		return nd_compro;
	}

	public void setNd_compro(String nd_compro) {
		this.nd_compro = nd_compro;
	}

	public String getNd_tipreg() {
		return nd_tipreg;
	}

	public void setNd_tipreg(String nd_tipreg) {
		this.nd_tipreg = nd_tipreg;
	}
	
	
	
}
