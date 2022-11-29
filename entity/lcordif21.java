package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lcordif21")
public class lcordif21 {

	@Id
	@EmbeddedId
	private lcordif21Pk pkId;
	@Column
	private String rd_tipane;
	@Column
	private String rd_glosa1;
	@Column
	private LocalDate rd_fecdoc;
	@Column
	private LocalDate rd_feccom;
	@Column
	private String rd_codmon;
	@Column
	private double rd_saldus;
	@Column
	private double rd_saldmn;
	@Column
	private LocalDate rd_fecpro;
	@Column
	private String rd_usucre;
	@Column
	private LocalDate rd_feccre;
	@Column
	private LocalTime rd_horcre;

	public lcordif21Pk getPkId() {
		return pkId;
	}

	public void setPkId(lcordif21Pk pkId) {
		this.pkId = pkId;
	}

	public String getRd_tipane() {
		return rd_tipane;
	}

	public void setRd_tipane(String rd_tipane) {
		this.rd_tipane = rd_tipane;
	}

	public String getRd_glosa1() {
		return rd_glosa1;
	}

	public void setRd_glosa1(String rd_glosa1) {
		this.rd_glosa1 = rd_glosa1;
	}

	public LocalDate getRd_fecdoc() {
		return rd_fecdoc;
	}

	public void setRd_fecdoc(LocalDate rd_fecdoc) {
		this.rd_fecdoc = rd_fecdoc;
	}

	public LocalDate getRd_feccom() {
		return rd_feccom;
	}

	public void setRd_feccom(LocalDate rd_feccom) {
		this.rd_feccom = rd_feccom;
	}

	public String getRd_codmon() {
		return rd_codmon;
	}

	public void setRd_codmon(String rd_codmon) {
		this.rd_codmon = rd_codmon;
	}

	public double getRd_saldus() {
		return rd_saldus;
	}

	public void setRd_saldus(double rd_saldus) {
		this.rd_saldus = rd_saldus;
	}

	public double getRd_saldmn() {
		return rd_saldmn;
	}

	public void setRd_saldmn(double rd_saldmn) {
		this.rd_saldmn = rd_saldmn;
	}

	public LocalDate getRd_fecpro() {
		return rd_fecpro;
	}

	public void setRd_fecpro(LocalDate rd_fecpro) {
		this.rd_fecpro = rd_fecpro;
	}

	public String getRd_usucre() {
		return rd_usucre;
	}

	public void setRd_usucre(String rd_usucre) {
		this.rd_usucre = rd_usucre;
	}

	public LocalDate getRd_feccre() {
		return rd_feccre;
	}

	public void setRd_feccre(LocalDate rd_feccre) {
		this.rd_feccre = rd_feccre;
	}

	public LocalTime getRd_horcre() {
		return rd_horcre;
	}

	public void setRd_horcre(LocalTime rd_horcre) {
		this.rd_horcre = rd_horcre;
	}

}