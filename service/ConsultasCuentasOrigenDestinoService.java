package com.empresa.service;
import java.util.List;
import java.util.Map;

public interface ConsultasCuentasOrigenDestinoService {

    List <Map<String,Object[]>> swConsCtaDstOrig(
        int opcion,
        String cia,
        String ejercicio,
        String periodo,
        String pcta
    );
}
