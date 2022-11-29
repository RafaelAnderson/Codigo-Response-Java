package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lcociec")
public class lcociec {
	@Id
	@Column
	private String cl_asien;
	@Column
	private String cl_descr;
	@Column
	private String cl_cmpr;
	
	@Column
	private String cl_usrcrea;
	@Column
	private LocalDate cl_feccrea;
	@Column
	private LocalTime cl_hracrea;
	@Column
	private String cl_usract;

	@Column
	private LocalDate cl_fecact;
	@Column
	private LocalTime cl_hraact;
	
	
	public lcociec() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lcociec(String cl_asien, String cl_descr, String cl_cmpr, String cl_usrcrea, LocalDate cl_feccrea,
			LocalTime cl_hracrea, String cl_usract, LocalDate cl_fecact, LocalTime cl_hraact) {
		super();
		this.cl_asien = cl_asien;
		this.cl_descr = cl_descr;
		this.cl_cmpr = cl_cmpr;
		this.cl_usrcrea = cl_usrcrea;
		this.cl_feccrea = cl_feccrea;
		this.cl_hracrea = cl_hracrea;
		this.cl_usract = cl_usract;
		this.cl_fecact = cl_fecact;
		this.cl_hraact = cl_hraact;
	}
	public String getCl_asien() {
		return cl_asien;
	}
	public void setCl_asien(String cl_asien) {
		this.cl_asien = cl_asien;
	}
	public String getCl_descr() {
		return cl_descr;
	}
	public void setCl_descr(String cl_descr) {
		this.cl_descr = cl_descr;
	}
	public String getCl_cmpr() {
		return cl_cmpr;
	}
	public void setCl_cmpr(String cl_cmpr) {
		this.cl_cmpr = cl_cmpr;
	}
	public String getCl_usrcrea() {
		return cl_usrcrea;
	}
	public void setCl_usrcrea(String cl_usrcrea) {
		this.cl_usrcrea = cl_usrcrea;
	}
	public LocalDate getCl_feccrea() {
		return cl_feccrea;
	}
	public void setCl_feccrea(LocalDate cl_feccrea) {
		this.cl_feccrea = cl_feccrea;
	}
	public LocalTime getCl_hracrea() {
		return cl_hracrea;
	}
	public void setCl_hracrea(LocalTime cl_hracrea) {
		this.cl_hracrea = cl_hracrea;
	}
	public String getCl_usract() {
		return cl_usract;
	}
	public void setCl_usract(String cl_usract) {
		this.cl_usract = cl_usract;
	}
	public LocalDate getCl_fecact() {
		return cl_fecact;
	}
	public void setCl_fecact(LocalDate cl_fecact) {
		this.cl_fecact = cl_fecact;
	}
	public LocalTime getCl_hraact() {
		return cl_hraact;
	}
	public void setCl_hraact(LocalTime cl_hraact) {
		this.cl_hraact = cl_hraact;
	}
	
	
	
}
