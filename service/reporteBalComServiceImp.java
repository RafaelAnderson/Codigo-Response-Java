package com.empresa.service;
import java.util.Map;
import java.util.List;

import com.empresa.repository.reporteBalComRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reporteBalComServiceImp implements reporteBalComService{
    @Autowired
    private reporteBalComRepository repository;
    @Override
    public List<Object[]> swBalComp(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep) {
        // TODO Auto-generated method stub
        return repository.swBalComp(opcion, Cia, ejercicio, PER, Nd, pCta, tipRep);
    }
    @Override
    public List<Object[]> swBalCompAper(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep) {
        // TODO Auto-generated method stub
        return repository.swBalCompAper(opcion, Cia, ejercicio, PER, Nd, pCta, tipRep);
    }
    @Override
    public List<Object[]> swBalCompNOrd(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep) {
        // TODO Auto-generated method stub
        return repository.swBalCompNOrd(opcion, Cia, ejercicio, PER, Nd, pCta, tipRep);
    }
    @Override
    public List<Map<String,Object[]>> swBalComptipo2(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep) {
        // TODO Auto-generated method stub
        return repository.swBalComptipo2(opcion, Cia, ejercicio, PER, Nd, pCta, tipRep);
    }
    @Override
    public List<Map<String,Object[]>> swBalCompApertipo2(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep) {
        // TODO Auto-generated method stub
        return repository.swBalCompApertipo2(opcion, Cia, ejercicio, PER, Nd, pCta, tipRep);
    }
    @Override
    public List<Map<String,Object[]>> swBalCompNOrdtipo2(int opcion, String Cia, String ejercicio,String PER,String Nd,String pCta,String tipRep) {
        // TODO Auto-generated method stub
        return repository.swBalCompNOrdtipo2(opcion, Cia, ejercicio, PER, Nd, pCta, tipRep);
    }
}
