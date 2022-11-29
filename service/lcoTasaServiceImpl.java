package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoTasa;
import com.empresa.repository.lcoTasaRepository;

@Service
public class lcoTasaServiceImpl implements lcoTasaService {
	
	@Autowired
	lcoTasaRepository repository;
	
	@Override
	public List<lcoTasa> listaTasa(int opcion, String p_ciacont, lcoTasa obj) {
		// TODO Auto-generated method stub
		return repository.listar(opcion, p_ciacont, obj.getPkID().getTl_tiptasa(), obj.getPkID().getTl_codtasa(),obj.getTl_dsctasa() ,
				obj.getTl_valref1(), obj.getTl_valref2(), obj.getTl_tasa(), obj.getTl_detcbi(), obj.getTl_detcob(), obj.getTl_flabas(),
				obj.getTl_usrcrea(), obj.getTl_feccrea(), obj.getTl_hracrea(), obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
	}

	@Override
	public void transaccion(int opcion, String p_ciacont, lcoTasa obj) {
		repository.Transaccion(opcion, p_ciacont, obj.getPkID().getTl_tiptasa(), obj.getPkID().getTl_codtasa(),obj.getTl_dsctasa() ,
				obj.getTl_valref1(), obj.getTl_valref2(), obj.getTl_tasa(), obj.getTl_detcbi(), obj.getTl_detcob(), obj.getTl_flabas(),
				obj.getTl_usrcrea(), obj.getTl_feccrea(), obj.getTl_hracrea(), obj.getTl_usract(), obj.getTl_fecact(), obj.getTl_hraact());
		
	}

}
