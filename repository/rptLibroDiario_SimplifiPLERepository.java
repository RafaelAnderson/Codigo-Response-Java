package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.repository.Modifying;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;
import javax.transaction.Transactional;

public interface rptLibroDiario_SimplifiPLERepository extends JpaRepository<lcoCabV, lcoCabVPk> {
    @Query(value = "{call SP_LibroDiario_SimplifiPLE(:basedatos ,:opcion ,:cia, :ejercicio, :PER)}", nativeQuery = true)
    @Modifying
    @Transactional
    List<Map<String, Object[]>> LibroDiario_SimplifiPLE(
            @Param("basedatos") String basedatos,
            @Param("opcion") Integer opcion,
            @Param("cia") String cia,
            @Param("ejercicio") String ejercicio,
            @Param("PER") String PER);
}