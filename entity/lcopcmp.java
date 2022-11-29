package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lcopcmp")
public class lcopcmp {
	
	@EmbeddedId
	private lcopcmpPk pk_ID;
	@Column
	private String cl_itmp1 ;
	@Column
	private String  cl_itmp2 ;
	@Column
    private String cl_itmp3 ;
	@Column
	private String cl_itmp4 ;
	@Column
    private String cl_itmp5 ;
	@Column
    private String cl_itmp6 ;
	@Column
	private String cl_itmp7 ;
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
	
	
	public lcopcmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lcopcmpPk getPk_ID() {
		return pk_ID;
	}
	public void setPk_ID(lcopcmpPk pk_ID) {
		this.pk_ID = pk_ID;
	}
	public String getCl_itmp1() {
		return cl_itmp1;
	}
	public void setCl_itmp1(String cl_itmp1) {
		this.cl_itmp1 = cl_itmp1;
	}
	public String getCl_itmp2() {
		return cl_itmp2;
	}
	public void setCl_itmp2(String cl_itmp2) {
		this.cl_itmp2 = cl_itmp2;
	}
	public String getCl_itmp3() {
		return cl_itmp3;
	}
	public void setCl_itmp3(String cl_itmp3) {
		this.cl_itmp3 = cl_itmp3;
	}
	public String getCl_itmp4() {
		return cl_itmp4;
	}
	public void setCl_itmp4(String cl_itmp4) {
		this.cl_itmp4 = cl_itmp4;
	}
	public String getCl_itmp5() {
		return cl_itmp5;
	}
	public void setCl_itmp5(String cl_itmp5) {
		this.cl_itmp5 = cl_itmp5;
	}
	public String getCl_itmp6() {
		return cl_itmp6;
	}
	public void setCl_itmp6(String cl_itmp6) {
		this.cl_itmp6 = cl_itmp6;
	}
	public String getCl_itmp7() {
		return cl_itmp7;
	}
	public void setCl_itmp7(String cl_itmp7) {
		this.cl_itmp7 = cl_itmp7;
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
