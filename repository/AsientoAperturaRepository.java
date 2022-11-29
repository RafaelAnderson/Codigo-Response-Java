package com.empresa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;
import com.empresa.entity.lcoDetV;
import com.empresa.entity.lcoDetVPk;

@Repository
public interface AsientoAperturaRepository extends JpaRepository<lcoDetV, lcoDetVPk>{
    @Query(value="{call SP_AsientoApertura(:opcion, :cia, :ejercicio, :periodo, :parametro)}" , nativeQuery = true)
    List<Map<String,Object>> swListarTablaVarSD(@Param("opcion") int opcion,
                                                @Param("cia") String cia,
                                                @Param("ejercicio") String ejercicio,
                                                @Param("periodo") String periodo,
                                                @Param("parametro") String parametro);

    @Query(value="{call SP_AsientoApertura(:opcion, :cia, :ejercicio, :periodo, :parametro)}" , nativeQuery = true)
    List<Map<String,Object>> swListarSaldosCuenta(@Param("opcion") int opcion,
                                                @Param("cia") String cia,
                                                @Param("ejercicio") String ejercicio,
                                                @Param("periodo") String periodo,
                                                @Param("parametro") String parametro);    
}
