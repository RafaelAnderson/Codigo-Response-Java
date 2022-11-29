package com.empresa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class lcordif21Pk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rd_codper;
	@Column
	private String rd_cuenta;
	@Column
	private String rd_codane;
	@Column
	private String rd_tipdoc;
	@Column
	private String rd_numdoc;
	
	public String getRd_codper() {
		return rd_codper;
	}
	public void setRd_codper(String rd_codper) {
		this.rd_codper = rd_codper;
	}
	public String getRd_cuenta() {
		return rd_cuenta;
	}
	public void setRd_cuenta(String rd_cuenta) {
		this.rd_cuenta = rd_cuenta;
	}
	public String getRd_codane() {
		return rd_codane;
	}
	public void setRd_codane(String rd_codane) {
		this.rd_codane = rd_codane;
	}
	public String getRd_tipdoc() {
		return rd_tipdoc;
	}
	public void setRd_tipdoc(String rd_tipdoc) {
		this.rd_tipdoc = rd_tipdoc;
	}
	public String getRd_numdoc() {
		return rd_numdoc;
	}
	public void setRd_numdoc(String rd_numdoc) {
		this.rd_numdoc = rd_numdoc;
	}
	
	
	
}
