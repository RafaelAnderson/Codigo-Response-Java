package com.empresa.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.lcoTblaVenta;
import com.empresa.repository.ResVentaAdiRepository;

@Service
public class ResVentaAdiServiceImpl implements ResVentaAdiService {

    @Autowired
    private ResVentaAdiRepository repository;
    
	@Override
	public List<Map<String, Object[]>> swListarRecVnt(int opcion, String cia, String ejercicio, String PER, String SD,
			String asiento, lcoTblaVenta obj) {
		return repository.swListarRecVnt(opcion, cia, ejercicio, PER, SD, asiento,
                obj.getPkID().getAv_codper(),
                obj.getPkID().getAv_subdia(), obj.getPkID().getAv_compro(), obj.getAv_feccom(), obj.getAv_fecdoc(),
                obj.getAv_fecven(),
                obj.getAv_tipdoc(), obj.getAv_docser(), obj.getAv_docnum(), obj.getAv_numdoc(), obj.getAv_tipane(),
                obj.getAv_codane(), obj.getAv_tipide(), obj.getAv_numide(), obj.getAv_nomane(), obj.getAv_codmon(),
                obj.getAv_afemn(), obj.getAv_inamn(), obj.getAv_iscmn(), obj.getAv_exomn(), obj.getAv_igvmn(),
                obj.getAv_ivamn(), obj.getAv_otrmn(), obj.getAv_desmn(), obj.getAv_idemn(), obj.getAv_expmn(),
                obj.getAv_icbpmn(),
                obj.getAv_importmn(), obj.getAv_afeme(), obj.getAv_iname(), obj.getAv_iscme(), obj.getAv_exome(),
                obj.getAv_igvme(), obj.getAv_ivame(), obj.getAv_otrme(), obj.getAv_desme(), obj.getAv_ideme(),
                obj.getAv_expme(), obj.getAv_icbpme(), obj.getAv_importme(),obj.getAv_tctipo(), obj.getAv_tipcamb(),
                obj.getAv_porcigv(), obj.getAv_fecdocref(), obj.getAv_tipdocref(), obj.getAv_docserref(),
                obj.getAv_docnumref(), obj.getAv_usrcrea(), obj.getAv_feccrea(), obj.getAv_hracrea(),
                obj.getAv_usract(), obj.getAv_fecact(),
                obj.getAv_hraact(), obj.getAv_secuen(), obj.getAv_cuenta(), obj.getAv_perrec(), obj.getAv_medpag(),
                obj.getAv_estado(), obj.getAv_cencos(), obj.getAv_proy());
	}

	@Override
	public List<Map<String, Object[]>> swBscRecVnt(int opcion, String cia, String ejercicio, String PER, String SD,
			String asiento, lcoTblaVenta obj) {
		  return repository.swBscRecVnt(opcion, cia, ejercicio, PER, SD, asiento, obj.getPkID().getAv_codper(),
	                obj.getPkID().getAv_subdia(), obj.getPkID().getAv_compro(), obj.getAv_feccom(), obj.getAv_fecdoc(),
	                obj.getAv_fecven(),
	                obj.getAv_tipdoc(), obj.getAv_docser(), obj.getAv_docnum(), obj.getAv_numdoc(), obj.getAv_tipane(),
	                obj.getAv_codane(), obj.getAv_tipide(), obj.getAv_numide(), obj.getAv_nomane(), obj.getAv_codmon(),
	                obj.getAv_afemn(), obj.getAv_inamn(), obj.getAv_iscmn(), obj.getAv_exomn(), obj.getAv_igvmn(),
	                obj.getAv_ivamn(), obj.getAv_otrmn(), obj.getAv_desmn(), obj.getAv_idemn(), obj.getAv_expmn(),
	                obj.getAv_icbpmn(),
	                obj.getAv_importmn(), obj.getAv_afeme(), obj.getAv_iname(), obj.getAv_iscme(), obj.getAv_exome(),
	                obj.getAv_igvme(), obj.getAv_ivame(), obj.getAv_otrme(), obj.getAv_desme(), obj.getAv_ideme(),
	                obj.getAv_expme(), obj.getAv_icbpme(), obj.getAv_importme(),obj.getAv_tctipo(), obj.getAv_tipcamb(),
	                obj.getAv_porcigv(), obj.getAv_fecdocref(), obj.getAv_tipdocref(), obj.getAv_docserref(),
	                obj.getAv_docnumref(), obj.getAv_usrcrea(), obj.getAv_feccrea(), obj.getAv_hracrea(),
	                obj.getAv_usract(), obj.getAv_fecact(),
	                obj.getAv_hraact(), obj.getAv_secuen(), obj.getAv_cuenta(), obj.getAv_perrec(), obj.getAv_medpag(),
	                obj.getAv_estado(), obj.getAv_cencos(), obj.getAv_proy());
	}

	@Override
	public List<Map<String, Object[]>> swConRecVnt(int opcion, String cia, String ejercicio, String PER, String SD,
			String asiento, lcoTblaVenta obj) {
		  return repository.swConRecVnt(opcion, cia, ejercicio, PER, SD, asiento, obj.getPkID().getAv_codper(),
	                obj.getPkID().getAv_subdia(), obj.getPkID().getAv_compro(), obj.getAv_feccom(), obj.getAv_fecdoc(),
	                obj.getAv_fecven(),
	                obj.getAv_tipdoc(), obj.getAv_docser(), obj.getAv_docnum(), obj.getAv_numdoc(), obj.getAv_tipane(),
	                obj.getAv_codane(), obj.getAv_tipide(), obj.getAv_numide(), obj.getAv_nomane(), obj.getAv_codmon(),
	                obj.getAv_afemn(), obj.getAv_inamn(), obj.getAv_iscmn(), obj.getAv_exomn(), obj.getAv_igvmn(),
	                obj.getAv_ivamn(), obj.getAv_otrmn(), obj.getAv_desmn(), obj.getAv_idemn(), obj.getAv_expmn(),
	                obj.getAv_icbpmn(),
	                obj.getAv_importmn(), obj.getAv_afeme(), obj.getAv_iname(), obj.getAv_iscme(), obj.getAv_exome(),
	                obj.getAv_igvme(), obj.getAv_ivame(), obj.getAv_otrme(), obj.getAv_desme(), obj.getAv_ideme(),
	                obj.getAv_expme(), obj.getAv_icbpme(), obj.getAv_importme(),obj.getAv_tctipo(),obj.getAv_tipcamb(),
	                obj.getAv_porcigv(), obj.getAv_fecdocref(), obj.getAv_tipdocref(), obj.getAv_docserref(),
	                obj.getAv_docnumref(), obj.getAv_usrcrea(), obj.getAv_feccrea(), obj.getAv_hracrea(),
	                obj.getAv_usract(), obj.getAv_fecact(),
	                obj.getAv_hraact(), obj.getAv_secuen(), obj.getAv_cuenta(), obj.getAv_perrec(), obj.getAv_medpag(),
	                obj.getAv_estado(), obj.getAv_cencos(), obj.getAv_proy());
	}

	@Override
	public void swEliRecVnt(int opcion, String cia, String ejercicio, String PER, String SD, String asiento,
			lcoTblaVenta obj) {
		 repository.swEliRecVnt(opcion, cia, ejercicio, PER, SD, asiento, obj.getPkID().getAv_codper(),
	                obj.getPkID().getAv_subdia(), obj.getPkID().getAv_compro(), obj.getAv_feccom(), obj.getAv_fecdoc(),
	                obj.getAv_fecven(),
	                obj.getAv_tipdoc(), obj.getAv_docser(), obj.getAv_docnum(), obj.getAv_numdoc(), obj.getAv_tipane(),
	                obj.getAv_codane(), obj.getAv_tipide(), obj.getAv_numide(), obj.getAv_nomane(), obj.getAv_codmon(),
	                obj.getAv_afemn(), obj.getAv_inamn(), obj.getAv_iscmn(), obj.getAv_exomn(), obj.getAv_igvmn(),
	                obj.getAv_ivamn(), obj.getAv_otrmn(), obj.getAv_desmn(), obj.getAv_idemn(), obj.getAv_expmn(),
	                obj.getAv_icbpmn(),
	                obj.getAv_importmn(), obj.getAv_afeme(), obj.getAv_iname(), obj.getAv_iscme(), obj.getAv_exome(),
	                obj.getAv_igvme(), obj.getAv_ivame(), obj.getAv_otrme(), obj.getAv_desme(), obj.getAv_ideme(),
	                obj.getAv_expme(), obj.getAv_icbpme(), obj.getAv_importme(),obj.getAv_tctipo(),obj.getAv_tipcamb(),
	                obj.getAv_porcigv(), obj.getAv_fecdocref(), obj.getAv_tipdocref(), obj.getAv_docserref(),
	                obj.getAv_docnumref(), obj.getAv_usrcrea(), obj.getAv_feccrea(), obj.getAv_hracrea(),
	                obj.getAv_usract(), obj.getAv_fecact(),
	                obj.getAv_hraact(), obj.getAv_secuen(), obj.getAv_cuenta(), obj.getAv_perrec(), obj.getAv_medpag(),
	                obj.getAv_estado(), obj.getAv_cencos(), obj.getAv_proy());
		
	}

	@Override
	public void swCrearRecVnt(int opcion, String cia, String ejercicio, String PER, String SD, String asiento,
			lcoTblaVenta obj) {
		  repository.swCrearRecVnt(opcion, cia, ejercicio, PER, SD, asiento, obj.getPkID().getAv_codper(),
	                obj.getPkID().getAv_subdia(), obj.getPkID().getAv_compro(), obj.getAv_feccom(), obj.getAv_fecdoc(),
	                obj.getAv_fecven(),
	                obj.getAv_tipdoc(), obj.getAv_docser(), obj.getAv_docnum(), obj.getAv_numdoc(), obj.getAv_tipane(),
	                obj.getAv_codane(), obj.getAv_tipide(), obj.getAv_numide(), obj.getAv_nomane(), obj.getAv_codmon(),
	                obj.getAv_afemn(), obj.getAv_inamn(), obj.getAv_iscmn(), obj.getAv_exomn(), obj.getAv_igvmn(),
	                obj.getAv_ivamn(), obj.getAv_otrmn(), obj.getAv_desmn(), obj.getAv_idemn(), obj.getAv_expmn(),
	                obj.getAv_icbpmn(),
	                obj.getAv_importmn(), obj.getAv_afeme(), obj.getAv_iname(), obj.getAv_iscme(), obj.getAv_exome(),
	                obj.getAv_igvme(), obj.getAv_ivame(), obj.getAv_otrme(), obj.getAv_desme(), obj.getAv_ideme(),
	                obj.getAv_expme(), obj.getAv_icbpme(), obj.getAv_importme(),obj.getAv_tctipo(),obj.getAv_tipcamb(),
	                obj.getAv_porcigv(), obj.getAv_fecdocref(), obj.getAv_tipdocref(), obj.getAv_docserref(),
	                obj.getAv_docnumref(), obj.getAv_usrcrea(), obj.getAv_feccrea(), obj.getAv_hracrea(),
	                obj.getAv_usract(), obj.getAv_fecact(),
	                obj.getAv_hraact(), obj.getAv_secuen(), obj.getAv_cuenta(), obj.getAv_perrec(), obj.getAv_medpag(),
	                obj.getAv_estado(), obj.getAv_cencos(), obj.getAv_proy());
		
	}

	@Override
	public void swActRecVnt(int opcion, String cia, String ejercicio, String PER, String SD, String asiento,
			lcoTblaVenta obj) {
	     repository.swActRecVnt(opcion, cia, ejercicio, PER, SD, asiento, obj.getPkID().getAv_codper(),
	                obj.getPkID().getAv_subdia(), obj.getPkID().getAv_compro(), obj.getAv_feccom(), obj.getAv_fecdoc(),
	                obj.getAv_fecven(),
	                obj.getAv_tipdoc(), obj.getAv_docser(), obj.getAv_docnum(), obj.getAv_numdoc(), obj.getAv_tipane(),
	                obj.getAv_codane(), obj.getAv_tipide(), obj.getAv_numide(), obj.getAv_nomane(), obj.getAv_codmon(),
	                obj.getAv_afemn(), obj.getAv_inamn(), obj.getAv_iscmn(), obj.getAv_exomn(), obj.getAv_igvmn(),
	                obj.getAv_ivamn(), obj.getAv_otrmn(), obj.getAv_desmn(), obj.getAv_idemn(), obj.getAv_expmn(),
	                obj.getAv_icbpmn(),
	                obj.getAv_importmn(), obj.getAv_afeme(), obj.getAv_iname(), obj.getAv_iscme(), obj.getAv_exome(),
	                obj.getAv_igvme(), obj.getAv_ivame(), obj.getAv_otrme(), obj.getAv_desme(), obj.getAv_ideme(),
	                obj.getAv_expme(), obj.getAv_icbpme(), obj.getAv_importme(),obj.getAv_tctipo(),obj.getAv_tipcamb(),
	                obj.getAv_porcigv(), obj.getAv_fecdocref(), obj.getAv_tipdocref(), obj.getAv_docserref(),
	                obj.getAv_docnumref(), obj.getAv_usrcrea(), obj.getAv_feccrea(), obj.getAv_hracrea(),
	                obj.getAv_usract(), obj.getAv_fecact(),
	                obj.getAv_hraact(), obj.getAv_secuen(), obj.getAv_cuenta(), obj.getAv_perrec(), obj.getAv_medpag(),
	                obj.getAv_estado(), obj.getAv_cencos(), obj.getAv_proy());
		
	}

	@Override
	public List<Map<String, Object[]>> swListarAyuOmi(int opcion, String cia, String ejercicio, String PER, String SD,
			String asiento, lcoTblaVenta obj) {
		  return repository.swListarAyuOmi(opcion, cia, ejercicio, PER, SD, asiento, obj.getPkID().getAv_codper(),
	                obj.getPkID().getAv_subdia(), obj.getPkID().getAv_compro(), obj.getAv_feccom(), obj.getAv_fecdoc(),
	                obj.getAv_fecven(),
	                obj.getAv_tipdoc(), obj.getAv_docser(), obj.getAv_docnum(), obj.getAv_numdoc(), obj.getAv_tipane(),
	                obj.getAv_codane(), obj.getAv_tipide(), obj.getAv_numide(), obj.getAv_nomane(), obj.getAv_codmon(),
	                obj.getAv_afemn(), obj.getAv_inamn(), obj.getAv_iscmn(), obj.getAv_exomn(), obj.getAv_igvmn(),
	                obj.getAv_ivamn(), obj.getAv_otrmn(), obj.getAv_desmn(), obj.getAv_idemn(), obj.getAv_expmn(),
	                obj.getAv_icbpmn(),
	                obj.getAv_importmn(), obj.getAv_afeme(), obj.getAv_iname(), obj.getAv_iscme(), obj.getAv_exome(),
	                obj.getAv_igvme(), obj.getAv_ivame(), obj.getAv_otrme(), obj.getAv_desme(), obj.getAv_ideme(),
	                obj.getAv_expme(), obj.getAv_icbpme(), obj.getAv_importme(),obj.getAv_tctipo(),obj.getAv_tipcamb(),
	                obj.getAv_porcigv(), obj.getAv_fecdocref(), obj.getAv_tipdocref(), obj.getAv_docserref(),
	                obj.getAv_docnumref(), obj.getAv_usrcrea(), obj.getAv_feccrea(), obj.getAv_hracrea(),
	                obj.getAv_usract(), obj.getAv_fecact(),
	                obj.getAv_hraact(), obj.getAv_secuen(), obj.getAv_cuenta(), obj.getAv_perrec(), obj.getAv_medpag(),
	                obj.getAv_estado(), obj.getAv_cencos(), obj.getAv_proy());
	}
}
