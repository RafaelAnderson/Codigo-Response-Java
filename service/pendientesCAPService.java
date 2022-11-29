package com.empresa.service;

import java.util.List;
import java.util.Map;

public interface pendientesCAPService {
    List<Map<String, Object>> swListarPendCAD(int opcion, String p_ciacont, String ejercicio, String periodo, String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni, String CstFin, String fecIni, String fecVen, String orden);

    List<Map<String, Object>> swListarResuPCAD(int opcion, String p_ciacont, String ejercicio, String periodo, String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni, String CstFin, String fecIni, String fecVen, String orden);

    List<Map<String, Object>> swListarPlanoPCAD(int opcion, String p_ciacont, String ejercicio, String periodo, String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni, String CstFin, String fecIni, String fecVen, String orden);
    
    List<Map<String, Object>> ultAnexo(int opcion, String p_ciacont, String ejercicio, String periodo, String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni, String CstFin, String fecIni, String fecVen, String orden);
    
    List<Map<String, Object>> ultCuenta(int opcion, String p_ciacont, String ejercicio, String periodo, String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni, String CstFin, String fecIni, String fecVen, String orden);
    
    List<Map<String, Object>> ultCosto(int opcion, String p_ciacont, String ejercicio, String periodo, String info, String anex, String CtaInicial, String CtaFinal, String AnexIni, String AnexFin, String CstIni, String CstFin, String fecIni, String fecVen, String orden);

}
