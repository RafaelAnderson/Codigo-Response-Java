package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoCias;
import com.empresa.repository.lcoCiasRepository;

@Service
public class lcoCiasServiceImpl implements lcoCiasService {

	@Autowired
	lcoCiasRepository repository;

	@Override
	public List<lcoCias> listarlcoCias(int opcion, lcoCias obj) {
		return repository.listar(opcion, obj.getCl_codcia(), obj.getCl_desc1(), obj.getCl_desc2(), obj.getCl_tipdoc(),
				obj.getCl_nrodoc(), obj.getCl_telef(), obj.getCl_email(), obj.getCl_host(), obj.getCl_tipreg(),
				obj.getCl_estado(),
				obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void registrar(int opcion, lcoCias obj) {
		repository.Registrar(opcion, obj.getCl_codcia(), obj.getCl_desc1(), obj.getCl_desc2(), obj.getCl_tipdoc(),
				obj.getCl_nrodoc(), obj.getCl_telef(), obj.getCl_email(), obj.getCl_host(), obj.getCl_tipreg(),
				obj.getCl_estado(),
				obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public List<lcoCias> swBscCia(int opcion, lcoCias obj) {
		return repository.swBscCia(opcion, obj.getCl_codcia(), obj.getCl_desc1(), obj.getCl_desc2(), obj.getCl_tipdoc(),
				obj.getCl_nrodoc(), obj.getCl_telef(), obj.getCl_email(), obj.getCl_host(), obj.getCl_tipreg(),
				obj.getCl_estado(),
				obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void swActualizarCias(int opcion, lcoCias obj) {
		repository.swActualizarCias(opcion, obj.getCl_codcia(), obj.getCl_desc1(), obj.getCl_desc2(),
				obj.getCl_tipdoc(),
				obj.getCl_nrodoc(), obj.getCl_telef(), obj.getCl_email(), obj.getCl_host(), obj.getCl_tipreg(),
				obj.getCl_estado(),
				obj.getCl_usrcrea(), obj.getCl_feccrea(), obj.getCl_hracrea(),
				obj.getCl_usract(), obj.getCl_fecact(), obj.getCl_hraact());
	}

	@Override
	public void swCreaTablasCias(String pCias, String pCiaOrg) {
		repository.swCreaTablasCias(pCias,pCiaOrg);
	}

	@Override
	public void swCreaTablasCiasEjer(String pCias, String pEjer,String pCiasOrg,String pEjerO) {
		repository.swCreaTablasCiasEjer(pCias, pEjer,pCiasOrg,pEjerO);
	}

	@Override
	public void swTransferTablas(String pCiaOrig, String pEjerOrig, String pCiaDst, String pEjerDst, String pfCta,
			String pfTbl, String pfCmp, String pfEst, String pfAnx, String pfCaj, String pfCie, String pfCst) {
		repository.swTransferTablas(pCiaOrig, pEjerOrig, pCiaDst, pEjerDst, pfCta, pfTbl, pfCmp, pfEst, pfAnx, pfCaj,
				pfCie, pfCst);
	}
}