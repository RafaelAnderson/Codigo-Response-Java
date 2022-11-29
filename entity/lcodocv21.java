package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lcodocv21")
public class lcodocv21 {

	@EmbeddedId
	  private lcodocv21Pk pk;
	@Column
	  private String il_tipo  ;
	@Column
	 private String il_descri  ;
	@Column
	  private String il_archivo  ;
	@Column
	   private String il_imagen ;
	@Column
	  private String il_usrcrea ;
	@Column
	  private LocalDate il_feccrea ;
	@Column
	  private LocalTime il_hracrea  ;
	@Column
	  private String il_usract  ;
	@Column
	  private  LocalDate il_fecact  ;
	@Column
	  private LocalTime il_hraact ;
	  
	  
	public lcodocv21() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lcodocv21Pk getPk() {
		return pk;
	}
	public void setPk(lcodocv21Pk pk) {
		this.pk = pk;
	}
	public String getIl_tipo() {
		return il_tipo;
	}
	public void setIl_tipo(String il_tipo) {
		this.il_tipo = il_tipo;
	}
	public String getIl_descri() {
		return il_descri;
	}
	public void setIl_descri(String il_descri) {
		this.il_descri = il_descri;
	}
	public String getIl_archivo() {
		return il_archivo;
	}
	public void setIl_archivo(String il_archivo) {
		this.il_archivo = il_archivo;
	}
	public String getIl_imagen() {
		return il_imagen;
	}
	public void setIl_imagen(String il_imagen) {
		this.il_imagen = il_imagen;
	}
	public String getIl_usrcrea() {
		return il_usrcrea;
	}
	public void setIl_usrcrea(String il_usrcrea) {
		this.il_usrcrea = il_usrcrea;
	}
	public LocalDate getIl_fecCrea() {
		return il_feccrea;
	}

	public void setIl_fecCrea(LocalDate il_feccrea) {
		this.il_feccrea = il_feccrea;
	}
	public LocalTime getIl_hracrea() {
		return il_hracrea;
	}
	public void setIl_hracrea(LocalTime il_hracrea) {
		this.il_hracrea = il_hracrea;
	}
	public String getIl_usract() {
		return il_usract;
	}
	public void setIl_usract(String il_usract) {
		this.il_usract = il_usract;
	}
	public LocalDate getIl_fecact() {
		return il_fecact;
	}
	public void setIl_fecact(LocalDate il_fecact) {
		this.il_fecact = il_fecact;
	}
	public LocalTime getIl_hraact() {
		return il_hraact;
	}
	public void setIl_hraact(LocalTime il_hraact) {
		this.il_hraact = il_hraact;
	}
	  
	  
}
