package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoVent21;
import com.empresa.repository.registroVentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class registroVentaServiceImp implements registroVentaService{
    @Autowired
    private registroVentaRepository repository;
    @Override   
    public List<Map<String, Object>> swValRegVnt(int opcion, String p_ciacont, String ejercicio, String per,
            String par) {
        // TODO Auto-generated method stub
        return repository.swValRegVnt(opcion, p_ciacont, ejercicio, per, par);
    }

    @Override
    public List<Map<String, Object>> swRegVntTbl(int opcion, String p_ciacont, String ejercicio, String per,
            String par) {
        // TODO Auto-generated method stub
        return repository.swRegVntTbl(opcion, p_ciacont, ejercicio, per, par);
    }

    @Override
    public List<Map<String, Object>> swRegVntPLE(int opcion, String p_ciacont, String ejercicio, String per,
            String par) {
        // TODO Auto-generated method stub
        return repository.swRegVntPLE(opcion, p_ciacont, ejercicio, per, par);
    }

    @Override
    public List<Map<String, Object>> Listar_p(int opcion, String p_ciacont, String ejercicio, String per, String par) {
        // TODO Auto-generated method stub
        return repository.Listar_p(opcion, p_ciacont, ejercicio, per, par);
    }

    @Override
    public List<Map<String, Object>> swLstRecVnt(int opcion, String p_ciacont, String ejercicio, String per,
            String par) {
        // TODO Auto-generated method stub
        return repository.swLstRecVnt(opcion, p_ciacont, ejercicio, per, par);
    }

    @Override
    public void swGrabarVentas(int opcion, String p_ciacont, String per, lcoVent21 obj) {
        // TODO Auto-generated method stub
        repository.swGrabarVentas(opcion,p_ciacont, per, obj.getPk().getRv_subdia(), obj.getPk().getRv_compro(), obj.getPk().getRv_secuen(), obj.getRv_feccom(), obj.getRv_fecdoc(), obj.getRv_fecven(),
                                        obj.getRv_tipdoc(), obj.getRv_serdoc(), obj.getRv_nrodoc(), obj.getRv_nrodini(), obj.getRv_nrodfin(), obj.getRv_numdoc(), obj.getRv_tipane(), obj.getRv_codane(),
                                        obj.getRv_tpdocide(), obj.getRv_rucane(), obj.getRv_nomane(), obj.getRv_codmon(), obj.getRv_afemn(), obj.getRv_inamn(),
                                        obj.getRv_iscmn(), obj.getRv_exomn(), obj.getRv_igvmn(), obj.getRv_impomn(), obj.getRv_otrmn(), obj.getRv_detmn(), obj.getRv_expmn(),
                                        obj.getRv_afeme(), obj.getRv_iname(), obj.getRv_iscme(), obj.getRv_exome(), obj.getRv_igvme(), obj.getRv_impome(), obj.getRv_otrme(),
                                        obj.getRv_detme(), obj.getRv_expme(), obj.getRv_tipcam(), obj.getRv_porigv(), obj.getRv_bivapmn(), obj.getRv_bivapme(), obj.getRv_fedore(), obj.getRv_tidore(), obj.getRv_sedore(),
                                        obj.getRv_nudere(), obj.getRv_feccre(), obj.getRv_horcre(), obj.getRv_usucre(), obj.getRv_fecmod(), obj.getRv_hormod(), obj.getRv_usumod(),
                                        obj.getRv_cencos(), obj.getRv_bolmn(), obj.getRv_bolme(), obj.getRv_ivapmn(), obj.getRv_ivapme(), obj.getRv_medpag(), obj.getRv_estado(),
                                        obj.getRv_descto(), obj.getRv_impdsct());
    }
    
}
