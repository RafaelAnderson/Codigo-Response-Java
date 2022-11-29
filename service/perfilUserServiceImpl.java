package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoumnu;
import com.empresa.repository.perfilUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class perfilUserServiceImpl implements perfilUserService{

    @Autowired
    perfilUserRepository repository;

    @Override
    public List<Map<String, Object>> swListarMnuSel(int opcion, lcoumnu obj){
        return repository.swListarMnuSel(opcion, obj.getPk().getUm_codusr(), obj.getPk().getUm_id(), obj.getUm_id0(), obj.getUm_id1(),
        obj.getUm_id2(), obj.getUm_usrcrea(), obj.getUm_feccrea(), obj.getUm_hracrea(), obj.getUm_usract(), obj.getUm_fecact(),
        obj.getUm_hraact());
    }

    @Override
    public List<Map<String, Object>> swListarMnu(int opcion, lcoumnu obj){
        return repository.swListarMnu(opcion, obj.getPk().getUm_codusr(), obj.getPk().getUm_id(), obj.getUm_id0(), obj.getUm_id1(),
        obj.getUm_id2(), obj.getUm_usrcrea(), obj.getUm_feccrea(), obj.getUm_hracrea(), obj.getUm_usract(), obj.getUm_fecact(),
        obj.getUm_hraact());
    }

    @Override
    public void swGrabarUsrMnu(int opcion, lcoumnu obj){
        repository.swGrabarUsrMnu(opcion, obj.getPk().getUm_codusr(), obj.getPk().getUm_id(), obj.getUm_id0(), obj.getUm_id1(),
        obj.getUm_id2(), obj.getUm_usrcrea(), obj.getUm_feccrea(), obj.getUm_hracrea(), obj.getUm_usract(), obj.getUm_fecact(),
        obj.getUm_hraact());
    }
    
    @Override
    public List<lcoumnu> listarUmnu(int opcion, lcoumnu obj){
        return repository.listarUmnu(opcion, obj.getPk().getUm_codusr(), obj.getPk().getUm_id(), obj.getUm_id0(), obj.getUm_id1(),
        obj.getUm_id2(), obj.getUm_usrcrea(), obj.getUm_feccrea(), obj.getUm_hracrea(), obj.getUm_usract(), obj.getUm_fecact(),
        obj.getUm_hraact());
    }

    @Override
    public void swLimpiarUsrMnu(int opcion, lcoumnu obj){
        repository.swLimpiarUsrMnu(opcion, obj.getPk().getUm_codusr(), obj.getPk().getUm_id(), obj.getUm_id0(), obj.getUm_id1(),
        obj.getUm_id2(), obj.getUm_usrcrea(), obj.getUm_feccrea(), obj.getUm_hracrea(), obj.getUm_usract(), obj.getUm_fecact(),
        obj.getUm_hraact());
    }
}
