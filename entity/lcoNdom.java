package com.empresa.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="lco0001ndom21")
public class lcoNdom {

	@EmbeddedId
	private lcoNdomPk pkID;
	private Date nd_feccom;
	private String nd_moneda;
	private String nd_cencst;
	private String nd_tpanex;
	private String nd_cdanex;
	private String nd_tpanex2;
	private String nd_cdanex2;
	private String nd_tpdoc;
	private String nd_nmdoc;
	private String nd_docser;
	private String nd_docnum;
	private Date   nd_fecdoc;
	private Date   nd_fecven;
	private double nd_impadq;
	private double nd_impadqmn;
	private double nd_impaqdme;
	private String nd_codtrib;
	private double nd_impotrib;
	private double nd_impotribmn;
	private double nd_impotribme;
	private double nd_impvalor;
	private double nd_impvalormn;
	private double nd_impvalorme;
	private String nd_tprenta;
	private double nd_impdeduc;
	private double nd_impdeducmn;
	private double nd_impdeducme;
	private double nd_imprentab;
	private double nd_imprentabmn;
	private double nd_imprentabme;
	private String nd_tpreten;
	private double nd_tasareten;
	private double nd_impreten;
	private double nd_impretenmn;
	private double nd_impretenme;
	private String nd_cdexonapli;
	private double nd_tasaigv;
	private double nd_impigv;
	private double nd_impigvmn;
	private double nd_impigvme;
	private double nd_tipcam;
	private String nd_tpdua;
	private String nd_cddua;
	private String nd_nrodua;
	private String nd_tpanexbene;
	private String nd_cdanexbene;
	private String nd_boltigv;
	private String nd_nroform;
	private String nd_modserv;
	private String nd_aplicapa;
	private String nd_monref;
	private double nd_tpcamref;
	public lcoNdom(lcoNdomPk pkID, Date nd_feccom, String nd_moneda, String nd_cencst, String nd_tpanex,
			String nd_cdanex, String nd_tpanex2, String nd_cdanex2, String nd_tpdoc, String nd_nmdoc, String nd_docser,
			String nd_docnum, Date nd_fecdoc, Date nd_fecven, double nd_impadq, double nd_impadqmn, double nd_impaqdme,
			String nd_codtrib, double nd_impotrib, double nd_impotribmn, double nd_impotribme, double nd_impvalor,
			double nd_impvalormn, double nd_impvalorme, String nd_tprenta, double nd_impdeduc, double nd_impdeducmn,
			double nd_impdeducme, double nd_imprentab, double nd_imprentabmn, double nd_imprentabme, String nd_tpreten,
			double nd_tasareten, double nd_impreten, double nd_impretenmn, double nd_impretenme, String nd_cdexonapli,
			double nd_tasaigv, double nd_impigv, double nd_impigvmn, double nd_impigvme, double nd_tipcam,
			String nd_tpdua, String nd_cddua, String nd_nrodua, String nd_tpanexbene, String nd_cdanexbene,
			String nd_boltigv, String nd_nroform, String nd_modserv, String nd_aplicapa, String nd_monref,
			double nd_tpcamref) {
		super();
		this.pkID = pkID;
		this.nd_feccom = nd_feccom;
		this.nd_moneda = nd_moneda;
		this.nd_cencst = nd_cencst;
		this.nd_tpanex = nd_tpanex;
		this.nd_cdanex = nd_cdanex;
		this.nd_tpanex2 = nd_tpanex2;
		this.nd_cdanex2 = nd_cdanex2;
		this.nd_tpdoc = nd_tpdoc;
		this.nd_nmdoc = nd_nmdoc;
		this.nd_docser = nd_docser;
		this.nd_docnum = nd_docnum;
		this.nd_fecdoc = nd_fecdoc;
		this.nd_fecven = nd_fecven;
		this.nd_impadq = nd_impadq;
		this.nd_impadqmn = nd_impadqmn;
		this.nd_impaqdme = nd_impaqdme;
		this.nd_codtrib = nd_codtrib;
		this.nd_impotrib = nd_impotrib;
		this.nd_impotribmn = nd_impotribmn;
		this.nd_impotribme = nd_impotribme;
		this.nd_impvalor = nd_impvalor;
		this.nd_impvalormn = nd_impvalormn;
		this.nd_impvalorme = nd_impvalorme;
		this.nd_tprenta = nd_tprenta;
		this.nd_impdeduc = nd_impdeduc;
		this.nd_impdeducmn = nd_impdeducmn;
		this.nd_impdeducme = nd_impdeducme;
		this.nd_imprentab = nd_imprentab;
		this.nd_imprentabmn = nd_imprentabmn;
		this.nd_imprentabme = nd_imprentabme;
		this.nd_tpreten = nd_tpreten;
		this.nd_tasareten = nd_tasareten;
		this.nd_impreten = nd_impreten;
		this.nd_impretenmn = nd_impretenmn;
		this.nd_impretenme = nd_impretenme;
		this.nd_cdexonapli = nd_cdexonapli;
		this.nd_tasaigv = nd_tasaigv;
		this.nd_impigv = nd_impigv;
		this.nd_impigvmn = nd_impigvmn;
		this.nd_impigvme = nd_impigvme;
		this.nd_tipcam = nd_tipcam;
		this.nd_tpdua = nd_tpdua;
		this.nd_cddua = nd_cddua;
		this.nd_nrodua = nd_nrodua;
		this.nd_tpanexbene = nd_tpanexbene;
		this.nd_cdanexbene = nd_cdanexbene;
		this.nd_boltigv = nd_boltigv;
		this.nd_nroform = nd_nroform;
		this.nd_modserv = nd_modserv;
		this.nd_aplicapa = nd_aplicapa;
		this.nd_monref = nd_monref;
		this.nd_tpcamref = nd_tpcamref;
	}
	public lcoNdom() {
		super();
	}
	public lcoNdomPk getPkID() {
		return pkID;
	}
	public void setPkID(lcoNdomPk pkID) {
		this.pkID = pkID;
	}
	public Date getNd_feccom() {
		return nd_feccom;
	}
	public void setNd_feccom(Date nd_feccom) {
		this.nd_feccom = nd_feccom;
	}
	public String getNd_moneda() {
		return nd_moneda;
	}
	public void setNd_moneda(String nd_moneda) {
		this.nd_moneda = nd_moneda;
	}
	public String getNd_cencst() {
		return nd_cencst;
	}
	public void setNd_cencst(String nd_cencst) {
		this.nd_cencst = nd_cencst;
	}
	public String getNd_tpanex() {
		return nd_tpanex;
	}
	public void setNd_tpanex(String nd_tpanex) {
		this.nd_tpanex = nd_tpanex;
	}
	public String getNd_cdanex() {
		return nd_cdanex;
	}
	public void setNd_cdanex(String nd_cdanex) {
		this.nd_cdanex = nd_cdanex;
	}
	public String getNd_tpanex2() {
		return nd_tpanex2;
	}
	public void setNd_tpanex2(String nd_tpanex2) {
		this.nd_tpanex2 = nd_tpanex2;
	}
	public String getNd_cdanex2() {
		return nd_cdanex2;
	}
	public void setNd_cdanex2(String nd_cdanex2) {
		this.nd_cdanex2 = nd_cdanex2;
	}
	public String getNd_tpdoc() {
		return nd_tpdoc;
	}
	public void setNd_tpdoc(String nd_tpdoc) {
		this.nd_tpdoc = nd_tpdoc;
	}
	public String getNd_nmdoc() {
		return nd_nmdoc;
	}
	public void setNd_nmdoc(String nd_nmdoc) {
		this.nd_nmdoc = nd_nmdoc;
	}
	public String getNd_docser() {
		return nd_docser;
	}
	public void setNd_docser(String nd_docser) {
		this.nd_docser = nd_docser;
	}
	public String getNd_docnum() {
		return nd_docnum;
	}
	public void setNd_docnum(String nd_docnum) {
		this.nd_docnum = nd_docnum;
	}
	public Date getNd_fecdoc() {
		return nd_fecdoc;
	}
	public void setNd_fecdoc(Date nd_fecdoc) {
		this.nd_fecdoc = nd_fecdoc;
	}
	public Date getNd_fecven() {
		return nd_fecven;
	}
	public void setNd_fecven(Date nd_fecven) {
		this.nd_fecven = nd_fecven;
	}
	public double getNd_impadq() {
		return nd_impadq;
	}
	public void setNd_impadq(double nd_impadq) {
		this.nd_impadq = nd_impadq;
	}
	public double getNd_impadqmn() {
		return nd_impadqmn;
	}
	public void setNd_impadqmn(double nd_impadqmn) {
		this.nd_impadqmn = nd_impadqmn;
	}
	public double getNd_impaqdme() {
		return nd_impaqdme;
	}
	public void setNd_impaqdme(double nd_impaqdme) {
		this.nd_impaqdme = nd_impaqdme;
	}
	public String getNd_codtrib() {
		return nd_codtrib;
	}
	public void setNd_codtrib(String nd_codtrib) {
		this.nd_codtrib = nd_codtrib;
	}
	public double getNd_impotrib() {
		return nd_impotrib;
	}
	public void setNd_impotrib(double nd_impotrib) {
		this.nd_impotrib = nd_impotrib;
	}
	public double getNd_impotribmn() {
		return nd_impotribmn;
	}
	public void setNd_impotribmn(double nd_impotribmn) {
		this.nd_impotribmn = nd_impotribmn;
	}
	public double getNd_impotribme() {
		return nd_impotribme;
	}
	public void setNd_impotribme(double nd_impotribme) {
		this.nd_impotribme = nd_impotribme;
	}
	public double getNd_impvalor() {
		return nd_impvalor;
	}
	public void setNd_impvalor(double nd_impvalor) {
		this.nd_impvalor = nd_impvalor;
	}
	public double getNd_impvalormn() {
		return nd_impvalormn;
	}
	public void setNd_impvalormn(double nd_impvalormn) {
		this.nd_impvalormn = nd_impvalormn;
	}
	public double getNd_impvalorme() {
		return nd_impvalorme;
	}
	public void setNd_impvalorme(double nd_impvalorme) {
		this.nd_impvalorme = nd_impvalorme;
	}
	public String getNd_tprenta() {
		return nd_tprenta;
	}
	public void setNd_tprenta(String nd_tprenta) {
		this.nd_tprenta = nd_tprenta;
	}
	public double getNd_impdeduc() {
		return nd_impdeduc;
	}
	public void setNd_impdeduc(double nd_impdeduc) {
		this.nd_impdeduc = nd_impdeduc;
	}
	public double getNd_impdeducmn() {
		return nd_impdeducmn;
	}
	public void setNd_impdeducmn(double nd_impdeducmn) {
		this.nd_impdeducmn = nd_impdeducmn;
	}
	public double getNd_impdeducme() {
		return nd_impdeducme;
	}
	public void setNd_impdeducme(double nd_impdeducme) {
		this.nd_impdeducme = nd_impdeducme;
	}
	public double getNd_imprentab() {
		return nd_imprentab;
	}
	public void setNd_imprentab(double nd_imprentab) {
		this.nd_imprentab = nd_imprentab;
	}
	public double getNd_imprentabmn() {
		return nd_imprentabmn;
	}
	public void setNd_imprentabmn(double nd_imprentabmn) {
		this.nd_imprentabmn = nd_imprentabmn;
	}
	public double getNd_imprentabme() {
		return nd_imprentabme;
	}
	public void setNd_imprentabme(double nd_imprentabme) {
		this.nd_imprentabme = nd_imprentabme;
	}
	public String getNd_tpreten() {
		return nd_tpreten;
	}
	public void setNd_tpreten(String nd_tpreten) {
		this.nd_tpreten = nd_tpreten;
	}
	public double getNd_tasareten() {
		return nd_tasareten;
	}
	public void setNd_tasareten(double nd_tasareten) {
		this.nd_tasareten = nd_tasareten;
	}
	public double getNd_impreten() {
		return nd_impreten;
	}
	public void setNd_impreten(double nd_impreten) {
		this.nd_impreten = nd_impreten;
	}
	public double getNd_impretenmn() {
		return nd_impretenmn;
	}
	public void setNd_impretenmn(double nd_impretenmn) {
		this.nd_impretenmn = nd_impretenmn;
	}
	public double getNd_impretenme() {
		return nd_impretenme;
	}
	public void setNd_impretenme(double nd_impretenme) {
		this.nd_impretenme = nd_impretenme;
	}
	public String getNd_cdexonapli() {
		return nd_cdexonapli;
	}
	public void setNd_cdexonapli(String nd_cdexonapli) {
		this.nd_cdexonapli = nd_cdexonapli;
	}
	public double getNd_tasaigv() {
		return nd_tasaigv;
	}
	public void setNd_tasaigv(double nd_tasaigv) {
		this.nd_tasaigv = nd_tasaigv;
	}
	public double getNd_impigv() {
		return nd_impigv;
	}
	public void setNd_impigv(double nd_impigv) {
		this.nd_impigv = nd_impigv;
	}
	public double getNd_impigvmn() {
		return nd_impigvmn;
	}
	public void setNd_impigvmn(double nd_impigvmn) {
		this.nd_impigvmn = nd_impigvmn;
	}
	public double getNd_impigvme() {
		return nd_impigvme;
	}
	public void setNd_impigvme(double nd_impigvme) {
		this.nd_impigvme = nd_impigvme;
	}
	public double getNd_tipcam() {
		return nd_tipcam;
	}
	public void setNd_tipcam(double nd_tipcam) {
		this.nd_tipcam = nd_tipcam;
	}
	public String getNd_tpdua() {
		return nd_tpdua;
	}
	public void setNd_tpdua(String nd_tpdua) {
		this.nd_tpdua = nd_tpdua;
	}
	public String getNd_cddua() {
		return nd_cddua;
	}
	public void setNd_cddua(String nd_cddua) {
		this.nd_cddua = nd_cddua;
	}
	public String getNd_nrodua() {
		return nd_nrodua;
	}
	public void setNd_nrodua(String nd_nrodua) {
		this.nd_nrodua = nd_nrodua;
	}
	public String getNd_tpanexbene() {
		return nd_tpanexbene;
	}
	public void setNd_tpanexbene(String nd_tpanexbene) {
		this.nd_tpanexbene = nd_tpanexbene;
	}
	public String getNd_cdanexbene() {
		return nd_cdanexbene;
	}
	public void setNd_cdanexbene(String nd_cdanexbene) {
		this.nd_cdanexbene = nd_cdanexbene;
	}
	public String getNd_boltigv() {
		return nd_boltigv;
	}
	public void setNd_boltigv(String nd_boltigv) {
		this.nd_boltigv = nd_boltigv;
	}
	public String getNd_nroform() {
		return nd_nroform;
	}
	public void setNd_nroform(String nd_nroform) {
		this.nd_nroform = nd_nroform;
	}
	public String getNd_modserv() {
		return nd_modserv;
	}
	public void setNd_modserv(String nd_modserv) {
		this.nd_modserv = nd_modserv;
	}
	public String getNd_aplicapa() {
		return nd_aplicapa;
	}
	public void setNd_aplicapa(String nd_aplicapa) {
		this.nd_aplicapa = nd_aplicapa;
	}
	public String getNd_monref() {
		return nd_monref;
	}
	public void setNd_monref(String nd_monref) {
		this.nd_monref = nd_monref;
	}
	public double getNd_tpcamref() {
		return nd_tpcamref;
	}
	public void setNd_tpcamref(double nd_tpcamref) {
		this.nd_tpcamref = nd_tpcamref;
	}

	
    
}
