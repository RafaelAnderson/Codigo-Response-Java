package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="lco0001pflc")
public class lcopflc {
	
	@EmbeddedId
	private lcopflcPk lcopflcPk;
	
	@Column(name="fl_grpfrmt")
	private String fl_grpfrmt;
	
	@Column(name = "fl_descri1")
	private String fl_descri1;
	
	@Column(name="fl_descri2")
	private String fl_descri2;
	
	@Column(name="fl_descrgrp")
	private String fl_descrgrp;
	
	@Column(name="fl_rubrobal")
	private String fl_rubrobal;
	
	@Column(name="fl_rubrores")
	private String fl_rubrores;
	
	@Column(name="fl_formula")
	private String fl_formula;
	
	@Column(name="fl_tipdto")
	private String fl_tipdto;
	
	@Column(name="fl_rubeeff")
	private String fl_rubeeff;
	
	@Column(name="fl_orden")
	private int fl_orden;
	
	@Column(name="fl_usrcrea")
	private String fl_usrcrea;
	
	@Column(name="fl_feccrea")
	private LocalDate fl_feccrea;
	
	@Column(name="fl_hracrea")
	private LocalTime fl_hracrea;
	
	@Column(name="fl_usract")
	private String fl_usract;
	
	@Column(name="fl_fecact")
	private LocalDate fl_fecact;
	
	@Column(name="fl_hraact")
	private LocalTime fl_hraact;

	public lcopflcPk getLcopflcPk() {
		return lcopflcPk;
	}

	public void setLcopflcPk(lcopflcPk lcopflcPk) {
		this.lcopflcPk = lcopflcPk;
	}

	public String getFl_grpfrmt() {
		return fl_grpfrmt;
	}

	public void setFl_grpfrmt(String fl_grpfrmt) {
		this.fl_grpfrmt = fl_grpfrmt;
	}

	public String getFl_descri1() {
		return fl_descri1;
	}

	public void setFl_descri1(String fl_descri1) {
		this.fl_descri1 = fl_descri1;
	}

	public String getFl_descri2() {
		return fl_descri2;
	}

	public void setFl_descri2(String fl_descri2) {
		this.fl_descri2 = fl_descri2;
	}

	public String getFl_descrgrp() {
		return fl_descrgrp;
	}

	public void setFl_descrgrp(String fl_descrgrp) {
		this.fl_descrgrp = fl_descrgrp;
	}

	public String getFl_rubrobal() {
		return fl_rubrobal;
	}

	public void setFl_rubrobal(String fl_rubrobal) {
		this.fl_rubrobal = fl_rubrobal;
	}

	public String getFl_rubrores() {
		return fl_rubrores;
	}

	public void setFl_rubrores(String fl_rubrores) {
		this.fl_rubrores = fl_rubrores;
	}

	public String getFl_formula() {
		return fl_formula;
	}

	public void setFl_formula(String fl_formula) {
		this.fl_formula = fl_formula;
	}

	public String getFl_tipDto() {
		return fl_tipdto;
	}

	public void setFl_tipDto(String fl_tipDto) {
		this.fl_tipdto = fl_tipDto;
	}

	public String getFl_rubeeff() {
		return fl_rubeeff;
	}

	public void setFl_rubeeff(String fl_rubeeff) {
		this.fl_rubeeff = fl_rubeeff;
	}

	public int getFl_orden() {
		return fl_orden;
	}

	public void setFl_orden(int fl_orden) {
		this.fl_orden = fl_orden;
	}

	public String getFl_usrcrea() {
		return fl_usrcrea;
	}

	public void setFl_usrcrea(String fl_usrcrea) {
		this.fl_usrcrea = fl_usrcrea;
	}

	public LocalDate getFl_feccrea() {
		return fl_feccrea;
	}

	public void setFl_feccrea(LocalDate fl_feccrea) {
		this.fl_feccrea = fl_feccrea;
	}

	public LocalTime getFl_hracrea() {
		return fl_hracrea;
	}

	public void setFl_hracrea(LocalTime fl_hracrea) {
		this.fl_hracrea = fl_hracrea;
	}

	public String getFl_usract() {
		return fl_usract;
	}

	public void setFl_usract(String fl_usract) {
		this.fl_usract = fl_usract;
	}

	public LocalDate getFl_fecact() {
		return fl_fecact;
	}

	public void setFl_fecact(LocalDate fl_fecact) {
		this.fl_fecact = fl_fecact;
	}

	public LocalTime getFl_hraact() {
		return fl_hraact;
	}

	public void setFl_hraact(LocalTime fl_hraact) {
		this.fl_hraact = fl_hraact;
	}

	public lcopflc(lcopflcPk lcopflcPk, String fl_grpfrmt, String fl_descri1, String fl_descri2,
			String fl_descrgrp, String fl_rubrobal, String fl_rubrores, String fl_formula, String fl_tipDto,
			String fl_rubeeff, int fl_orden, String fl_usrcrea, LocalDate fl_feccrea, LocalTime fl_hracrea,
			String fl_usract, LocalDate fl_fecact, LocalTime fl_hraact) {
		super();
		this.lcopflcPk = lcopflcPk;
		this.fl_grpfrmt = fl_grpfrmt;
		this.fl_descri1 = fl_descri1;
		this.fl_descri2 = fl_descri2;
		this.fl_descrgrp = fl_descrgrp;
		this.fl_rubrobal = fl_rubrobal;
		this.fl_rubrores = fl_rubrores;
		this.fl_formula = fl_formula;
		this.fl_tipdto = fl_tipDto;
		this.fl_rubeeff = fl_rubeeff;
		this.fl_orden = fl_orden;
		this.fl_usrcrea = fl_usrcrea;
		this.fl_feccrea = fl_feccrea;
		this.fl_hracrea = fl_hracrea;
		this.fl_usract = fl_usract;
		this.fl_fecact = fl_fecact;
		this.fl_hraact = fl_hraact;
	}

	public lcopflc() {
		super();
	}
	
	
	
	
	

}
