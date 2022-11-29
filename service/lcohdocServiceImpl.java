package com.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

import com.empresa.repository.lcohdocRepository;

@Service
public class lcohdocServiceImpl implements lcohdocService {

    @Autowired
    private lcohdocRepository repo;

    @Override
    public void swCargaDocHon(int opcion, String periodo, String usu, String cia,
            String ejer, String orden, String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo) {
        repo.swCargaDocHon(opcion, periodo, usu, cia, ejer, orden, codAnexo, tipoDoc, serDoc, numDoc, perSaldo);
    }

    @Override
    public void swCargaProvHon(int opcion, String periodo, String usu, String cia,
            String ejer, String orden, String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo) {
        repo.swCargaProvHon(opcion, periodo, usu, cia, ejer, orden, codAnexo, tipoDoc, serDoc, numDoc, perSaldo);
    }

    @Override
    public List<Map<String, Object[]>> swListarHonDoc(int opcion, String periodo, String usu, String cia,
            String ejer, String orden, String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo) {
        return repo.swListarHonDoc(opcion, periodo, usu, cia, ejer, orden, codAnexo, tipoDoc, serDoc, numDoc, perSaldo);
    }

    @Override
    public List<Map<String, Object[]>> swListarHonDeta(int opcion, String periodo, String usu, String cia,
            String ejer, String orden, String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo) {
        return repo.swListarHonDeta(opcion, periodo, usu, cia, ejer, orden, codAnexo, tipoDoc, serDoc, numDoc,
                perSaldo);
    }

    @Override
    public List<Map<String, Object[]>> swListarHonDetaTotal(int opcion, String periodo, String usu, String cia,
            String ejer, String orden, String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo) {
        return repo.swListarHonDetaTotal(opcion, periodo, usu, cia, ejer, orden, codAnexo, tipoDoc, serDoc, numDoc,
                perSaldo);
    }

    @Override
    public List<Map<String, Object[]>> swListarFormato07(int opcion, String periodo, String usu, String cia,
            String ejer, String orden, String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo) {
        return repo.swListarFormato07(opcion, periodo, usu, cia, ejer, orden, codAnexo, tipoDoc, serDoc, numDoc,
                perSaldo);
    }

    @Override
    public List<Map<String, Object[]>> swListarFormato20(int opcion, String periodo, String usu, String cia,
            String ejer, String orden, String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo) {
        return repo.swListarFormato20(opcion, periodo, usu, cia, ejer, orden, codAnexo, tipoDoc, serDoc, numDoc,
                perSaldo);
    }

    @Override
    public List<Map<String, Object[]>> swReportEstFluEfec(String periodo, String cia, String ejer, String FRM) {
        return repo.swReportEstFluEfec(periodo, cia, ejer, FRM);
    }
}