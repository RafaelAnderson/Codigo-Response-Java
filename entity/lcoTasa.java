package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lco0001tasa")
public class lcoTasa {
	
	@EmbeddedId
	private lcoTasaPk pkID;

	private String tl_dsctasa;
	
	private double tl_valref1;
	
	private double tl_valref2;
	
	private double tl_tasa;
	
	private String tl_detcbi;
	
	private String tl_detcob;
	
	private String tl_flabas;
	
	private String tl_usrcrea;
	
	private LocalDate tl_feccrea;
	
	private LocalTime tl_hracrea;
	
	private String tl_usract;
	
	private LocalDate tl_fecact;
	
	private LocalTime tl_hraact;

	public lcoTasa(lcoTasaPk pkID, String tl_dsctasa, double tl_valref1, double tl_valref2, double tl_tasa,
			String tl_detcbi, String tl_detcob, String tl_flabas, String tl_usrcrea, LocalDate tl_feccrea,
			LocalTime tl_hracrea, String tl_usract, LocalDate tl_fecact, LocalTime tl_hraact) {
		super();
		this.pkID = pkID;
		this.tl_dsctasa = tl_dsctasa;
		this.tl_valref1 = tl_valref1;
		this.tl_valref2 = tl_valref2;
		this.tl_tasa = tl_tasa;
		this.tl_detcbi = tl_detcbi;
		this.tl_detcob = tl_detcob;
		this.tl_flabas = tl_flabas;
		this.tl_usrcrea = tl_usrcrea;
		this.tl_feccrea = tl_feccrea;
		this.tl_hracrea = tl_hracrea;
		this.tl_usract = tl_usract;
		this.tl_fecact = tl_fecact;
		this.tl_hraact = tl_hraact;
	}

	public lcoTasa() {
		super();
	}

	public lcoTasaPk getPkID() {
		return pkID;
	}

	public void setPkID(lcoTasaPk pkID) {
		this.pkID = pkID;
	}

	public String getTl_dsctasa() {
		return tl_dsctasa;
	}

	public void setTl_dsctasa(String tl_dsctasa) {
		this.tl_dsctasa = tl_dsctasa;
	}

	public double getTl_valref1() {
		return tl_valref1;
	}

	public void setTl_valref1(double tl_valref1) {
		this.tl_valref1 = tl_valref1;
	}

	public double getTl_valref2() {
		return tl_valref2;
	}

	public void setTl_valref2(double tl_valref2) {
		this.tl_valref2 = tl_valref2;
	}

	public double getTl_tasa() {
		return tl_tasa;
	}

	public void setTl_tasa(double tl_tasa) {
		this.tl_tasa = tl_tasa;
	}

	public String getTl_detcbi() {
		return tl_detcbi;
	}

	public void setTl_detcbi(String tl_detcbi) {
		this.tl_detcbi = tl_detcbi;
	}

	public String getTl_detcob() {
		return tl_detcob;
	}

	public void setTl_detcob(String tl_detcob) {
		this.tl_detcob = tl_detcob;
	}

	public String getTl_flabas() {
		return tl_flabas;
	}

	public void setTl_flabas(String tl_flabas) {
		this.tl_flabas = tl_flabas;
	}

	public String getTl_usrcrea() {
		return tl_usrcrea;
	}

	public void setTl_usrcrea(String tl_usrcrea) {
		this.tl_usrcrea = tl_usrcrea;
	}

	public LocalDate getTl_feccrea() {
		return tl_feccrea;
	}

	public void setTl_feccrea(LocalDate tl_feccrea) {
		this.tl_feccrea = tl_feccrea;
	}

	public LocalTime getTl_hracrea() {
		return tl_hracrea;
	}

	public void setTl_hracrea(LocalTime tl_hracrea) {
		this.tl_hracrea = tl_hracrea;
	}

	public String getTl_usract() {
		return tl_usract;
	}

	public void setTl_usract(String tl_usract) {
		this.tl_usract = tl_usract;
	}

	public LocalDate getTl_fecact() {
		return tl_fecact;
	}

	public void setTl_fecact(LocalDate tl_fecact) {
		this.tl_fecact = tl_fecact;
	}

	public LocalTime getTl_hraact() {
		return tl_hraact;
	}

	public void setTl_hraact(LocalTime tl_hraact) {
		this.tl_hraact = tl_hraact;
	}
	
	

}
