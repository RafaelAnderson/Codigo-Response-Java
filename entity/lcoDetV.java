package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "lco0001detv21")
@NoArgsConstructor
public class lcoDetV {

	@EmbeddedId
	lcoDetVPk pk;

	LocalDate dl_feccom;
	String dl_cuenta;
	String dl_tpanex;
	String dl_cdanex;
	String dl_cencst;
	String dl_dh;
	String dl_tpdoc;
	String dl_nmdoc;

	
	LocalDate dl_fecdoc;

	
	LocalDate dl_fecven;

	@Column(name = "dl_tipcam", nullable = true)
	Double dl_tipcam;

	String dl_glosa;
	String dl_codmnd;

	@Column(name = "dl_importe", nullable = true)
	Double dl_importe;

	@Column(name = "dl_impmn", nullable = true)
	Double dl_impmn;

	@Column(name = "dl_impme", nullable = true)
	Double dl_impme;

	String dl_tpanex2;
	String dl_cdanex2;
	String dl_medpag;
	String dl_tpdocrf;
	String dl_nmdocrf;


	@Column(name = "dl_fecdocrf", nullable = true)
	LocalDate dl_fecdocrf;
	String dl_tptasa;

	@Column(name = "dl_imptas", nullable = true)
	Double dl_imptas;

	@Column(name = "dl_impbmn", nullable = true)
	Double dl_impbmn;

	@Column(name = "dl_impbme", nullable = true)
	Double dl_impbme;

	String dl_area;
	String dl_ctaorig;
	String dl_tipcmp;
	String dl_flag;
	String dl_mndcc;
	String dl_colcc;
	Double dl_impbicc;
	Double dl_inafcc;
	Double dl_igvcc;
	String dl_tpcnvcc;
	String dl_flagcc;
	String dl_cdanexcc;
	String dl_tpanexcc;
	String dl_numdocc;
	String dl_estdc;

	@Column(name = "dl_cantc", nullable = true)
	Double dl_cantc;

	String dl_cdmonc;

	@Column(name = "dl_impc", nullable = true)
	Double dl_impc;

	
	LocalDate dl_fecconc;

	String dl_nroconc;

	
	LocalDate dl_proconc;

	String dl_nunest;
	String dl_itemc;

	@Column(name = "dl_imptbc", nullable = true)
	Double dl_imptbc;
	String dl_anioc;
	String dl_usrcrea;

	LocalDate dl_feccrea;
	LocalTime dl_hracrea;
	String dl_usract;
	LocalDate dl_fecact;
	LocalTime dl_hraact;
	String dl_datref;
	String dl_docser;
	String dl_docnum;
	String dl_docserf;
	String dl_docnumf;
	String dl_nrodet;
	LocalDate dl_fecdet;
	String dl_fluefec;
	// String dl_nrodet;
	// LocalDate dl_fecdet;

	// public lcoDetV(lcoDetVPk pk2, Date fecha, String string, String string2,
	// String string3, String string4, String string5, String string6, String
	// string7, Date fecha2, Date fecha3, double d, String string8, String string9,
	// double e, double f, double g, String string10, String string11, String
	// string12, String string13, String string14, Date fecha4, String string15,
	// double h, double i, double j, String string16, String string17, String
	// string18, String string19, String string20, String string21, double k, double
	// l, double m, String string22, String string23, String string24, String
	// string25, String string26, String string27, double n, String string28, double
	// o, Date fecha5, String string29, Date fecha6, String string30, String
	// string31, double p, String p_ciacont, String año, LocalDate localDate,
	// LocalTime localTime, String subdia, LocalDate localDate2, LocalTime
	// localTime2, String string32, String string33, String string34, String
	// string35, String string36, String string37, LocalDate localDate3, String
	// string39) {
	// super();
	// }

	public lcoDetV(lcoDetVPk pk, LocalDate dl_feccom, String dl_cuenta, String dl_tpanex, String dl_cdanex, String dl_cencst,
			String dl_dh, String dl_tpdoc, String dl_nmdoc, LocalDate dl_fecdoc, LocalDate dl_fecven, Double dl_tipcam,
			String dl_glosa, String dl_codmnd, Double dl_importe, Double dl_impmn, Double dl_impme, String dl_tpanex2,
			String dl_cdanex2, String dl_medpag, String dl_tpdocrf, String dl_nmdocrf, LocalDate dl_fecdocrf,
			String dl_tptasa, Double dl_imptas, Double dl_impbmn, Double dl_impbme, String dl_area, String dl_ctaorig,
			String dl_tipcmp, String dl_flag, String dl_mndcc, String dl_colcc, Double dl_impbicc, Double dl_inafcc,
			Double dl_igvcc, String dl_tpcnvcc, String dl_flagcc, String dl_cdanexcc, String dl_tpanexcc,
			String dl_numdocc, String dl_estdc, Double dl_cantc, String dl_cdmonc, Double dl_impc, LocalDate dl_fecconc,
			String dl_nroconc, LocalDate dl_proconc, String dl_nunest, String dl_itemc, Double dl_imptbc, String dl_anioc,
			String dl_usrcrea, LocalDate dl_fecCrea, LocalTime dl_hracrea, String dl_usract, LocalDate dl_fecact,
			LocalTime dl_hraact, String dl_datref, String dl_docser, String dl_docnum, String dl_docserf,
			String dl_docnumf, String dl_nrodet, LocalDate dl_fecdet, String dl_fluefec) {
		super();
		this.pk = pk;
		this.dl_feccom = dl_feccom;
		this.dl_cuenta = dl_cuenta;
		this.dl_tpanex = dl_tpanex;
		this.dl_cdanex = dl_cdanex;
		this.dl_cencst = dl_cencst;
		this.dl_dh = dl_dh;
		this.dl_tpdoc = dl_tpdoc;
		this.dl_nmdoc = dl_nmdoc;
		this.dl_fecdoc = dl_fecdoc;
		this.dl_fecven = dl_fecven;
		this.dl_tipcam = dl_tipcam;
		this.dl_glosa = dl_glosa;
		this.dl_codmnd = dl_codmnd;
		this.dl_importe = dl_importe;
		this.dl_impmn = dl_impmn;
		this.dl_impme = dl_impme;
		this.dl_tpanex2 = dl_tpanex2;
		this.dl_cdanex2 = dl_cdanex2;
		this.dl_medpag = dl_medpag;
		this.dl_tpdocrf = dl_tpdocrf;
		this.dl_nmdocrf = dl_nmdocrf;
		this.dl_fecdocrf = dl_fecdocrf;
		this.dl_tptasa = dl_tptasa;
		this.dl_imptas = dl_imptas;
		this.dl_impbmn = dl_impbmn;
		this.dl_impbme = dl_impbme;
		this.dl_area = dl_area;
		this.dl_ctaorig = dl_ctaorig;
		this.dl_tipcmp = dl_tipcmp;
		this.dl_flag = dl_flag;
		this.dl_mndcc = dl_mndcc;
		this.dl_colcc = dl_colcc;
		this.dl_impbicc = dl_impbicc;
		this.dl_inafcc = dl_inafcc;
		this.dl_igvcc = dl_igvcc;
		this.dl_tpcnvcc = dl_tpcnvcc;
		this.dl_flagcc = dl_flagcc;
		this.dl_cdanexcc = dl_cdanexcc;
		this.dl_tpanexcc = dl_tpanexcc;
		this.dl_numdocc = dl_numdocc;
		this.dl_estdc = dl_estdc;
		this.dl_cantc = dl_cantc;
		this.dl_cdmonc = dl_cdmonc;
		this.dl_impc = dl_impc;
		this.dl_fecconc = dl_fecconc;
		this.dl_nroconc = dl_nroconc;
		this.dl_proconc = dl_proconc;
		this.dl_nunest = dl_nunest;
		this.dl_itemc = dl_itemc;
		this.dl_imptbc = dl_imptbc;
		this.dl_anioc = dl_anioc;
		this.dl_usrcrea = dl_usrcrea;
		this.dl_feccrea = dl_fecCrea;
		this.dl_hracrea = dl_hracrea;
		this.dl_usract = dl_usract;
		this.dl_fecact = dl_fecact;
		this.dl_hraact = dl_hraact;
		this.dl_datref = dl_datref;
		this.dl_docser = dl_docser;
		this.dl_docnum = dl_docnum;
		this.dl_docserf = dl_docserf;
		this.dl_docnumf = dl_docnumf;
		this.dl_fluefec = dl_fluefec;
		this.dl_nrodet = dl_nrodet;
		this.dl_fecdet = dl_fecdet;
	}

	public lcoDetVPk getPk() {
		return pk;
	}

	public void setPk(lcoDetVPk pk) {
		this.pk = pk;
	}

	public LocalDate getDl_feccom() {
		return dl_feccom;
	}

	public void setDl_feccom(LocalDate dl_feccom) {
		this.dl_feccom = dl_feccom;
	}

	public String getDl_cuenta() {
		return dl_cuenta;
	}

	public void setDl_cuenta(String dl_cuenta) {
		this.dl_cuenta = dl_cuenta;
	}

	public String getDl_tpanex() {
		return dl_tpanex;
	}

	public void setDl_tpanex(String dl_tpanex) {
		this.dl_tpanex = dl_tpanex;
	}

	public String getDl_cdanex() {
		return dl_cdanex;
	}

	public void setDl_cdanex(String dl_cdanex) {
		this.dl_cdanex = dl_cdanex;
	}

	public String getDl_cencst() {
		return dl_cencst;
	}

	public void setDl_cencst(String dl_cencst) {
		this.dl_cencst = dl_cencst;
	}

	public String getDl_dh() {
		return dl_dh;
	}

	public void setDl_dh(String dl_dh) {
		this.dl_dh = dl_dh;
	}

	public String getDl_tpdoc() {
		return dl_tpdoc;
	}

	public void setDl_tpdoc(String dl_tpdoc) {
		this.dl_tpdoc = dl_tpdoc;
	}

	public String getDl_nmdoc() {
		return dl_nmdoc;
	}

	public void setDl_nmdoc(String dl_nmdoc) {
		this.dl_nmdoc = dl_nmdoc;
	}

	public LocalDate getDl_fecdoc() {
		return dl_fecdoc;
	}

	public void setDl_fecdoc(LocalDate dl_fecdoc) {
		this.dl_fecdoc = dl_fecdoc;
	}

	public LocalDate getDl_fecven() {
		return dl_fecven;
	}

	public void setDl_fecven(LocalDate dl_fecven) {
		this.dl_fecven = dl_fecven;
	}

	public Double getDl_tipcam() {
		return dl_tipcam;
	}

	public void setDl_tipcam(Double dl_tipcam) {
		this.dl_tipcam = dl_tipcam;
	}

	public String getDl_glosa() {
		return dl_glosa;
	}

	public void setDl_glosa(String dl_glosa) {
		this.dl_glosa = dl_glosa;
	}

	public String getDl_codmnd() {
		return dl_codmnd;
	}

	public void setDl_codmnd(String dl_codmnd) {
		this.dl_codmnd = dl_codmnd;
	}

	public Double getDl_importe() {
		return dl_importe;
	}

	public void setDl_importe(Double dl_importe) {
		this.dl_importe = dl_importe;
	}

	public Double getDl_impmn() {
		return dl_impmn;
	}

	public void setDl_impmn(Double dl_impmn) {
		this.dl_impmn = dl_impmn;
	}

	public Double getDl_impme() {
		return dl_impme;
	}

	public void setDl_impme(Double dl_impme) {
		this.dl_impme = dl_impme;
	}

	public String getDl_tpanex2() {
		return dl_tpanex2;
	}

	public void setDl_tpanex2(String dl_tpanex2) {
		this.dl_tpanex2 = dl_tpanex2;
	}

	public String getDl_cdanex2() {
		return dl_cdanex2;
	}

	public void setDl_cdanex2(String dl_cdanex2) {
		this.dl_cdanex2 = dl_cdanex2;
	}

	public String getDl_medpag() {
		return dl_medpag;
	}

	public void setDl_medpag(String dl_medpag) {
		this.dl_medpag = dl_medpag;
	}

	public String getDl_tpdocrf() {
		return dl_tpdocrf;
	}

	public void setDl_tpdocrf(String dl_tpdocrf) {
		this.dl_tpdocrf = dl_tpdocrf;
	}

	public String getDl_nmdocrf() {
		return dl_nmdocrf;
	}

	public void setDl_nmdocrf(String dl_nmdocrf) {
		this.dl_nmdocrf = dl_nmdocrf;
	}

	public LocalDate getDl_fecdocrf() {
		return dl_fecdocrf;
	}

	public void setDl_fecdocrf(LocalDate dl_fecdocrf) {
		this.dl_fecdocrf = dl_fecdocrf;
	}

	public String getDl_tptasa() {
		return dl_tptasa;
	}

	public void setDl_tptasa(String dl_tptasa) {
		this.dl_tptasa = dl_tptasa;
	}

	public Double getDl_imptas() {
		return dl_imptas;
	}

	public void setDl_imptas(Double dl_imptas) {
		this.dl_imptas = dl_imptas;
	}

	public Double getDl_impbmn() {
		return dl_impbmn;
	}

	public void setDl_impbmn(Double dl_impbmn) {
		this.dl_impbmn = dl_impbmn;
	}

	public Double getDl_impbme() {
		return dl_impbme;
	}

	public void setDl_impbme(Double dl_impbme) {
		this.dl_impbme = dl_impbme;
	}

	public String getDl_area() {
		return dl_area;
	}

	public void setDl_area(String dl_area) {
		this.dl_area = dl_area;
	}

	public String getDl_ctaorig() {
		return dl_ctaorig;
	}

	public void setDl_ctaorig(String dl_ctaorig) {
		this.dl_ctaorig = dl_ctaorig;
	}

	public String getDl_tipcmp() {
		return dl_tipcmp;
	}

	public void setDl_tipcmp(String dl_tipcmp) {
		this.dl_tipcmp = dl_tipcmp;
	}

	public String getDl_flag() {
		return dl_flag;
	}

	public void setDl_flag(String dl_flag) {
		this.dl_flag = dl_flag;
	}

	public String getDl_mndcc() {
		return dl_mndcc;
	}

	public void setDl_mndcc(String dl_mndcc) {
		this.dl_mndcc = dl_mndcc;
	}

	public String getDl_colcc() {
		return dl_colcc;
	}

	public void setDl_colcc(String dl_colcc) {
		this.dl_colcc = dl_colcc;
	}

	public Double getDl_impbicc() {
		return dl_impbicc;
	}

	public void setDl_impbicc(Double dl_impbicc) {
		this.dl_impbicc = dl_impbicc;
	}

	public Double getDl_inafcc() {
		return dl_inafcc;
	}

	public void setDl_inafcc(Double dl_inafcc) {
		this.dl_inafcc = dl_inafcc;
	}

	public Double getDl_igvcc() {
		return dl_igvcc;
	}

	public void setDl_igvcc(Double dl_igvcc) {
		this.dl_igvcc = dl_igvcc;
	}

	public String getDl_tpcnvcc() {
		return dl_tpcnvcc;
	}

	public void setDl_tpcnvcc(String dl_tpcnvcc) {
		this.dl_tpcnvcc = dl_tpcnvcc;
	}

	public String getDl_flagcc() {
		return dl_flagcc;
	}

	public void setDl_flagcc(String dl_flagcc) {
		this.dl_flagcc = dl_flagcc;
	}

	public String getDl_cdanexcc() {
		return dl_cdanexcc;
	}

	public void setDl_cdanexcc(String dl_cdanexcc) {
		this.dl_cdanexcc = dl_cdanexcc;
	}

	public String getDl_tpanexcc() {
		return dl_tpanexcc;
	}

	public void setDl_tpanexcc(String dl_tpanexcc) {
		this.dl_tpanexcc = dl_tpanexcc;
	}

	public String getDl_numdocc() {
		return dl_numdocc;
	}

	public void setDl_numdocc(String dl_numdocc) {
		this.dl_numdocc = dl_numdocc;
	}

	public String getDl_estdc() {
		return dl_estdc;
	}

	public void setDl_estdc(String dl_estdc) {
		this.dl_estdc = dl_estdc;
	}

	public Double getDl_cantc() {
		return dl_cantc;
	}

	public void setDl_cantc(Double dl_cantc) {
		this.dl_cantc = dl_cantc;
	}

	public String getDl_cdmonc() {
		return dl_cdmonc;
	}

	public void setDl_cdmonc(String dl_cdmonc) {
		this.dl_cdmonc = dl_cdmonc;
	}

	public Double getDl_impc() {
		return dl_impc;
	}

	public void setDl_impc(Double dl_impc) {
		this.dl_impc = dl_impc;
	}

	public LocalDate getDl_fecconc() {
		return dl_fecconc;
	}

	public void setDl_fecconc(LocalDate dl_fecconc) {
		this.dl_fecconc = dl_fecconc;
	}

	public String getDl_nroconc() {
		return dl_nroconc;
	}

	public void setDl_nroconc(String dl_nroconc) {
		this.dl_nroconc = dl_nroconc;
	}

	public LocalDate getDl_proconc() {
		return dl_proconc;
	}

	public void setDl_proconc(LocalDate dl_proconc) {
		this.dl_proconc = dl_proconc;
	}

	public String getDl_nunest() {
		return dl_nunest;
	}

	public void setDl_nunest(String dl_nunest) {
		this.dl_nunest = dl_nunest;
	}

	public String getDl_itemc() {
		return dl_itemc;
	}

	public void setDl_itemc(String dl_itemc) {
		this.dl_itemc = dl_itemc;
	}

	public Double getDl_imptbc() {
		return dl_imptbc;
	}

	public void setDl_imptbc(Double dl_imptbc) {
		this.dl_imptbc = dl_imptbc;
	}

	public String getDl_anioc() {
		return dl_anioc;
	}

	public void setDl_anioc(String dl_anioc) {
		this.dl_anioc = dl_anioc;
	}

	public String getDl_usrcrea() {
		return dl_usrcrea;
	}

	public void setDl_usrcrea(String dl_usrcrea) {
		this.dl_usrcrea = dl_usrcrea;
	}

	public LocalDate getDl_fecCrea() {
		return dl_feccrea;
	}

	public void setDl_fecCrea(LocalDate dl_fecCrea) {
		this.dl_feccrea = dl_fecCrea;
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

	public String getDl_datref() {
		return dl_datref;
	}

	public String getDl_nrodet() {
		return dl_nrodet;
	}

	public void setDl_nrodet(String dl_nrodet) {
		this.dl_nrodet = dl_nrodet;
	}

	public LocalDate getDl_fecdet() {
		return dl_fecdet;
	}

	public void setDl_fecdet(LocalDate dl_fecdet) {
		this.dl_fecdet = dl_fecdet;
	}

	public void setDl_datref(String dl_datref) {
		this.dl_datref = dl_datref;
	}

	public String getDl_docser() {
		return dl_docser;
	}

	public void setDl_docser(String dl_docser) {
		this.dl_docser = dl_docser;
	}

	public String getDl_docnum() {
		return dl_docnum;
	}

	public void setDl_docnum(String dl_docnum) {
		this.dl_docnum = dl_docnum;
	}

	public String getDl_docserf() {
		return dl_docserf;
	}

	public void setDl_docserf(String dl_docserf) {
		this.dl_docserf = dl_docserf;
	}

	public String getDl_docnumf() {
		return dl_docnumf;
	}

	public void setDl_docnumf(String dl_docnumf) {
		this.dl_docnumf = dl_docnumf;
	}

	public String getDl_fluefec() {
		return dl_fluefec;
	}

	public void setDl_fluefec(String dl_fluefec) {
		this.dl_fluefec = dl_fluefec;
	}

	public int Buscar(String p_ciacont, String pl_cuenta) {
		return 0;
	}
}