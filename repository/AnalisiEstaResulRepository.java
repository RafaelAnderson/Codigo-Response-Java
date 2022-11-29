package com.empresa.repository;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcopflc;
import com.empresa.entity.lcopflcPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalisiEstaResulRepository extends JpaRepository<lcopflc, lcopflcPk> {

    @Query( value = "{call SP_AnalisisEstadoResultado(:opcion,:cia,:EJER,:PER,:N,:tipo,:modelo)}", nativeQuery = true)

    List<Map<String, Object[]>>swExisFormato(@Param("opcion")int opcion,
                                            @Param("cia")String cia,
                                            @Param("EJER")String EJER,
                                            @Param("PER")String PER,
                                            @Param("N")String N,
                                            @Param("tipo")String tipo,
                                            @Param("modelo")String modelo);                        


    @Query( value = "{call SP_AnalisisEstadoResultado(:opcion,:cia,:EJER,:PER,:N,:tipo,:modelo)}", nativeQuery = true)

    List<Map<String, Object[]>>swRepFrmAnaResu(@Param("opcion")int opcion,
                                               @Param("cia")String cia,
                                               @Param("EJER")String EJER,
                                               @Param("PER")String PER,
                                               @Param("N")String N,
                                               @Param("tipo")String tipo,
                                               @Param("modelo")String modelo);                        
    
}
