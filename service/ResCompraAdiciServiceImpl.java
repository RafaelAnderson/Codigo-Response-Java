package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcocmpa;
import com.empresa.repository.ResCompraAdiciRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResCompraAdiciServiceImpl implements ResCompraAdiciService {

    @Autowired
    private ResCompraAdiciRepository repository;

    @Override
    public List<Map<String, Object[]>> swListarRecCmp(int opcion, String cia, String ejercicio, String PER,String SD , String ASIENTO, lcocmpa obj) {
        return repository.swListarRecCmp(opcion, cia, ejercicio, PER,SD,ASIENTO,obj.getPkID().getAc_codper(),obj.getPkID().getAc_subdia(),obj.getPkID().getAc_compro(),
        obj.getAc_feccom(), obj.getAc_fecdoc(), obj.getAc_fecven(), obj.getAc_tipdoc(), obj.getAc_docser(), obj.getAc_docnum(),obj.getAc_numdoc(), obj.getAc_tipane(), 
        obj.getAc_codane(), obj.getAc_tipide(), obj.getAc_numide(), obj.getAc_nomane(), obj.getAc_codmon(), obj.getAc_afemn(), obj.getAc_inamn(), obj.getAc_igvmn(), 
        obj.getAc_importmn(), obj.getAc_iscmn(), obj.getAc_otrmn(), obj.getAc_idemn(), obj.getAc_afeme(), obj.getAc_iname(), obj.getAc_igvme(), obj.getAc_importme(), 
        obj.getAc_iscme(), obj.getAc_otrme(), obj.getAc_ideme(), obj.getAc_numdet(), obj.getAc_fecdet(), obj.getAc_tipcamb(), obj.getAc_fecdocref(), obj.getAc_tipdocref(),
        obj.getAc_docserref(), obj.getAc_docnumref(), obj.getAc_feccrea(), obj.getAc_hracrea(), obj.getAc_usrcrea(), obj.getAc_fecact(), obj.getAc_hraact(), obj.getAc_usract(), 
        obj.getAc_recmn(), obj.getAc_recme(), obj.getAc_codcla(), obj.getAc_secuen(), obj.getAc_cuenta(), obj.getAc_perrec(), obj.getAc_medpag(), obj.getAc_estado(), obj.getAc_datadi(),
        obj.getAc_coddet(), obj.getAc_icbpmn(), obj.getAc_icbpme(), obj.getAc_irlqmn(), obj.getAc_irlqme());

    }

     @Override
    public List<Map<String, Object[]>> swBscRecCmp(int opcion, String cia, String ejercicio, String PER, String SD,
            String ASIENTO, lcocmpa obj) {
        return repository.swBscRecCmp(opcion, cia, ejercicio, PER,SD,ASIENTO,obj.getPkID().getAc_codper(),obj.getPkID().getAc_subdia(),obj.getPkID().getAc_compro(),
        obj.getAc_feccom(), obj.getAc_fecdoc(), obj.getAc_fecven(), obj.getAc_tipdoc(), obj.getAc_docser(), obj.getAc_docnum(),obj.getAc_numdoc(), obj.getAc_tipane(), 
        obj.getAc_codane(), obj.getAc_tipide(), obj.getAc_numide(), obj.getAc_nomane(), obj.getAc_codmon(), obj.getAc_afemn(), obj.getAc_inamn(), obj.getAc_igvmn(), 
        obj.getAc_importmn(), obj.getAc_iscmn(), obj.getAc_otrmn(), obj.getAc_idemn(), obj.getAc_afeme(), obj.getAc_iname(), obj.getAc_igvme(), obj.getAc_importme(), 
        obj.getAc_iscme(), obj.getAc_otrme(), obj.getAc_ideme(), obj.getAc_numdet(), obj.getAc_fecdet(), obj.getAc_tipcamb(), obj.getAc_fecdocref(), obj.getAc_tipdocref(),
        obj.getAc_docserref(), obj.getAc_docnumref(), obj.getAc_feccrea(), obj.getAc_hracrea(), obj.getAc_usrcrea(), obj.getAc_fecact(), obj.getAc_hraact(), obj.getAc_usract(), 
        obj.getAc_recmn(), obj.getAc_recme(), obj.getAc_codcla(), obj.getAc_secuen(), obj.getAc_cuenta(), obj.getAc_perrec(), obj.getAc_medpag(), obj.getAc_estado(), obj.getAc_datadi(),
        obj.getAc_coddet(), obj.getAc_icbpmn(), obj.getAc_icbpme(), obj.getAc_irlqmn(), obj.getAc_irlqme());
    }
    
    @Override
    public List<Map<String, Object[]>> swConRecCmp(int opcion, String cia, String ejercicio, String PER, String SD,
            String ASIENTO, lcocmpa obj) {
        return repository.swConRecCmp(opcion, cia, ejercicio, PER,SD,ASIENTO,obj.getPkID().getAc_codper(),obj.getPkID().getAc_subdia(),obj.getPkID().getAc_compro(),
        obj.getAc_feccom(), obj.getAc_fecdoc(), obj.getAc_fecven(), obj.getAc_tipdoc(), obj.getAc_docser(), obj.getAc_docnum(),obj.getAc_numdoc(), obj.getAc_tipane(), 
        obj.getAc_codane(), obj.getAc_tipide(), obj.getAc_numide(), obj.getAc_nomane(), obj.getAc_codmon(), obj.getAc_afemn(), obj.getAc_inamn(), obj.getAc_igvmn(), 
        obj.getAc_importmn(), obj.getAc_iscmn(), obj.getAc_otrmn(), obj.getAc_idemn(), obj.getAc_afeme(), obj.getAc_iname(), obj.getAc_igvme(), obj.getAc_importme(), 
        obj.getAc_iscme(), obj.getAc_otrme(), obj.getAc_ideme(), obj.getAc_numdet(), obj.getAc_fecdet(), obj.getAc_tipcamb(), obj.getAc_fecdocref(), obj.getAc_tipdocref(),
        obj.getAc_docserref(), obj.getAc_docnumref(), obj.getAc_feccrea(), obj.getAc_hracrea(), obj.getAc_usrcrea(), obj.getAc_fecact(), obj.getAc_hraact(), obj.getAc_usract(), 
        obj.getAc_recmn(), obj.getAc_recme(), obj.getAc_codcla(), obj.getAc_secuen(), obj.getAc_cuenta(), obj.getAc_perrec(), obj.getAc_medpag(), obj.getAc_estado(), obj.getAc_datadi(),
        obj.getAc_coddet(), obj.getAc_icbpmn(), obj.getAc_icbpme(), obj.getAc_irlqmn(), obj.getAc_irlqme());
    }

    @Override
    public void swEliRecCmp(int opcion, String cia, String ejercicio, String PER, String SD, String ASIENTO,
            lcocmpa obj) {
        repository.swEliRecCmp(opcion, cia, ejercicio, PER,SD,ASIENTO,obj.getPkID().getAc_codper(),obj.getPkID().getAc_subdia(),obj.getPkID().getAc_compro(),
        obj.getAc_feccom(), obj.getAc_fecdoc(), obj.getAc_fecven(), obj.getAc_tipdoc(), obj.getAc_docser(), obj.getAc_docnum(),obj.getAc_numdoc(), obj.getAc_tipane(), 
        obj.getAc_codane(), obj.getAc_tipide(), obj.getAc_numide(), obj.getAc_nomane(), obj.getAc_codmon(), obj.getAc_afemn(), obj.getAc_inamn(), obj.getAc_igvmn(), 
        obj.getAc_importmn(), obj.getAc_iscmn(), obj.getAc_otrmn(), obj.getAc_idemn(), obj.getAc_afeme(), obj.getAc_iname(), obj.getAc_igvme(), obj.getAc_importme(), 
        obj.getAc_iscme(), obj.getAc_otrme(), obj.getAc_ideme(), obj.getAc_numdet(), obj.getAc_fecdet(), obj.getAc_tipcamb(), obj.getAc_fecdocref(), obj.getAc_tipdocref(),
        obj.getAc_docserref(), obj.getAc_docnumref(), obj.getAc_feccrea(), obj.getAc_hracrea(), obj.getAc_usrcrea(), obj.getAc_fecact(), obj.getAc_hraact(), obj.getAc_usract(), 
        obj.getAc_recmn(), obj.getAc_recme(), obj.getAc_codcla(), obj.getAc_secuen(), obj.getAc_cuenta(), obj.getAc_perrec(), obj.getAc_medpag(), obj.getAc_estado(), obj.getAc_datadi(),
        obj.getAc_coddet(), obj.getAc_icbpmn(), obj.getAc_icbpme(), obj.getAc_irlqmn(), obj.getAc_irlqme());

    }

    @Override
    public void swCrearRecCmp(int opcion, String cia, String ejercicio, String PER, String SD, String ASIENTO,
            lcocmpa obj) {
        repository.swCrearRecCmp(opcion, cia, ejercicio, PER,SD,ASIENTO,
        obj.getPkID().getAc_codper(),obj.getPkID().getAc_subdia(),obj.getPkID().getAc_compro(),obj.getAc_feccom(), obj.getAc_fecdoc(), obj.getAc_fecven(),      obj.getAc_tipdoc(), obj.getAc_docser(), obj.getAc_docnum(),obj.getAc_numdoc(), 
        obj.getAc_tipane(), obj.getAc_codane(), obj.getAc_tipide(), obj.getAc_numide(), obj.getAc_nomane(),     obj.getAc_codmon(),     obj.getAc_afemn(),      obj.getAc_inamn(), obj.getAc_igvmn(), obj.getAc_importmn(),
        obj.getAc_iscmn(),  obj.getAc_otrmn(), obj.getAc_idemn(),   obj.getAc_afeme(),  obj.getAc_iname(),      obj.getAc_igvme(),      obj.getAc_importme(),    obj.getAc_iscme(), obj.getAc_otrme(), obj.getAc_ideme(), 
        obj.getAc_numdet(), obj.getAc_fecdet(),obj.getAc_tipcamb(),obj.getAc_fecdocref(),obj.getAc_tipdocref(), obj.getAc_docserref(),  obj.getAc_docnumref(),  obj.getAc_feccrea(), obj.getAc_hracrea(),obj.getAc_usrcrea(),
        obj.getAc_fecact(), obj.getAc_hraact(), obj.getAc_usract(),obj.getAc_recmn(),   obj.getAc_recme(),      obj.getAc_codcla(),     obj.getAc_secuen(),     obj.getAc_cuenta(), obj.getAc_perrec(),obj.getAc_medpag(), 
        obj.getAc_estado(), obj.getAc_datadi(),obj.getAc_coddet(), obj.getAc_icbpmn(),  obj.getAc_icbpme(),     obj.getAc_irlqmn(),     obj.getAc_irlqme());

    }

    @Override
    public void swActRecCmp(int opcion, String cia, String ejercicio, String PER, String SD, String ASIENTO,
            lcocmpa obj) {
                repository.swActRecCmp(opcion, cia, ejercicio, PER,SD,ASIENTO,obj.getPkID().getAc_codper(),obj.getPkID().getAc_subdia(),obj.getPkID().getAc_compro(),
                obj.getAc_feccom(), obj.getAc_fecdoc(), obj.getAc_fecven(), obj.getAc_tipdoc(), obj.getAc_docser(), obj.getAc_docnum(),obj.getAc_numdoc(), obj.getAc_tipane(), 
                obj.getAc_codane(), obj.getAc_tipide(), obj.getAc_numide(), obj.getAc_nomane(), obj.getAc_codmon(), obj.getAc_afemn(), obj.getAc_inamn(), obj.getAc_igvmn(), 
                obj.getAc_importmn(), obj.getAc_iscmn(), obj.getAc_otrmn(), obj.getAc_idemn(), obj.getAc_afeme(), obj.getAc_iname(), obj.getAc_igvme(), obj.getAc_importme(), 
                obj.getAc_iscme(), obj.getAc_otrme(), obj.getAc_ideme(), obj.getAc_numdet(), obj.getAc_fecdet(), obj.getAc_tipcamb(), obj.getAc_fecdocref(), obj.getAc_tipdocref(),
                obj.getAc_docserref(), obj.getAc_docnumref(), obj.getAc_feccrea(), obj.getAc_hracrea(), obj.getAc_usrcrea(), obj.getAc_fecact(), obj.getAc_hraact(), obj.getAc_usract(), 
                obj.getAc_recmn(), obj.getAc_recme(), obj.getAc_codcla(), obj.getAc_secuen(), obj.getAc_cuenta(), obj.getAc_perrec(), obj.getAc_medpag(), obj.getAc_estado(), obj.getAc_datadi(),
                obj.getAc_coddet(), obj.getAc_icbpmn(), obj.getAc_icbpme(), obj.getAc_irlqmn(), obj.getAc_irlqme());
        
          

    }

    @Override
    public List<Map<String, Object[]>> swListarAyuOmi(int opcion, String cia, String ejercicio, String PER, String SD,
            String ASIENTO, lcocmpa obj) {
        return  repository.swListarAyuOmi(opcion, cia, ejercicio, PER,SD,ASIENTO,obj.getPkID().getAc_codper(),obj.getPkID().getAc_subdia(),obj.getPkID().getAc_compro(),
        obj.getAc_feccom(), obj.getAc_fecdoc(), obj.getAc_fecven(), obj.getAc_tipdoc(), obj.getAc_docser(), obj.getAc_docnum(),obj.getAc_numdoc(), obj.getAc_tipane(), 
        obj.getAc_codane(), obj.getAc_tipide(), obj.getAc_numide(), obj.getAc_nomane(), obj.getAc_codmon(), obj.getAc_afemn(), obj.getAc_inamn(), obj.getAc_igvmn(), 
        obj.getAc_importmn(), obj.getAc_iscmn(), obj.getAc_otrmn(), obj.getAc_idemn(), obj.getAc_afeme(), obj.getAc_iname(), obj.getAc_igvme(), obj.getAc_importme(), 
        obj.getAc_iscme(), obj.getAc_otrme(), obj.getAc_ideme(), obj.getAc_numdet(), obj.getAc_fecdet(), obj.getAc_tipcamb(), obj.getAc_fecdocref(), obj.getAc_tipdocref(),
        obj.getAc_docserref(), obj.getAc_docnumref(), obj.getAc_feccrea(), obj.getAc_hracrea(), obj.getAc_usrcrea(), obj.getAc_fecact(), obj.getAc_hraact(), obj.getAc_usract(), 
        obj.getAc_recmn(), obj.getAc_recme(), obj.getAc_codcla(), obj.getAc_secuen(), obj.getAc_cuenta(), obj.getAc_perrec(), obj.getAc_medpag(), obj.getAc_estado(), obj.getAc_datadi(),
        obj.getAc_coddet(), obj.getAc_icbpmn(), obj.getAc_icbpme(), obj.getAc_irlqmn(), obj.getAc_irlqme());
    }
 
}
