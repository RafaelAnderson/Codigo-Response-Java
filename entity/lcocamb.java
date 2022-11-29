package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "lcocamb")
public class lcocamb {

	@EmbeddedId
	private lcocambPk pk_ID;
	@Column
	private Double cl_tipcmpx;
	@Column
	private Double cl_tipcmpn;
	@Column
	private Double cl_tipvtax;
	@Column
	private Double cl_tipvtan;
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


	@Column
	private Double cl_tipcn21;
	@Column
	private Double cl_tipvn21;
	
	
	public lcocamb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public lcocamb(lcocambPk pk_ID, Double cl_tipcmpx, Double cl_tipcmpn, Double cl_tipvtax, Double cl_tipvtan,
			String cl_usrcrea, LocalDate cl_feccrea, LocalTime cl_hracrea, String cl_usract, LocalDate cl_fecact,
			LocalTime cl_hraact, Double cl_tipcn21, Double cl_tipvn21) {
		this.pk_ID = pk_ID;
		this.cl_tipcmpx = cl_tipcmpx;
		this.cl_tipcmpn = cl_tipcmpn;
		this.cl_tipvtax = cl_tipvtax;
		this.cl_tipvtan = cl_tipvtan;
		this.cl_usrcrea = cl_usrcrea;
		this.cl_feccrea = cl_feccrea;
		this.cl_hracrea = cl_hracrea;
		this.cl_usract = cl_usract;
		this.cl_fecact = cl_fecact;
		this.cl_hraact = cl_hraact;
		this.cl_tipcn21 = cl_tipcn21;
		this.cl_tipvn21 = cl_tipvn21;
	}



	public lcocambPk getPk_ID() {
		return pk_ID;
	}

	public void setPk_ID(lcocambPk pk_ID) {
		this.pk_ID = pk_ID;
	}

	public Double getCl_tipcmpx() {
		return cl_tipcmpx;
	}
	public void setCl_tipcmpx(Double cl_tipcmpx) {
		this.cl_tipcmpx = cl_tipcmpx;
	}
	public Double getCl_tipcmpn() {
		return cl_tipcmpn;
	}
	public void setCl_tipcmpn(Double cl_tipcmpn) {
		this.cl_tipcmpn = cl_tipcmpn;
	}
	public Double getCl_tipvtax() {
		return cl_tipvtax;
	}
	public void setCl_tipvtax(Double cl_tipvtax) {
		this.cl_tipvtax = cl_tipvtax;
	}
	public Double getCl_tipvtan() {
		return cl_tipvtan;
	}
	public void setCl_tipvtan(Double cl_tipvtan) {
		this.cl_tipvtan = cl_tipvtan;
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



	public Double getCl_tipcn21() {
		return cl_tipcn21;
	}



	public void setCl_tipcn21(Double cl_tipcn21) {
		this.cl_tipcn21 = cl_tipcn21;
	}



	public Double getCl_tipvn21() {
		return cl_tipvn21;
	}



	public void setCl_tipvn21(Double cl_tipvn21) {
		this.cl_tipvn21 = cl_tipvn21;
	}
	
	
	
	
	
}
