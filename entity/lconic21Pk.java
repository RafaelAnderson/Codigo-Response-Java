package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class lconic21Pk implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String ni_codper;
	private String ni_cuenta;
	private String ni_tipane;
	private String ni_codane;
	private String ni_tipdoc;
	private String ni_numdoc;

	public lconic21Pk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNi_codper() {
		return ni_codper;
	}

	public void setNi_codper(String ni_codper) {
		this.ni_codper = ni_codper;
	}

	public String getNi_cuenta() {
		return ni_cuenta;
	}

	public void setNi_cuenta(String ni_cuenta) {
		this.ni_cuenta = ni_cuenta;
	}

	public String getNi_tipane() {
		return ni_tipane;
	}

	public void setNi_tipane(String ni_tipane) {
		this.ni_tipane = ni_tipane;
	}

	public String getNi_codane() {
		return ni_codane;
	}

	public void setNi_codane(String ni_codane) {
		this.ni_codane = ni_codane;
	}

	public String getNi_tipdoc() {
		return ni_tipdoc;
	}

	public void setNi_tipdoc(String ni_tipdoc) {
		this.ni_tipdoc = ni_tipdoc;
	}

	public String getNi_numdoc() {
		return ni_numdoc;
	}

	public void setNi_numdoc(String ni_numdoc) {
		this.ni_numdoc = ni_numdoc;
	}

}
