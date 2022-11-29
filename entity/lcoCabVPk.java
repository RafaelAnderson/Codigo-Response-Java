package com.empresa.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Embeddable
public class lcoCabVPk implements Serializable {

	private static final long serialVersionUID = 1L;

	String cl_subdia;

	String cl_compro;

	public lcoCabVPk(String cl_subdia, String cl_compro) {
		super();
		this.cl_subdia = cl_subdia;
		this.cl_compro = cl_compro;
	}

	public lcoCabVPk() {
		super();
	}

	public String getCl_subdia() {
		return cl_subdia;
	}

	public void setCl_subdia(String cl_subdia) {
		this.cl_subdia = cl_subdia;
	}

	public String getCl_compro() {
		return cl_compro;
	}

	public void setCl_compro(String cl_compro) {
		this.cl_compro = cl_compro;
	}
}
