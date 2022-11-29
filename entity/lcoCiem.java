package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lco0001ciem21")
public class lcoCiem {

	@EmbeddedId	
	private lcoCiemPk pk;
	
	private String cm_fcierre;
	
	private String cm_usrcrea;
	private LocalDate cm_feccrea;
	private LocalTime cm_hracrea;
	private String cm_usract;
	private LocalDate cm_fecact;
	private LocalTime cm_hraact;
	
	
	
	public lcoCiem() {
		super();
	}



	public lcoCiem(lcoCiemPk pk, String cm_fcierre, String cm_usrcrea, LocalDate cm_feccrea, LocalTime cm_hracrea,
			String cm_usract, LocalDate cm_fecact, LocalTime cm_hraact) {
		super();
		this.pk = pk;
		this.cm_fcierre = cm_fcierre;
		this.cm_usrcrea = cm_usrcrea;
		this.cm_feccrea = cm_feccrea;
		this.cm_hracrea = cm_hracrea;
		this.cm_usract = cm_usract;
		this.cm_fecact = cm_fecact;
		this.cm_hraact = cm_hraact;
	}



	public lcoCiemPk getPk() {
		return pk;
	}



	public void setPk(lcoCiemPk pk) {
		this.pk = pk;
	}



	public String getCm_fcierre() {
		return cm_fcierre;
	}



	public void setCm_fcierre(String cm_fcierre) {
		this.cm_fcierre = cm_fcierre;
	}



	public String getCm_usrcrea() {
		return cm_usrcrea;
	}



	public void setCm_usrcrea(String cm_usrcrea) {
		this.cm_usrcrea = cm_usrcrea;
	}



	public LocalDate getCm_feccrea() {
		return cm_feccrea;
	}



	public void setCm_feccrea(LocalDate cm_feccrea) {
		this.cm_feccrea = cm_feccrea;
	}



	public LocalTime getCm_hracrea() {
		return cm_hracrea;
	}



	public void setCm_hracrea(LocalTime cm_hracrea) {
		this.cm_hracrea = cm_hracrea;
	}



	public String getCm_usract() {
		return cm_usract;
	}



	public void setCm_usract(String cm_usract) {
		this.cm_usract = cm_usract;
	}



	public LocalDate getCm_fecact() {
		return cm_fecact;
	}



	public void setCm_fecact(LocalDate cm_fecact) {
		this.cm_fecact = cm_fecact;
	}



	public LocalTime getCm_hraact() {
		return cm_hraact;
	}



	public void setCm_hraact(LocalTime cm_hraact) {
		this.cm_hraact = cm_hraact;
	}



	
	
	
	
	
}
