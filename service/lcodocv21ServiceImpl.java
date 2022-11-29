package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcodocv21;

import com.empresa.repository.lcodocv21Repository;

@Service
public class lcodocv21ServiceImpl implements lcodocv21Service{

	@Autowired
	private lcodocv21Repository repository;

	@Override
	public List<lcodocv21> swListaCabAsiento(int opcion, String p_ciacont,String ejercicio,  lcodocv21 obj) {
		return repository.swListaCabAsiento(opcion,p_ciacont, ejercicio,obj.getPk().getIl_subdia(),obj.getPk().getIl_compro(),
				obj.getPk().getIl_secue(),obj.getIl_tipo(),obj.getIl_descri(), obj.getIl_archivo(), obj.getIl_imagen(),obj.getIl_usrcrea(),
				obj.getIl_fecCrea(),obj.getIl_hracrea(),obj.getIl_usract(), obj.getIl_fecact(), obj.getIl_hraact()) ;
	}

	@Override
	public List<Object[]> swObtUltSecDocV(int opcion, String p_ciacont,String ejercicio,  lcodocv21 obj) {
		return repository.swObtUltSecDocV(opcion,p_ciacont, ejercicio,obj.getPk().getIl_subdia(),obj.getPk().getIl_compro(),
				obj.getPk().getIl_secue(),obj.getIl_tipo(),obj.getIl_descri(), obj.getIl_archivo(), obj.getIl_imagen(),obj.getIl_usrcrea(),
				obj.getIl_fecCrea(),obj.getIl_hracrea(),obj.getIl_usract(), obj.getIl_fecact(), obj.getIl_hraact()) ;
	}
	@Override
	public void swCreaDocAsiento(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj) {
		repository.swCreaDocAsiento(opcion,p_ciacont, ejercicio,obj.getPk().getIl_subdia(),obj.getPk().getIl_compro(),
				obj.getPk().getIl_secue(),obj.getIl_tipo(),obj.getIl_descri(), obj.getIl_archivo(), obj.getIl_imagen(),obj.getIl_usrcrea(),
				obj.getIl_fecCrea(),obj.getIl_hracrea(),obj.getIl_usract(), obj.getIl_fecact(), obj.getIl_hraact()) ;
	}

	@Override
	public void swActuaDocAsie(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj) {
		repository.swActuaDocAsie(opcion,p_ciacont, ejercicio,obj.getPk().getIl_subdia(),obj.getPk().getIl_compro(),
				obj.getPk().getIl_secue(),obj.getIl_tipo(),obj.getIl_descri(), obj.getIl_archivo(), obj.getIl_imagen(),obj.getIl_usrcrea(),
				obj.getIl_fecCrea(),obj.getIl_hracrea(),obj.getIl_usract(), obj.getIl_fecact(), obj.getIl_hraact()) ;
		
	}

	@Override
	public void swEliminarDocAsie(int opcion, String p_ciacont, String ejercicio, lcodocv21 obj) {
		repository.swEliminarDocAsie(opcion,p_ciacont, ejercicio,obj.getPk().getIl_subdia(),obj.getPk().getIl_compro(),
				obj.getPk().getIl_secue(),obj.getIl_tipo(),obj.getIl_descri(), obj.getIl_archivo(), obj.getIl_imagen(),obj.getIl_usrcrea(),
				obj.getIl_fecCrea(),obj.getIl_hracrea(),obj.getIl_usract(), obj.getIl_fecact(), obj.getIl_hraact()) ;
		
	}

	@Override
	public void modificarAsientos(String p_ciacont, String ejercicio, lcodocv21 obj) {
		repository.modificarAsientos(p_ciacont, ejercicio,obj.getPk().getIl_subdia(),obj.getPk().getIl_compro(),
				obj.getPk().getIl_secue(),obj.getIl_tipo(),obj.getIl_descri(), obj.getIl_archivo(), obj.getIl_imagen(),obj.getIl_usrcrea(),
				obj.getIl_fecCrea(),obj.getIl_hracrea(),obj.getIl_usract(), obj.getIl_fecact(), obj.getIl_hraact()) ;
		
	}


	

}
