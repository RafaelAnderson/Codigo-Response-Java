package com.empresa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lco0001refv21")
public class lcoRefv21 {

	@Id
	@EmbeddedId
	private lcoRefv21Pk lcoRefv21pk;
	
	private String rf_tpanex;
	private String rf_cdanex;
	private String rf_tipdocr;
	private String rf_nmdocr;
	private String rf_serdoc;
	private String rf_numdoc;
	private LocalDate rf_fecdoc;

	@Column(name = "rf_base", nullable = true)
	private Double rf_base;
	@Column(name = "rf_basemn", nullable = true)
	private Double rf_basemn;
	@Column(name = "rf_baseme", nullable = true)
	private Double rf_baseme;
	@Column(name = "rf_igv", nullable = true)
	private Double rf_igv;
	@Column(name = "rf_igvmn", nullable = true)
	private Double rf_igvmn;
	@Column(name = "rf_igvme", nullable = true)
	private Double rf_igvme;
	
	public lcoRefv21(lcoRefv21Pk lcoRefv21pk, String rf_tpanex, String rf_cdanex, String rf_tipdocr, String rf_nmdocr,
			String rf_serdoc, String rf_numdoc, LocalDate rf_fecdoc, Double rf_base, Double rf_basemn, Double rf_baseme,
			Double rf_igv, Double rf_igvmn, Double rf_igvme) {
		super();
		this.lcoRefv21pk = lcoRefv21pk;
		this.rf_tpanex = rf_tpanex;
		this.rf_cdanex = rf_cdanex;
		this.rf_tipdocr = rf_tipdocr;
		this.rf_nmdocr = rf_nmdocr;
		this.rf_serdoc = rf_serdoc;
		this.rf_numdoc = rf_numdoc;
		this.rf_fecdoc = rf_fecdoc;
		this.rf_base = rf_base;
		this.rf_basemn = rf_basemn;
		this.rf_baseme = rf_baseme;
		this.rf_igv = rf_igv;
		this.rf_igvmn = rf_igvmn;
		this.rf_igvme = rf_igvme;
	}
	public lcoRefv21Pk getLcoRefv21pk() {
		return lcoRefv21pk;
	}
	public void setLcoRefv21pk(lcoRefv21Pk lcoRefv21pk) {
		this.lcoRefv21pk = lcoRefv21pk;
	}
	public String getRf_tpanex() {
		return rf_tpanex;
	}
	public void setRf_tpanex(String rf_tpanex) {
		this.rf_tpanex = rf_tpanex;
	}
	public String getRf_cdanex() {
		return rf_cdanex;
	}
	public void setRf_cdanex(String rf_cdanex) {
		this.rf_cdanex = rf_cdanex;
	}
	public String getRf_tipdocr() {
		return rf_tipdocr;
	}
	public void setRf_tipdocr(String rf_tipdocr) {
		this.rf_tipdocr = rf_tipdocr;
	}
	public String getRf_nmdocr() {
		return rf_nmdocr;
	}
	public void setRf_nmdocr(String rf_nmdocr) {
		this.rf_nmdocr = rf_nmdocr;
	}
	public String getRf_serdoc() {
		return rf_serdoc;
	}
	public void setRf_serdoc(String rf_serdoc) {
		this.rf_serdoc = rf_serdoc;
	}
	public String getRf_numdoc() {
		return rf_numdoc;
	}
	public void setRf_numdoc(String rf_numdoc) {
		this.rf_numdoc = rf_numdoc;
	}
	public LocalDate getRf_fecdoc() {
		return rf_fecdoc;
	}
	public void setRf_fecdoc(LocalDate rf_fecdoc) {
		this.rf_fecdoc = rf_fecdoc;
	}
	public Double getRf_base() {
		return rf_base;
	}
	public void setRf_base(Double rf_base) {
		this.rf_base = rf_base;
	}
	public Double getRf_basemn() {
		return rf_basemn;
	}
	public void setRf_basemn(Double rf_basemn) {
		this.rf_basemn = rf_basemn;
	}
	public Double getRf_baseme() {
		return rf_baseme;
	}
	public void setRf_baseme(Double rf_baseme) {
		this.rf_baseme = rf_baseme;
	}
	public Double getRf_igv() {
		return rf_igv;
	}
	public void setRf_igv(Double rf_igv) {
		this.rf_igv = rf_igv;
	}
	public Double getRf_igvmn() {
		return rf_igvmn;
	}
	public void setRf_igvmn(Double rf_igvmn) {
		this.rf_igvmn = rf_igvmn;
	}
	public Double getRf_igvme() {
		return rf_igvme;
	}
	public void setRf_igvme(Double rf_igvme) {
		this.rf_igvme = rf_igvme;
	}
	
	
}
