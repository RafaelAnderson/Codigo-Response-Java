package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lcocias")
public class lcoCias {

	@Id
	@Column(length = 4)
	String cl_codcia ;
	
	@Column(length = 100)
	String cl_desc1;

	@Column(length = 100)
	String cl_desc2;

	@Column(length = 4)
	String cl_tipdoc;

	@Column(length = 18)
	String cl_nrodoc;

	@Column(length = 100)
	String cl_telef;

	@Column(length = 100)
	String cl_email;

	@Column(length = 100)
	String cl_host;

	@Column(length = 5)
	String cl_tipreg;

	@Column(length = 1)
	String cl_estado;
	
	@Column(length = 10)
	String cl_usrcrea;
	
	@Column(length = 12)
	LocalDate cl_feccrea;
	
	@Column(length = 8)
	LocalTime cl_hracrea;
	
	@Column(length = 10)
	String cl_usract;
	
	@Column(length = 12)
	LocalDate cl_fecact;
	
	@Column(length = 8)
	LocalTime cl_hraact;
	
	public lcoCias() {
		super();
	}


	public lcoCias(String cl_codcia, String cl_desc1, String cl_desc2, String cl_tipdoc, String cl_nrodoc, String cl_telef, String cl_email, String cl_host, String cl_tipreg, String cl_estado, String cl_usrcrea, LocalDate cl_feccrea, LocalTime cl_hracrea, String cl_usract, LocalDate cl_fecact, LocalTime cl_hraact) {
		super();
		this.cl_codcia = cl_codcia;
		this.cl_desc1 = cl_desc1;
		this.cl_desc2 = cl_desc2;
		this.cl_tipdoc = cl_tipdoc;
		this.cl_nrodoc = cl_nrodoc;
		this.cl_telef = cl_telef;
		this.cl_email = cl_email;
		this.cl_host = cl_host;
		this.cl_tipreg = cl_tipreg;
		this.cl_estado = cl_estado;
		this.cl_usrcrea = cl_usrcrea;
		this.cl_feccrea = cl_feccrea;
		this.cl_hracrea = cl_hracrea;
		this.cl_usract = cl_usract;
		this.cl_fecact = cl_fecact;
		this.cl_hraact = cl_hraact;
	}

	public String getCl_codcia() {
		return this.cl_codcia;
	}

	public void setCl_codcia(String cl_codcia) {
		this.cl_codcia = cl_codcia;
	}

	public String getCl_desc1() {
		return this.cl_desc1;
	}

	public void setCl_desc1(String cl_desc1) {
		this.cl_desc1 = cl_desc1;
	}

	public String getCl_desc2() {
		return this.cl_desc2;
	}

	public void setCl_desc2(String cl_desc2) {
		this.cl_desc2 = cl_desc2;
	}

	public String getCl_tipdoc() {
		return this.cl_tipdoc;
	}

	public void setCl_tipdoc(String cl_tipdoc) {
		this.cl_tipdoc = cl_tipdoc;
	}

	public String getCl_nrodoc() {
		return this.cl_nrodoc;
	}

	public void setCl_nrodoc(String cl_nrodoc) {
		this.cl_nrodoc = cl_nrodoc;
	}

	public String getCl_telef() {
		return this.cl_telef;
	}

	public void setCl_telef(String cl_telef) {
		this.cl_telef = cl_telef;
	}

	public String getCl_email() {
		return this.cl_email;
	}

	public void setCl_email(String cl_email) {
		this.cl_email = cl_email;
	}

	public String getCl_host() {
		return this.cl_host;
	}

	public void setCl_host(String cl_host) {
		this.cl_host = cl_host;
	}

	public String getCl_tipreg() {
		return this.cl_tipreg;
	}

	public void setCl_tipreg(String cl_tipreg) {
		this.cl_tipreg = cl_tipreg;
	}

	public String getCl_estado() {
		return this.cl_estado;
	}

	public void setCl_estado(String cl_estado) {
		this.cl_estado = cl_estado;
	}

	public String getCl_usrcrea() {
		return this.cl_usrcrea;
	}

	public void setCl_usrcrea(String cl_usrcrea) {
		this.cl_usrcrea = cl_usrcrea;
	}

	public LocalDate getCl_feccrea() {
		return this.cl_feccrea;
	}

	public void setCl_feccrea(LocalDate cl_feccrea) {
		this.cl_feccrea = cl_feccrea;
	}

	public LocalTime getCl_hracrea() {
		return this.cl_hracrea;
	}

	public void setCl_hracrea(LocalTime cl_hracrea) {
		this.cl_hracrea = cl_hracrea;
	}

	public String getCl_usract() {
		return this.cl_usract;
	}

	public void setCl_usract(String cl_usract) {
		this.cl_usract = cl_usract;
	}

	public LocalDate getCl_fecact() {
		return this.cl_fecact;
	}

	public void setCl_fecact(LocalDate cl_fecact) {
		this.cl_fecact = cl_fecact;
	}

	public LocalTime getCl_hraact() {
		return this.cl_hraact;
	}

	public void setCl_hraact(LocalTime cl_hraact) {
		this.cl_hraact = cl_hraact;
	}
}
