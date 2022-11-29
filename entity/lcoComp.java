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
@Table(name="lco0001comp2101")
public class lcoComp {

	@EmbeddedId	
	lcoCompPk pk;
	  
	  LocalDate rc_feccom;
	  
	  LocalDate rc_fecdoc;
	  
	  LocalDate rc_fecven;
	  
	  String rc_tipdoc;
	  String rc_serdoc;
	  String rc_nrodoc;
	  String rc_numdoc;
	  String rc_tipane;
	  String rc_codane;
	  String rc_tipdocide;
	  String rc_rucane;
	  String rc_nomane;
	  @Column( length = 3 )
	  String rc_codmon;
	  
	  @Column(name="rc_afemn", nullable = true)
	  Double rc_afemn;
	  @Column(name="rc_inamn", nullable = true)
	  Double rc_inamn;
	  @Column(name="rc_igvmn", nullable = true)
	  Double rc_igvmn;
	  @Column(name="rc_impomn", nullable = true)
	  Double rc_impomn;
	  @Column(name="rc_iscmn", nullable = true)
	  Double rc_iscmn;
	  @Column(name="rc_otrmn", nullable = true)
	  Double rc_otrmn;
	  @Column(name="rc_detemn", nullable = true)
	  Double rc_detemn;
	  @Column(name="rc_afeme", nullable = true)
	  Double rc_afeme;
	  @Column(name="rc_iname", nullable = true)
	  Double rc_iname;
	  @Column(name="rc_igvme", nullable = true)
	  Double rc_igvme;
	  @Column(name="rc_impome", nullable = true)
	  Double rc_impome;
	  @Column(name="rc_iscme", nullable = true)
	  Double rc_iscme;
	  @Column(name="rc_otrme", nullable = true)
	  Double rc_otrme;
	  @Column(name="rc_deteme", nullable = true)
	  Double rc_deteme;
	  
	  String rc_numdet;
	  
	  LocalDate rc_fecdet;
	  String rc_coddet;
	  
	  @Column(name="rc_tipcam", nullable = true)
	  Double rc_tipcam;
	  
	  LocalDate rc_fedore;
	  String rc_tidore;
	  String rc_sedore;
	  String rc_nudore;
	  
	  @Column(name="rc_recmn", nullable = true)
	  Double rc_recmn;
	  @Column(name="rc_recme", nullable = true)
	  Double rc_recme;
	  @Column(name="rc_bolmn", nullable = true)
	  Double rc_bolmn;
	  @Column(name="rc_bolme", nullable = true)
	  Double rc_bolme;
	  String rc_medpag;
	  String rc_datadi;
	  String rc_cuenta;
	  String rc_estado;
	  String rc_perrec;
	  String rc_codcla;
	  
	  String rc_usucre;
	  LocalDate rc_feccre;
	  LocalTime rc_horcre;
	  
	  String rc_usuact;
	  LocalDate rc_fecact;
	  LocalTime rc_hraact;

	  String rc_anodua;
	  
	  
	  public lcoComp() {
			super();
			// TODO Auto-generated constructor stub
		}


	public lcoComp(lcoCompPk pk, LocalDate rc_feccom, LocalDate rc_fecdoc, LocalDate rc_fecven, String rc_tipdoc,
			String rc_serdoc, String rc_nrodoc, String rc_numdoc, String rc_tipane, String rc_codane,
			String rc_tipdocide, String rc_rucane, String rc_nomane, String rc_codmon, Double rc_afemn, Double rc_inamn,
			Double rc_igvmn, Double rc_impomn, Double rc_iscmn, Double rc_otrmn, Double rc_detemn, Double rc_afeme,
			Double rc_iname, Double rc_igvme, Double rc_impome, Double rc_iscme, Double rc_otrme, Double rc_deteme,
			String rc_numdet, LocalDate rc_fecdet, String rc_coddet, Double rc_tipcam, LocalDate rc_fedore,
			String rc_tidore, String rc_sedore, String rc_nudore, Double rc_recmn, Double rc_recme, Double rc_bolmn,
			Double rc_bolme, String rc_medpag, String rc_datadi, String rc_cuenta, String rc_estado, String rc_perrec,
			String rc_codcla, String rc_usucre, LocalDate rc_feccre, LocalTime rc_horcre, String rc_usuact,
			LocalDate rc_fecact, LocalTime rc_hraact, String rc_anodua) {
		this.pk = pk;
		this.rc_feccom = rc_feccom;
		this.rc_fecdoc = rc_fecdoc;
		this.rc_fecven = rc_fecven;
		this.rc_tipdoc = rc_tipdoc;
		this.rc_serdoc = rc_serdoc;
		this.rc_nrodoc = rc_nrodoc;
		this.rc_numdoc = rc_numdoc;
		this.rc_tipane = rc_tipane;
		this.rc_codane = rc_codane;
		this.rc_tipdocide = rc_tipdocide;
		this.rc_rucane = rc_rucane;
		this.rc_nomane = rc_nomane;
		this.rc_codmon = rc_codmon;
		this.rc_afemn = rc_afemn;
		this.rc_inamn = rc_inamn;
		this.rc_igvmn = rc_igvmn;
		this.rc_impomn = rc_impomn;
		this.rc_iscmn = rc_iscmn;
		this.rc_otrmn = rc_otrmn;
		this.rc_detemn = rc_detemn;
		this.rc_afeme = rc_afeme;
		this.rc_iname = rc_iname;
		this.rc_igvme = rc_igvme;
		this.rc_impome = rc_impome;
		this.rc_iscme = rc_iscme;
		this.rc_otrme = rc_otrme;
		this.rc_deteme = rc_deteme;
		this.rc_numdet = rc_numdet;
		this.rc_fecdet = rc_fecdet;
		this.rc_coddet = rc_coddet;
		this.rc_tipcam = rc_tipcam;
		this.rc_fedore = rc_fedore;
		this.rc_tidore = rc_tidore;
		this.rc_sedore = rc_sedore;
		this.rc_nudore = rc_nudore;
		this.rc_recmn = rc_recmn;
		this.rc_recme = rc_recme;
		this.rc_bolmn = rc_bolmn;
		this.rc_bolme = rc_bolme;
		this.rc_medpag = rc_medpag;
		this.rc_datadi = rc_datadi;
		this.rc_cuenta = rc_cuenta;
		this.rc_estado = rc_estado;
		this.rc_perrec = rc_perrec;
		this.rc_codcla = rc_codcla;
		this.rc_usucre = rc_usucre;
		this.rc_feccre = rc_feccre;
		this.rc_horcre = rc_horcre;
		this.rc_usuact = rc_usuact;
		this.rc_fecact = rc_fecact;
		this.rc_hraact = rc_hraact;
		this.rc_anodua = rc_anodua;
	}


	public lcoCompPk getPk() {
		return pk;
	}


	public void setPk(lcoCompPk pk) {
		this.pk = pk;
	}


	public LocalDate getRc_feccom() {
		return rc_feccom;
	}


	public void setRc_feccom(LocalDate rc_feccom) {
		this.rc_feccom = rc_feccom;
	}


	public LocalDate getRc_fecdoc() {
		return rc_fecdoc;
	}


	public void setRc_fecdoc(LocalDate rc_fecdoc) {
		this.rc_fecdoc = rc_fecdoc;
	}


	public LocalDate getRc_fecven() {
		return rc_fecven;
	}


	public void setRc_fecven(LocalDate rc_fecven) {
		this.rc_fecven = rc_fecven;
	}


	public String getRc_tipdoc() {
		return rc_tipdoc;
	}


	public void setRc_tipdoc(String rc_tipdoc) {
		this.rc_tipdoc = rc_tipdoc;
	}


	public String getRc_serdoc() {
		return rc_serdoc;
	}


	public void setRc_serdoc(String rc_serdoc) {
		this.rc_serdoc = rc_serdoc;
	}


	public String getRc_nrodoc() {
		return rc_nrodoc;
	}


	public void setRc_nrodoc(String rc_nrodoc) {
		this.rc_nrodoc = rc_nrodoc;
	}


	public String getRc_numdoc() {
		return rc_numdoc;
	}


	public void setRc_numdoc(String rc_numdoc) {
		this.rc_numdoc = rc_numdoc;
	}


	public String getRc_tipane() {
		return rc_tipane;
	}


	public void setRc_tipane(String rc_tipane) {
		this.rc_tipane = rc_tipane;
	}


	public String getRc_codane() {
		return rc_codane;
	}


	public void setRc_codane(String rc_codane) {
		this.rc_codane = rc_codane;
	}


	public String getRc_tipdocide() {
		return rc_tipdocide;
	}


	public void setRc_tipdocide(String rc_tipdocide) {
		this.rc_tipdocide = rc_tipdocide;
	}


	public String getRc_rucane() {
		return rc_rucane;
	}


	public void setRc_rucane(String rc_rucane) {
		this.rc_rucane = rc_rucane;
	}


	public String getRc_nomane() {
		return rc_nomane;
	}


	public void setRc_nomane(String rc_nomane) {
		this.rc_nomane = rc_nomane;
	}


	public String getRc_codmon() {
		return rc_codmon;
	}


	public void setRc_codmon(String rc_codmon) {
		this.rc_codmon = rc_codmon;
	}


	public Double getRc_afemn() {
		return rc_afemn;
	}


	public void setRc_afemn(Double rc_afemn) {
		this.rc_afemn = rc_afemn;
	}


	public Double getRc_inamn() {
		return rc_inamn;
	}


	public void setRc_inamn(Double rc_inamn) {
		this.rc_inamn = rc_inamn;
	}


	public Double getRc_igvmn() {
		return rc_igvmn;
	}


	public void setRc_igvmn(Double rc_igvmn) {
		this.rc_igvmn = rc_igvmn;
	}


	public Double getRc_impomn() {
		return rc_impomn;
	}


	public void setRc_impomn(Double rc_impomn) {
		this.rc_impomn = rc_impomn;
	}


	public Double getRc_iscmn() {
		return rc_iscmn;
	}


	public void setRc_iscmn(Double rc_iscmn) {
		this.rc_iscmn = rc_iscmn;
	}


	public Double getRc_otrmn() {
		return rc_otrmn;
	}


	public void setRc_otrmn(Double rc_otrmn) {
		this.rc_otrmn = rc_otrmn;
	}


	public Double getRc_detemn() {
		return rc_detemn;
	}


	public void setRc_detemn(Double rc_detemn) {
		this.rc_detemn = rc_detemn;
	}


	public Double getRc_afeme() {
		return rc_afeme;
	}


	public void setRc_afeme(Double rc_afeme) {
		this.rc_afeme = rc_afeme;
	}


	public Double getRc_iname() {
		return rc_iname;
	}


	public void setRc_iname(Double rc_iname) {
		this.rc_iname = rc_iname;
	}


	public Double getRc_igvme() {
		return rc_igvme;
	}


	public void setRc_igvme(Double rc_igvme) {
		this.rc_igvme = rc_igvme;
	}


	public Double getRc_impome() {
		return rc_impome;
	}


	public void setRc_impome(Double rc_impome) {
		this.rc_impome = rc_impome;
	}


	public Double getRc_iscme() {
		return rc_iscme;
	}


	public void setRc_iscme(Double rc_iscme) {
		this.rc_iscme = rc_iscme;
	}


	public Double getRc_otrme() {
		return rc_otrme;
	}


	public void setRc_otrme(Double rc_otrme) {
		this.rc_otrme = rc_otrme;
	}


	public Double getRc_deteme() {
		return rc_deteme;
	}


	public void setRc_deteme(Double rc_deteme) {
		this.rc_deteme = rc_deteme;
	}


	public String getRc_numdet() {
		return rc_numdet;
	}


	public void setRc_numdet(String rc_numdet) {
		this.rc_numdet = rc_numdet;
	}


	public LocalDate getRc_fecdet() {
		return rc_fecdet;
	}


	public void setRc_fecdet(LocalDate rc_fecdet) {
		this.rc_fecdet = rc_fecdet;
	}


	public String getRc_coddet() {
		return rc_coddet;
	}


	public void setRc_coddet(String rc_coddet) {
		this.rc_coddet = rc_coddet;
	}


	public Double getRc_tipcam() {
		return rc_tipcam;
	}


	public void setRc_tipcam(Double rc_tipcam) {
		this.rc_tipcam = rc_tipcam;
	}


	public LocalDate getRc_fedore() {
		return rc_fedore;
	}


	public void setRc_fedore(LocalDate rc_fedore) {
		this.rc_fedore = rc_fedore;
	}


	public String getRc_tidore() {
		return rc_tidore;
	}


	public void setRc_tidore(String rc_tidore) {
		this.rc_tidore = rc_tidore;
	}


	public String getRc_sedore() {
		return rc_sedore;
	}


	public void setRc_sedore(String rc_sedore) {
		this.rc_sedore = rc_sedore;
	}


	public String getRc_nudore() {
		return rc_nudore;
	}


	public void setRc_nudore(String rc_nudore) {
		this.rc_nudore = rc_nudore;
	}


	public Double getRc_recmn() {
		return rc_recmn;
	}


	public void setRc_recmn(Double rc_recmn) {
		this.rc_recmn = rc_recmn;
	}


	public Double getRc_recme() {
		return rc_recme;
	}


	public void setRc_recme(Double rc_recme) {
		this.rc_recme = rc_recme;
	}


	public Double getRc_bolmn() {
		return rc_bolmn;
	}


	public void setRc_bolmn(Double rc_bolmn) {
		this.rc_bolmn = rc_bolmn;
	}


	public Double getRc_bolme() {
		return rc_bolme;
	}


	public void setRc_bolme(Double rc_bolme) {
		this.rc_bolme = rc_bolme;
	}


	public String getRc_medpag() {
		return rc_medpag;
	}


	public void setRc_medpag(String rc_medpag) {
		this.rc_medpag = rc_medpag;
	}


	public String getRc_datadi() {
		return rc_datadi;
	}


	public void setRc_datadi(String rc_datadi) {
		this.rc_datadi = rc_datadi;
	}


	public String getRc_cuenta() {
		return rc_cuenta;
	}


	public void setRc_cuenta(String rc_cuenta) {
		this.rc_cuenta = rc_cuenta;
	}


	public String getRc_estado() {
		return rc_estado;
	}


	public void setRc_estado(String rc_estado) {
		this.rc_estado = rc_estado;
	}


	public String getRc_perrec() {
		return rc_perrec;
	}


	public void setRc_perrec(String rc_perrec) {
		this.rc_perrec = rc_perrec;
	}


	public String getRc_codcla() {
		return rc_codcla;
	}


	public void setRc_codcla(String rc_codcla) {
		this.rc_codcla = rc_codcla;
	}


	public String getRc_usucre() {
		return rc_usucre;
	}


	public void setRc_usucre(String rc_usucre) {
		this.rc_usucre = rc_usucre;
	}


	public LocalDate getRc_feccre() {
		return rc_feccre;
	}


	public void setRc_feccre(LocalDate rc_feccre) {
		this.rc_feccre = rc_feccre;
	}


	public LocalTime getRc_horcre() {
		return rc_horcre;
	}


	public void setRc_horcre(LocalTime rc_horcre) {
		this.rc_horcre = rc_horcre;
	}


	public String getRc_usuact() {
		return rc_usuact;
	}


	public void setRc_usuact(String rc_usuact) {
		this.rc_usuact = rc_usuact;
	}


	public LocalDate getRc_fecact() {
		return rc_fecact;
	}


	public void setRc_fecact(LocalDate rc_fecact) {
		this.rc_fecact = rc_fecact;
	}


	public LocalTime getRc_hraact() {
		return rc_hraact;
	}


	public void setRc_hraact(LocalTime rc_hraact) {
		this.rc_hraact = rc_hraact;
	}


	public String getRc_anodua() {
		return rc_anodua;
	}


	public void setRc_anodua(String rc_anodua) {
		this.rc_anodua = rc_anodua;
	} 
	

}
