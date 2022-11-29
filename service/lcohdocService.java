package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface lcohdocService {
        void swCargaDocHon(
                        int opcion, String periodo, String usu, String cia, String ejer, String orden,
                        String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo);

        void swCargaProvHon(
                        int opcion, String periodo, String usu, String cia, String ejer, String orden,
                        String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo);

        public List<Map<String, Object[]>> swListarHonDoc(
                        int opcion, String periodo, String usu, String cia, String ejer, String orden,
                        String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo);

        public List<Map<String, Object[]>> swListarHonDeta(
                        int opcion, String periodo, String usu, String cia, String ejer, String orden,
                        String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo);

        public List<Map<String, Object[]>> swListarHonDetaTotal(
                        int opcion, String periodo, String usu, String cia, String ejer, String orden,
                        String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo);

        public List<Map<String, Object[]>> swListarFormato07(
                        int opcion, String periodo, String usu, String cia, String ejer, String orden,
                        String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo);

        public List<Map<String, Object[]>> swListarFormato20(
                        int opcion, String periodo, String usu, String cia, String ejer, String orden,
                        String codAnexo, String tipoDoc, String serDoc, String numDoc, String perSaldo);

        public List<Map<String, Object[]>> swReportEstFluEfec(
                        String periodo, String cia, String ejer, String FRM);

}
