package com.empresa.service;

import java.util.List;

import com.empresa.entity.lcoCias;



public interface lcoCiasService {
	
	public abstract List<lcoCias> listarlcoCias(int opcion,lcoCias obj);
	
	void registrar (int opcion, lcoCias obj);
	
	List <lcoCias> swBscCia(int opcion, lcoCias obj);

	void swActualizarCias(int opcion, lcoCias obj);

	void swCreaTablasCias (String pCias,  String pCiaOrg);
	
	void swCreaTablasCiasEjer (String pCias, String pEjer, String pCiasOrg, String pEjerO);

	void swTransferTablas (String pCiaOrig, String pEjerOrig, String pCiaDst, String pEjerDst, String pfCta, String pfTbl, String pfCmp, String pfEst, String pfAnx, String pfCaj, String pfCie, String pfCst);

}