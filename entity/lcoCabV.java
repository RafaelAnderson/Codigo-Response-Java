package com.empresa.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "lco0001cabv21")
public class lcoCabV {

	@EmbeddedId
	lcoCabVPk pk;

	String cl_tipo;
	LocalDate cl_feccom;
	String cl_moneda;
	String cl_tctipo;
	Double cl_tcimporte;
	LocalDate cl_tcfecha;
	String cl_glosa;
	String cl_estado;
	Double cl_totvouc;

	String cl_origen;
	String cl_flagconv;
	String cl_form;
	String cl_extor;
	String cl_usrcrea;
	LocalDate cl_feccrea;
	LocalTime cl_hracrea;
	String cl_usract;
	LocalDate cl_fecact;
	LocalTime cl_hraact;
	String cl_tipret;
	String cl_perret;
	LocalDate cl_fecret;
	String cl_perrea;
	String cl_perpre;

	public lcoCabV(lcoCabVPk pk, String cl_tipo, LocalDate cl_feccom, String cl_moneda, String cl_tctipo,
			Double cl_tcimporte, LocalDate cl_tcfecha, String cl_glosa, String cl_estado, Double cl_totvouc,
			String cl_origen, String cl_flagconv, String cl_form, String cl_extor, String cl_usrcrea,
			LocalDate cl_feccrea, LocalTime cl_hracrea, String cl_usract, LocalDate cl_fecact, LocalTime cl_hraact,
			String cl_tipret, String cl_perret) {
		this.pk = pk;
		this.cl_tipo = cl_tipo;
		this.cl_feccom = cl_feccom;
		this.cl_moneda = cl_moneda;
		this.cl_tctipo = cl_tctipo;
		this.cl_tcimporte = cl_tcimporte;
		this.cl_tcfecha = cl_tcfecha;
		this.cl_glosa = cl_glosa;
		this.cl_estado = cl_estado;
		this.cl_totvouc = cl_totvouc;
		this.cl_origen = cl_origen;
		this.cl_flagconv = cl_flagconv;
		this.cl_form = cl_form;
		this.cl_extor = cl_extor;
		this.cl_usrcrea = cl_usrcrea;
		this.cl_feccrea = cl_feccrea;
		this.cl_hracrea = cl_hracrea;
		this.cl_usract = cl_usract;
		this.cl_fecact = cl_fecact;
		this.cl_hraact = cl_hraact;
		this.cl_tipret = cl_tipret;
		this.cl_perret = cl_perret;

	}

	public lcoCabV(lcoCabVPk pk, String cl_tipo, LocalDate cl_feccom, String cl_moneda, String cl_tctipo,
			Double cl_tcimporte, LocalDate cl_tcfecha, String cl_glosa, String cl_estado, Double cl_totvouc,
			String cl_origen, String cl_flagconv, String cl_form, String cl_extor, String cl_usrcrea,
			LocalDate cl_feccrea, LocalTime cl_hracrea, String cl_usract, LocalDate cl_fecact, LocalTime cl_hraact,
			String cl_tipret, String cl_perret, LocalDate cl_fecret, String cl_perrea, String cl_perpre) {
		this.pk = pk;
		this.cl_tipo = cl_tipo;
		this.cl_feccom = cl_feccom;
		this.cl_moneda = cl_moneda;
		this.cl_tctipo = cl_tctipo;
		this.cl_tcimporte = cl_tcimporte;
		this.cl_tcfecha = cl_tcfecha;
		this.cl_glosa = cl_glosa;
		this.cl_estado = cl_estado;
		this.cl_totvouc = cl_totvouc;
		this.cl_origen = cl_origen;
		this.cl_flagconv = cl_flagconv;
		this.cl_form = cl_form;
		this.cl_extor = cl_extor;
		this.cl_usrcrea = cl_usrcrea;
		this.cl_feccrea = cl_feccrea;
		this.cl_hracrea = cl_hracrea;
		this.cl_usract = cl_usract;
		this.cl_fecact = cl_fecact;
		this.cl_hraact = cl_hraact;
		this.cl_tipret = cl_tipret;
		this.cl_perret = cl_perret;
		this.cl_fecret = cl_fecret;
		this.cl_perrea = cl_perrea;
		this.cl_perpre = cl_perpre;
	}

	// public lcoCabV(lcoCabVPk pk, String cl_tipo, LocalDate cl_feccom, String
	// cl_moneda, String cl_tctipo,
	// Double cl_tcimporte, LocalDate cl_tcfecha, String cl_glosa, String cl_estado,
	// Double cl_totvouc,
	// String cl_origen, String cl_flagconv, String cl_form, String cl_extor, String
	// cl_usrcrea,
	// LocalDate cl_fecCrea, LocalTime cl_hracrea, String cl_usract, LocalDate
	// cl_fecact, LocalTime cl_hraact,
	// String cl_tipret, String cl_perret) {
	// super();
	// this.pk = pk;
	// this.cl_tipo = cl_tipo;
	// this.cl_feccom = cl_feccom;
	// this.cl_moneda = cl_moneda;
	// this.cl_tctipo = cl_tctipo;
	// this.cl_tcimporte = cl_tcimporte;
	// this.cl_tcfecha = cl_tcfecha;
	// this.cl_glosa = cl_glosa;
	// this.cl_estado = cl_estado;
	// this.cl_totvouc = cl_totvouc;
	// this.cl_origen = cl_origen;
	// this.cl_flagconv = cl_flagconv;
	// this.cl_form = cl_form;
	// this.cl_extor = cl_extor;
	// this.cl_usrcrea = cl_usrcrea;
	// this.cl_feccrea = cl_fecCrea;
	// this.cl_hracrea = cl_hracrea;
	// this.cl_usract = cl_usract;
	// this.cl_fecact = cl_fecact;
	// this.cl_hraact = cl_hraact;
	// this.cl_tipret = cl_tipret;
	// this.cl_perret = cl_perret;
	// }

	public lcoCabV() {
		super();
	}

	public lcoCabVPk getPk() {
		return pk;
	}

	public void setPk(lcoCabVPk pk) {
		this.pk = pk;
	}

	public String getCl_tipo() {
		return cl_tipo;
	}

	public void setCl_tipo(String cl_tipo) {
		this.cl_tipo = cl_tipo;
	}

	public LocalDate getCl_feccom() {
		return cl_feccom;
	}

	public void setCl_feccom(LocalDate cl_feccom) {
		this.cl_feccom = cl_feccom;
	}

	public String getCl_moneda() {
		return cl_moneda;
	}

	public void setCl_moneda(String cl_moneda) {
		this.cl_moneda = cl_moneda;
	}

	public String getCl_tctipo() {
		return cl_tctipo;
	}

	public void setCl_tctipo(String cl_tctipo) {
		this.cl_tctipo = cl_tctipo;
	}

	public Double getCl_tcimporte() {
		return cl_tcimporte;
	}

	public void setCl_tcimporte(Double cl_tcimporte) {
		this.cl_tcimporte = cl_tcimporte;
	}

	public LocalDate getCl_tcfecha() {
		return cl_tcfecha;
	}

	public void setCl_tcfecha(LocalDate cl_tcfecha) {
		this.cl_tcfecha = cl_tcfecha;
	}

	public String getCl_glosa() {
		return cl_glosa;
	}

	public void setCl_glosa(String cl_glosa) {
		this.cl_glosa = cl_glosa;
	}

	public String getCl_estado() {
		return cl_estado;
	}

	public void setCl_estado(String cl_estado) {
		this.cl_estado = cl_estado;
	}

	public Double getCl_totvouc() {
		return cl_totvouc;
	}

	public void setCl_totvouc(Double cl_totvouc) {
		this.cl_totvouc = cl_totvouc;
	}

	public String getCl_origen() {
		return cl_origen;
	}

	public void setCl_origen(String cl_origen) {
		this.cl_origen = cl_origen;
	}

	public String getCl_flagconv() {
		return cl_flagconv;
	}

	public void setCl_flagconv(String cl_flagconv) {
		this.cl_flagconv = cl_flagconv;
	}

	public String getCl_form() {
		return cl_form;
	}

	public void setCl_form(String cl_form) {
		this.cl_form = cl_form;
	}

	public String getCl_extor() {
		return cl_extor;
	}

	public void setCl_extor(String cl_extor) {
		this.cl_extor = cl_extor;
	}

	public String getCl_usrcrea() {
		return cl_usrcrea;
	}

	public void setCl_usrcrea(String cl_usrcrea) {
		this.cl_usrcrea = cl_usrcrea;
	}

	public LocalDate getCl_fecCrea() {
		return cl_feccrea;
	}

	public void setCl_fecCrea(LocalDate cl_fecCrea) {
		this.cl_feccrea = cl_fecCrea;
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

	public String getCl_tipret() {
		return cl_tipret;
	}

	public void setCl_tipret(String cl_tipret) {
		this.cl_tipret = cl_tipret;
	}

	public String getCl_perret() {
		return cl_perret;
	}

	public void setCl_perret(String cl_perret) {
		this.cl_perret = cl_perret;
	}

	public LocalDate getCl_fecret() {
		return cl_fecret;
	}

	public void setCl_fecret(LocalDate cl_fecret) {
		this.cl_fecret = cl_fecret;
	}

	public String getCl_perrea() {
		return cl_perrea;
	}

	public void setCl_perrea(String cl_perrea) {
		this.cl_perrea = cl_perrea;
	}

	public String getCl_perpre() {
		return cl_perpre;
	}

	public void setCl_perpre(String cl_perpre) {
		this.cl_perpre = cl_perpre;
	}

}
