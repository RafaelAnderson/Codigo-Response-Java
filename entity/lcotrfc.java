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
@Table(name = "lco0001trfc")
public class lcotrfc {

	@EmbeddedId
	private lcotrfcPk pk_ID;

	@Column
	private Double tl_factor;
	@Column
	private String tl_usrcrea;
	@Column
	private LocalDate tl_feccrea;
	@Column
	private LocalTime tl_hracrea;
	@Column
	private String tl_usract;

	@Column
	private LocalDate tl_fecact;
	@Column
	private LocalTime tl_hraact;

	public lcotrfc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public lcotrfc(lcotrfcPk pk_ID, Double tl_factor, String tl_usrcrea, LocalDate tl_feccrea,
			LocalTime tl_hracrea, String tl_usract, LocalDate tl_fecact, LocalTime tl_hraact) {
		super();
		this.pk_ID = pk_ID;
		this.tl_factor = tl_factor;
		this.tl_usrcrea = tl_usrcrea;
		this.tl_feccrea = tl_feccrea;
		this.tl_hracrea = tl_hracrea;
		this.tl_usract = tl_usract;
		this.tl_fecact = tl_fecact;
		this.tl_hraact = tl_hraact;
	}

	public lcotrfcPk getPk_ID() {
		return pk_ID;
	}

	public void setPk_ID(lcotrfcPk pk_ID) {
		this.pk_ID = pk_ID;
	}

	public Double getTl_factor() {
		return tl_factor;
	}

	public void setTl_factor(Double tl_factor) {
		this.tl_factor = tl_factor;
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
