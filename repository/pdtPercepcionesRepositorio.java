package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.Modifying;

import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;

import javax.transaction.Transactional;

public interface pdtPercepcionesRepositorio extends JpaRepository<lcoDetV, lcoDetVPk> {
    @Query(value = "{call SP_PDT_Percepciones(:basedatos ,:opcion ,:cia,:ejercicio,:Periodo)}", nativeQuery = true)
    @Modifying
    @Transactional
    List<Map<String, Object[]>> swCargaPercepciones(
            @Param("basedatos") String basedatos,
            @Param("opcion") Integer opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("Periodo") String Periodo);

}