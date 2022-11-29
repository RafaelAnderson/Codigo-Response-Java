package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.empresa.entity.lcotrfc;
import com.empresa.repository.lcotrfcRepository;


@Service
public class lcotrfcServiceImpl implements IcontrfcService{

	@Autowired
	private lcotrfcRepository repository;

	@Override
	public List<Map<String, Object>> listaRegistros(int opcion, String p_ciacont,  lcotrfc obj) {
		return repository.listAll(opcion,p_ciacont, obj.getPk_ID().getTl_cntcst(),obj.getPk_ID().getTl_ctacar(), obj.getPk_ID().getTl_ctaabo(),obj.getTl_factor(), obj.getTl_usrcrea(), obj.getTl_feccrea(),obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact()) ;
	}

	@Override
	public void NuevoRegistro(int opcion, String p_ciacont, lcotrfc obj) {
		repository.nuevoRegistro(opcion,p_ciacont, obj.getPk_ID().getTl_cntcst(),
				obj.getPk_ID().getTl_ctacar(), obj.getPk_ID().getTl_ctaabo(),obj.getTl_factor(),
				obj.getTl_usrcrea(), obj.getTl_feccrea(),obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
		
	}

	@Override
	public void editarRegistro(int opcion, String p_ciacont, lcotrfc obj) {
		repository.actualizaRegistro(opcion,p_ciacont, obj.getPk_ID().getTl_cntcst(),
				obj.getPk_ID().getTl_ctacar(), obj.getPk_ID().getTl_ctaabo(),obj.getTl_factor(),
				obj.getTl_usrcrea(), obj.getTl_feccrea(),obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
		
	}

	@Override
	public void eliminarRegistro(int opcion, String p_ciacont, lcotrfc obj) {
		repository.eliminaRegistro(opcion,p_ciacont, obj.getPk_ID().getTl_cntcst(),
				obj.getPk_ID().getTl_ctacar(),  obj.getPk_ID().getTl_ctaabo(),obj.getTl_factor(),
				obj.getTl_usrcrea(), obj.getTl_feccrea(),obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
		
	}

	@Override
	public List<Object[]> listaUnRegistro(int opcion, String p_ciacont, lcotrfc obj) {
		return repository.listaUno(opcion,p_ciacont, obj.getPk_ID().getTl_cntcst(),obj.getPk_ID().getTl_ctacar(), obj.getPk_ID().getTl_ctaabo(),obj.getTl_factor(), obj.getTl_usrcrea(), obj.getTl_feccrea(),obj.getTl_hracrea(),
				obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact()) ;
	}


}
