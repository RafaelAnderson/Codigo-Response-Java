package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoNdom;
import com.empresa.repository.lcoNdomRepository;

@Service
public class lcoNdomServiceImpl implements lcoNdomService{

	@Autowired
	lcoNdomRepository repository;
	
	@Override
	public List<lcoNdom> listarTodo(int opcion, String p_ciacont, String año, lcoNdom obj) {
		// TODO Auto-generated method stub
		return repository.Listar(opcion, p_ciacont, año, obj.getPkID().getNd_periodo(), obj.getPkID().getNd_subdia(), obj.getPkID().getNd_compro(), obj.getPkID().getNd_tipreg(), 
		 obj.getNd_feccom(), obj.getNd_moneda(), obj.getNd_cencst(), obj.getNd_tpanex(), obj.getNd_cdanex(), obj.getNd_tpanex2(), obj.getNd_cdanex2(), 
		 obj.getNd_tpdoc(), obj.getNd_nmdoc(), obj.getNd_docser(), obj.getNd_docnum(), obj.getNd_fecdoc(), obj.getNd_fecven(), 
		 obj.getNd_impadq(), obj.getNd_impadqmn(), obj.getNd_impaqdme(), obj.getNd_codtrib(), obj.getNd_impotrib(), obj.getNd_impotribmn(), obj.getNd_impotribme(), 
		 obj.getNd_impvalor(), obj.getNd_impvalormn(), obj.getNd_impvalorme(), obj.getNd_tprenta(), obj.getNd_impdeduc(), obj.getNd_impdeducmn(), obj.getNd_impaqdme(),
		 obj.getNd_imprentab(), obj.getNd_imprentabmn(), obj.getNd_imprentabme(), obj.getNd_tpreten(), obj.getNd_tasareten(), obj.getNd_impreten(), 
		 obj.getNd_impretenmn(), obj.getNd_impretenme(), obj.getNd_cdexonapli(), obj.getNd_tasaigv(), obj.getNd_impigv(), obj.getNd_impigvmn(), obj.getNd_impigvme(), 
		 obj.getNd_tipcam(), obj.getNd_tpdua(), obj.getNd_cddua(), obj.getNd_nrodua(), obj.getNd_tpanexbene(), obj.getNd_cdanexbene(), 
		 obj.getNd_boltigv(), obj.getNd_nroform(), obj.getNd_modserv(), obj.getNd_aplicapa(), obj.getNd_monref(), obj.getNd_tpcamref());
	}

	@Override
	public void registrar(int opcion, String p_ciacont, String año, lcoNdom obj) {
		// TODO Auto-generated method stub
		 repository.transaccion(opcion, p_ciacont, año, obj.getPkID().getNd_periodo(), obj.getPkID().getNd_subdia(), obj.getPkID().getNd_compro(), obj.getPkID().getNd_tipreg(), 
				 obj.getNd_feccom(), obj.getNd_moneda(), obj.getNd_cencst(), obj.getNd_tpanex(), obj.getNd_cdanex(), obj.getNd_tpanex2(), obj.getNd_cdanex2(), 
				 obj.getNd_tpdoc(), obj.getNd_nmdoc(), obj.getNd_docser(), obj.getNd_docnum(), obj.getNd_fecdoc(), obj.getNd_fecven(), 
				 obj.getNd_impadq(), obj.getNd_impadqmn(), obj.getNd_impaqdme(), obj.getNd_codtrib(), obj.getNd_impotrib(), obj.getNd_impotribmn(), obj.getNd_impotribme(), 
				 obj.getNd_impvalor(), obj.getNd_impvalormn(), obj.getNd_impvalorme(), obj.getNd_tprenta(), obj.getNd_impdeduc(), obj.getNd_impdeducmn(), obj.getNd_impaqdme(),
				 obj.getNd_imprentab(), obj.getNd_imprentabmn(), obj.getNd_imprentabme(), obj.getNd_tpreten(), obj.getNd_tasareten(), obj.getNd_impreten(), 
				 obj.getNd_impretenmn(), obj.getNd_impretenme(), obj.getNd_cdexonapli(), obj.getNd_tasaigv(), obj.getNd_impigv(), obj.getNd_impigvmn(), obj.getNd_impigvme(), 
				 obj.getNd_tipcam(), obj.getNd_tpdua(), obj.getNd_cddua(), obj.getNd_nrodua(), obj.getNd_tpanexbene(), obj.getNd_cdanexbene(), 
				 obj.getNd_boltigv(), obj.getNd_nroform(), obj.getNd_modserv(), obj.getNd_aplicapa(), obj.getNd_monref(), obj.getNd_tpcamref());
	}

}
