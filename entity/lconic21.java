package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lconic21")
public class lconic21 {
	
	@Id
	@EmbeddedId
	private  lconic21Pk pk;
	@Column
	private String ni_glosa1;
	@Column
	private LocalDate ni_fecdoc;
	@Column
	private LocalDate ni_feccom;
	@Column
	private String ni_codmon;
	@Column
	private double ni_saldus;
	@Column
	private double ni_saldmn;
	@Column
	private double ni_salamn;
	@Column
	private double ni_difemn;
	@Column
	private double ni_salaus;
	@Column
	private double ni_difeus;
	@Column
	private double ni_saltus;
	@Column
	private double ni_saltmn;
	@Column
	private double ni_tipcam;
	@Column
	private String ni_subdia;
	@Column
	private String ni_compro;
	@Column
	private LocalDate ni_fecpro;
	@Column
	private String ni_usucre;
	@Column
	private LocalDate ni_feccre;
	@Column
	private LocalTime ni_horcre;
	
	

	public lconic21() {
		super();
		// TODO Auto-generated constructor stub
	}
	public lconic21(lconic21Pk pk, String ni_glosa1, LocalDate ni_fecdoc, LocalDate ni_feccom, String ni_codmon,
			double ni_saldus, double ni_saldmn, double ni_salamn, double ni_difemn, double ni_salaus, double ni_difeus,
			double ni_saltus, double ni_saltmn, double ni_tipcam, String ni_subdia, String ni_compro,
			LocalDate ni_fecpro, String ni_usucre, LocalDate ni_feccre, LocalTime ni_horcre) {
		super();
		this.pk = pk;
		this.ni_glosa1 = ni_glosa1;
		this.ni_fecdoc = ni_fecdoc;
		this.ni_feccom = ni_feccom;
		this.ni_codmon = ni_codmon;
		this.ni_saldus = ni_saldus;
		this.ni_saldmn = ni_saldmn;
		this.ni_salamn = ni_salamn;
		this.ni_difemn = ni_difemn;
		this.ni_salaus = ni_salaus;
		this.ni_difeus = ni_difeus;
		this.ni_saltus = ni_saltus;
		this.ni_saltmn = ni_saltmn;
		this.ni_tipcam = ni_tipcam;
		this.ni_subdia = ni_subdia;
		this.ni_compro = ni_compro;
		this.ni_fecpro = ni_fecpro;
		this.ni_usucre = ni_usucre;
		this.ni_feccre = ni_feccre;
		this.ni_horcre = ni_horcre;
	}
	public lconic21Pk getPk() {
		return pk;
	}
	public void setPk(lconic21Pk pk) {
		this.pk = pk;
	}
	public String getNi_glosa1() {
		return ni_glosa1;
	}
	public void setNi_glosa1(String ni_glosa1) {
		this.ni_glosa1 = ni_glosa1;
	}
	public LocalDate getNi_fecdoc() {
		return ni_fecdoc;
	}
	public void setNi_fecdoc(LocalDate ni_fecdoc) {
		this.ni_fecdoc = ni_fecdoc;
	}
	public LocalDate getNi_feccom() {
		return ni_feccom;
	}
	public void setNi_feccom(LocalDate ni_feccom) {
		this.ni_feccom = ni_feccom;
	}
	public String getNi_codmon() {
		return ni_codmon;
	}
	public void setNi_codmon(String ni_codmon) {
		this.ni_codmon = ni_codmon;
	}
	public double getNi_saldus() {
		return ni_saldus;
	}
	public void setNi_saldus(double ni_saldus) {
		this.ni_saldus = ni_saldus;
	}
	public double getNi_saldmn() {
		return ni_saldmn;
	}
	public void setNi_saldmn(double ni_saldmn) {
		this.ni_saldmn = ni_saldmn;
	}
	public double getNi_salamn() {
		return ni_salamn;
	}
	public void setNi_salamn(double ni_salamn) {
		this.ni_salamn = ni_salamn;
	}
	public double getNi_difemn() {
		return ni_difemn;
	}
	public void setNi_difemn(double ni_difemn) {
		this.ni_difemn = ni_difemn;
	}
	public double getNi_salaus() {
		return ni_salaus;
	}
	public void setNi_salaus(double ni_salaus) {
		this.ni_salaus = ni_salaus;
	}
	public double getNi_difeus() {
		return ni_difeus;
	}
	public void setNi_difeus(double ni_difeus) {
		this.ni_difeus = ni_difeus;
	}
	public double getNi_saltus() {
		return ni_saltus;
	}
	public void setNi_saltus(double ni_saltus) {
		this.ni_saltus = ni_saltus;
	}
	public double getNi_saltmn() {
		return ni_saltmn;
	}
	public void setNi_saltmn(double ni_saltmn) {
		this.ni_saltmn = ni_saltmn;
	}
	public double getNi_tipcam() {
		return ni_tipcam;
	}
	public void setNi_tipcam(double ni_tipcam) {
		this.ni_tipcam = ni_tipcam;
	}
	public String getNi_subdia() {
		return ni_subdia;
	}
	public void setNi_subdia(String ni_subdia) {
		this.ni_subdia = ni_subdia;
	}
	public String getNi_compro() {
		return ni_compro;
	}
	public void setNi_compro(String ni_compro) {
		this.ni_compro = ni_compro;
	}
	public LocalDate getNi_fecpro() {
		return ni_fecpro;
	}
	public void setNi_fecpro(LocalDate ni_fecpro) {
		this.ni_fecpro = ni_fecpro;
	}
	public String getNi_usucre() {
		return ni_usucre;
	}
	public void setNi_usucre(String ni_usucre) {
		this.ni_usucre = ni_usucre;
	}
	public LocalDate getNi_feccre() {
		return ni_feccre;
	}
	public void setNi_feccre(LocalDate ni_feccre) {
		this.ni_feccre = ni_feccre;
	}
	public LocalTime getNi_horcre() {
		return ni_horcre;
	}
	public void setNi_horcre(LocalTime ni_horcre) {
		this.ni_horcre = ni_horcre;
	}

}
