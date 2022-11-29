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
@Table(name="lcouser")
public class lcoUser {
	@Id
    String ul_codusr;
	@Column
    String ul_nomusr;
	@Column
    String ul_clave;
	@Column
    String ul_tipusr;
	@Column
    String ul_usrcrea;
	@Column
    LocalDate ul_feccrea;
	@Column
    LocalTime ul_hracrea;
	@Column
    String ul_usract;
	@Column
    LocalDate ul_fecact;
	@Column
    LocalTime ul_hraact;
	public lcoUser(String ul_codusr, String ul_nomusr, String ul_clave, String ul_tipusr, String ul_usrcrea,
			LocalDate ul_feccrea, LocalTime ul_hracrea, String ul_usract, LocalDate ul_fecact, LocalTime ul_hraact) {
		super();
		this.ul_codusr = ul_codusr;
		this.ul_nomusr = ul_nomusr;
		this.ul_clave = ul_clave;
		this.ul_tipusr = ul_tipusr;
		this.ul_usrcrea = ul_usrcrea;
		this.ul_feccrea = ul_feccrea;
		this.ul_hracrea = ul_hracrea;
		this.ul_usract = ul_usract;
		this.ul_fecact = ul_fecact;
		this.ul_hraact = ul_hraact;
	}
	
	public lcoUser() {
		super();	}

	public String getUl_codusr() {
		return ul_codusr;
	}

	public void setUl_codusr(String ul_codusr) {
		this.ul_codusr = ul_codusr;
	}

	public String getUl_nomusr() {
		return ul_nomusr;
	}

	public void setUl_nomusr(String ul_nomusr) {
		this.ul_nomusr = ul_nomusr;
	}

	public String getUl_clave() {
		return ul_clave;
	}

	public void setUl_clave(String ul_clave) {
		this.ul_clave = ul_clave;
	}

	public String getUl_tipusr() {
		return ul_tipusr;
	}

	public void setUl_tipusr(String ul_tipusr) {
		this.ul_tipusr = ul_tipusr;
	}

	public String getUl_usrcrea() {
		return ul_usrcrea;
	}

	public void setUl_usrcrea(String ul_usrcrea) {
		this.ul_usrcrea = ul_usrcrea;
	}

	public LocalDate getUl_feccrea() {
		return ul_feccrea;
	}

	public void setUl_feccrea(LocalDate ul_feccrea) {
		this.ul_feccrea = ul_feccrea;
	}

	public LocalTime getUl_hracrea() {
		return ul_hracrea;
	}

	public void setUl_hracrea(LocalTime ul_hracrea) {
		this.ul_hracrea = ul_hracrea;
	}

	public String getUl_usract() {
		return ul_usract;
	}

	public void setUl_usract(String ul_usract) {
		this.ul_usract = ul_usract;
	}

	public LocalDate getUl_fecact() {
		return ul_fecact;
	}

	public void setUl_fecact(LocalDate ul_fecact) {
		this.ul_fecact = ul_fecact;
	}

	public LocalTime getUl_hraact() {
		return ul_hraact;
	}

	public void setUl_hraact(LocalTime ul_hraact) {
		this.ul_hraact = ul_hraact;
	}
	
}
