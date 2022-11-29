package com.empresa.repository;

import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ConsultasCuentaOrigenDestinoRepository extends JpaRepository<lcoDetV,lcoDetVPk>{

    //Permite listar los items para la consulta cuentas origen
    @Query(value = "{call SP_ConsultaCuentasOrigenDestino(:opcion,:cia,:ejercicio,:periodo,:pcta)}", nativeQuery = true)
    List<Map<String,Object[]>> consultaCuentaOrigen(
        @Param("opcion") int opcion,
        @Param("cia") String cia,
        @Param("ejercicio") String ejercicio,
        @Param("periodo") String periodo,
        @Param("pcta") String pcta
    );
    
}
