package com.empresa.service;

import java.util.List;
import java.util.Map;

import com.empresa.repository.pendientesCAPRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class pendientesCAPServiceImp implements pendientesCAPService{
    @Autowired
    private pendientesCAPRepository repository;
    @Override
    public List<Map<String, Object>> swListarPendCAD(int opcion, String p_ciacont, String ejercicio, String periodo,
            String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni,
            String CstFin, String fecIni, String fecVen, String orden) {
        // TODO Auto-generated method stub
        return repository.swListarPendCAD(opcion, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);
    }

    @Override
    public List<Map<String, Object>> swListarResuPCAD(int opcion, String p_ciacont, String ejercicio, String periodo,
            String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni,
            String CstFin, String fecIni, String fecVen, String orden) {
        // TODO Auto-generated method stub
        return repository.swListarResuPCAD(opcion, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);
    }

    @Override
    public List<Map<String, Object>> swListarPlanoPCAD(int opcion, String p_ciacont, String ejercicio, String periodo,
            String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni,
            String CstFin, String fecIni, String fecVen, String orden) {
        // TODO Auto-generated method stub
        return repository.swListarPlanoPCAD(opcion, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);
    }

    @Override
    public List<Map<String, Object>> ultAnexo(int opcion, String p_ciacont, String ejercicio, String periodo,
            String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni,
            String CstFin, String fecIni, String fecVen, String orden) {
        // TODO Auto-generated method stub
        return repository.ultAnexo(opcion, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);
    }

    @Override
    public List<Map<String, Object>> ultCuenta(int opcion, String p_ciacont, String ejercicio, String periodo,
            String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni,
            String CstFin, String fecIni, String fecVen, String orden) {
        // TODO Auto-generated method stub
        return repository.ultCuenta(opcion, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);
    }

    @Override
    public List<Map<String, Object>> ultCosto(int opcion, String p_ciacont, String ejercicio, String periodo,
            String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni,
            String CstFin, String fecIni, String fecVen, String orden) {
        // TODO Auto-generated method stub
        return repository.ultCosto(opcion, p_ciacont, ejercicio, periodo, info, anex, CtaInicial, CtaFinal, AnexIni, AnexFin, CstIni, CstFin, fecIni, fecVen, orden);
    }
    
}
