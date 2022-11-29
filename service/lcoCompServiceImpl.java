package com.empresa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoComp;
import com.empresa.repository.lcoCompRepository;

@Service
public class lcoCompServiceImpl implements lcoCompService{

	@Autowired
	lcoCompRepository repository;
	
	@Override
	public List<Map<String, Object>> swValRegCmp(String cia, String ejer, String per, String option) {
		// TODO Auto-generated method stub
		return repository.swValRegCmp(cia, ejer, per, option);
	}

	@Override
	public List<Map<String, Object>> swRegCmpTbl(String cia, String ejer, String per, String option) {
		// TODO Auto-generated method stub
		return repository.swRegCmpTbl(cia, ejer, per, option);
	}
	@Override
	public List<Map<String, Object>> swRegCmpPLE(String cia, String ejer, String per, String option) {
		// TODO Auto-generated method stub
		return repository.swRegCmpPLE(cia, ejer, per, option);
	}

	@Override
	public List<Map<String, Object>> Listar_p(String cia, String ejer, String per, String option) {
		// TODO Auto-generated method stub
		return repository.Listar_p(cia, ejer, per, option);
	}

	@Override
	public List<Map<String, Object>> swLisRecCmp(String cia, String ejer, String per, String option) {
		// TODO Auto-generated method stub
		return repository.swLisRecCmp(cia, ejer, per, option);
	}

	@Override
	public void swGrabaCompras(String cia, String per, String opcion, lcoComp lcoComp) {
		// TODO Auto-generated method stub
		repository.swGrabaCompras(cia, per, lcoComp.getPk().getRc_subdia(),lcoComp.getPk().getRc_compro(),
				lcoComp.getRc_feccom(),
				lcoComp.getRc_fecdoc(), lcoComp.getRc_fecven(), lcoComp.getRc_tipdoc(), 
				lcoComp.getRc_serdoc(), lcoComp.getRc_nrodoc(), lcoComp.getRc_numdoc(), 
				lcoComp.getRc_tipane(), lcoComp.getRc_codane(), lcoComp.getRc_rucane(), 
				lcoComp.getRc_nomane(), lcoComp.getRc_codmon(), lcoComp.getRc_afemn(), 
				lcoComp.getRc_inamn(), lcoComp.getRc_igvmn(), lcoComp.getRc_impomn(), 
				lcoComp.getRc_iscmn(), lcoComp.getRc_otrmn(), lcoComp.getRc_detemn(), 
				lcoComp.getRc_afeme(),
				lcoComp.getRc_iname(), lcoComp.getRc_igvme(), lcoComp.getRc_impome(), 
				lcoComp.getRc_iscme(), lcoComp.getRc_otrme(), lcoComp.getRc_deteme(), 
				lcoComp.getRc_numdet(), lcoComp.getRc_fecdet(), lcoComp.getRc_tipcam(), 
				lcoComp.getRc_fedore(), lcoComp.getRc_tidore(), lcoComp.getRc_sedore(), 
				lcoComp.getRc_nudore(), lcoComp.getRc_feccre(), lcoComp.getRc_horcre(), 
				lcoComp.getRc_usucre(), lcoComp.getRc_fecact(), lcoComp.getRc_hraact(), 
				lcoComp.getRc_usuact(), lcoComp.getRc_recmn(), lcoComp.getRc_recme(),
				lcoComp.getRc_codcla(),lcoComp.getPk().getRc_secuen(), lcoComp.getRc_cuenta(),
				lcoComp.getRc_perrec(), lcoComp.getRc_medpag(), lcoComp.getRc_estado(),
				lcoComp.getRc_datadi(), lcoComp.getRc_coddet(), lcoComp.getRc_bolmn(),
				lcoComp.getRc_tipdocide(), lcoComp.getRc_anodua(), opcion);
	}
	
}
