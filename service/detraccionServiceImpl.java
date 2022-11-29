package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.detraccion;
import com.empresa.repository.detraccionRepository;

@Service
public class detraccionServiceImpl implements detraccionService{
    @Autowired
    private detraccionRepository repository;

    @Override
    public List<detraccion> listarTASD(int opcion, String cia, detraccion obj) {
        return repository.listarTASD(opcion, cia, obj.getPk().getTd_tipope(), obj.getPk().getTd_codbser(), obj.getTd_dsctasa(), obj.getTd_tasa(),
            obj.getTd_valref1(), obj.getTd_valref2(), obj.getTd_flabas(), obj.getTd_usrcrea(), obj.getTd_feccrea(), obj.getTd_hracrea(), 
            obj.getTd_usract(), obj.getTd_fecact(), obj.getTd_hraact());
    }

    @Override
    public void creaTASD(int opcion, String cia, detraccion obj) {
        repository.creaTASD(opcion, cia, obj.getPk().getTd_tipope(), obj.getPk().getTd_codbser(), obj.getTd_dsctasa(), obj.getTd_tasa(),
        obj.getTd_valref1(), obj.getTd_valref2(), obj.getTd_flabas(), obj.getTd_usrcrea(), obj.getTd_feccrea(), obj.getTd_hracrea(), 
        obj.getTd_usract(), obj.getTd_fecact(), obj.getTd_hraact());
    } 
    @Override
    public void actuTASD(int opcion, String cia, detraccion obj) {
        repository.actuTASD(opcion, cia, obj.getPk().getTd_tipope(), obj.getPk().getTd_codbser(), obj.getTd_dsctasa(), obj.getTd_tasa(),
        obj.getTd_valref1(), obj.getTd_valref2(), obj.getTd_flabas(), obj.getTd_usrcrea(), obj.getTd_feccrea(), obj.getTd_hracrea(), 
        obj.getTd_usract(), obj.getTd_fecact(), obj.getTd_hraact());
    } 
    @Override
    public void eliminaTASD(int opcion, String cia, detraccion obj) {
        repository.eliminaTASD(opcion, cia, obj.getPk().getTd_tipope(), obj.getPk().getTd_codbser(), obj.getTd_dsctasa(), obj.getTd_tasa(),
        obj.getTd_valref1(), obj.getTd_valref2(), obj.getTd_flabas(), obj.getTd_usrcrea(), obj.getTd_feccrea(), obj.getTd_hracrea(), 
        obj.getTd_usract(), obj.getTd_fecact(), obj.getTd_hraact());
    } 
}
