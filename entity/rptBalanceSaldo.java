package com.empresa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EmbeddedId;

import lombok.Data;

@Data
@Entity()
public class rptBalanceSaldo {
	
    // @Id
	@EmbeddedId

	
	@Column(name="tipo")
	String tipo;
	@Column(name="bl_cuenta")
	String bl_cuenta;
	@Column(name="pl_descri")
	String pl_descri;
	@Column(name="saldo_ant_MN", nullable = true)
	String saldo_ant_MN;
	@Column(name="saldo_ant_US", nullable = true)
	String saldo_ant_US;
	@Column(name="saldo_mes_MN", nullable = true)
	String saldo_mes_MN;
	@Column(name="saldo_mes_US", nullable = true)
	String saldo_mes_US;
	@Column(name="saldo_act_MN", nullable = true)
	String saldo_act_MN;
	@Column(name="saldo_act_US", nullable = true)
	String saldo_act_US;

	public rptBalanceSaldo() {
		super();
	}
	
	public rptBalanceSaldo(
		String tipo, 
		String bl_cuenta, 
		String pl_descri, 
		String saldo_ant_MN,
		String saldo_ant_US, 
		String saldo_mes_MN, 
		String saldo_mes_US, 
		String saldo_act_MN, 
		String saldo_act_US
	) {
		super();
		this.tipo = tipo;
		this.bl_cuenta = bl_cuenta;
		this.pl_descri = pl_descri;
		this.saldo_ant_MN = saldo_ant_MN;
		this.saldo_ant_US = saldo_ant_US;
		this.saldo_mes_MN = saldo_mes_MN;
		this.saldo_mes_US = saldo_mes_US;
		this.saldo_act_MN = saldo_act_MN;
		this.saldo_act_US = saldo_act_US;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getBl_cuenta() {
		return bl_cuenta;
	}

	public void setBl_cuenta(String bl_cuenta) {
		this.bl_cuenta = bl_cuenta;
	}

	public String getPl_descri() {
		return pl_descri;
	}

	public void setPl_descri(String pl_descri) {
		this.pl_descri = pl_descri;
	}

	public String getSaldo_ant_MN() {
		return saldo_ant_MN;
	}

	public void setSaldo_ant_MN(String saldo_ant_MN) {
		this.saldo_ant_MN = saldo_ant_MN;
	}

	public String getSaldo_ant_US() {
		return saldo_ant_US;
	}

	public void setSaldo_ant_US(String saldo_ant_US) {
		this.saldo_ant_US = saldo_ant_US;
	}

	public String getSaldo_mes_MN() {
		return saldo_mes_MN;
	}

	public void setSaldo_mes_MN(String saldo_mes_MN) {
		this.saldo_mes_MN = saldo_mes_MN;
	}

	public String getSaldo_mes_US() {
		return saldo_mes_US;
	}

	public void setSaldo_mes_US(String saldo_mes_US) {
		this.saldo_mes_US = saldo_mes_US;
	}

	public String getSaldo_act_MN() {
		return saldo_act_MN;
	}

	public void setSaldo_act_MN(String saldo_act_MN) {
		this.saldo_act_MN = saldo_act_MN;
	}

	public String getSaldo_act_US() {
		return saldo_act_US;
	}

	public void setSaldo_act_US(String saldo_act_US) {
		this.saldo_act_US = saldo_act_US;
	}

	
}
