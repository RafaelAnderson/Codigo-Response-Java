package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lcocied")
public class lcocied {
	
	@EmbeddedId
	private lcociedPk pk;
	@Column
	private String dl_tipope;
	@Column
	private String dl_ctasal;
	@Column
	private String dl_ctatra;
	
	@Column
	private String dl_usrcrea;
	@Column
	private LocalDate dl_feccrea;
	@Column
	private LocalTime dl_hracrea;
	@Column
	private String dl_usract;
	@Column
	private LocalDate dl_fecact;
	@Column
	private LocalTime dl_hraact;
	
	
	public lcocied() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lcocied(lcociedPk pk, String dl_tipope, String dl_ctasal, String dl_ctatra, String dl_usrcrea,
			LocalDate dl_feccrea, LocalTime dl_hracrea, String dl_usract, LocalDate dl_fecact, LocalTime dl_hraact) {
		super();
		this.pk = pk;
		this.dl_tipope = dl_tipope;
		this.dl_ctasal = dl_ctasal;
		this.dl_ctatra = dl_ctatra;
		this.dl_usrcrea = dl_usrcrea;
		this.dl_feccrea = dl_feccrea;
		this.dl_hracrea = dl_hracrea;
		this.dl_usract = dl_usract;
		this.dl_fecact = dl_fecact;
		this.dl_hraact = dl_hraact;
	}
	public lcociedPk getPk() {
		return pk;
	}
	public void setPk(lcociedPk pk) {
		this.pk = pk;
	}
	public String getDl_tipope() {
		return dl_tipope;
	}
	public void setDl_tipope(String dl_tipope) {
		this.dl_tipope = dl_tipope;
	}
	public String getDl_ctasal() {
		return dl_ctasal;
	}
	public void setDl_ctasal(String dl_ctasal) {
		this.dl_ctasal = dl_ctasal;
	}
	public String getDl_ctatra() {
		return dl_ctatra;
	}
	public void setDl_ctatra(String dl_ctatra) {
		this.dl_ctatra = dl_ctatra;
	}
	public String getDl_usrcrea() {
		return dl_usrcrea;
	}
	public void setDl_usrcrea(String dl_usrcrea) {
		this.dl_usrcrea = dl_usrcrea;
	}
	public LocalDate getDl_feccrea() {
		return dl_feccrea;
	}
	public void setDl_feccrea(LocalDate dl_feccrea) {
		this.dl_feccrea = dl_feccrea;
	}
	public LocalTime getDl_hracrea() {
		return dl_hracrea;
	}
	public void setDl_hracrea(LocalTime dl_hracrea) {
		this.dl_hracrea = dl_hracrea;
	}
	public String getDl_usract() {
		return dl_usract;
	}
	public void setDl_usract(String dl_usract) {
		this.dl_usract = dl_usract;
	}
	public LocalDate getDl_fecact() {
		return dl_fecact;
	}
	public void setDl_fecact(LocalDate dl_fecact) {
		this.dl_fecact = dl_fecact;
	}
	public LocalTime getDl_hraact() {
		return dl_hraact;
	}
	public void setDl_hraact(LocalTime dl_hraact) {
		this.dl_hraact = dl_hraact;
	}
	
	
	

	
}
