package com.empresa.repository;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface reportEstadoResultRepository extends JpaRepository<lcoCabV, lcoCabVPk> {
    @Query(value = "{call SP_EstadoResultado(:opcion, :p_ciacont, :ejercicio, :periodo, :tipo, :n, :ltm, :formula, :cero)}", nativeQuery = true)
    List<Map<String, Object>> swExisFormato(@Param("opcion") int opcion,
            @Param("p_ciacont") String p_ciacont,
            @Param("ejercicio") String ejercicio,
            @Param("periodo") String periodo,
            @Param("tipo") String tipo,
            @Param("n") String n,
            @Param("ltm") String ltm,
            @Param("formula") String formula,
            @Param("cero") String cero

    );

    @Query(value = "{call SP_EstadoResultado(:opcion, :p_ciacont, :ejercicio, :periodo, :tipo, :n, :ltm, :formula, :cero)}", nativeQuery = true)
    List<Map<String, Object>> swRepFrmResuGyP(@Param("opcion") int opcion,
            @Param("p_ciacont") String p_ciacont,
            @Param("ejercicio") String ejercicio,
            @Param("periodo") String periodo,
            @Param("tipo") String tipo,
            @Param("n") String n,
            @Param("ltm") String ltm,
            @Param("formula") String formula,
            @Param("cero") String cero

    );

    @Query(value = "{call SP_EstadoResultado(:opcion, :p_ciacont, :ejercicio, :periodo, :tipo, :n, :ltm, :formula, :cero)}", nativeQuery = true)
    List<Map<String, Object>> swRepFrmResuTot(@Param("opcion") int opcion,
            @Param("p_ciacont") String p_ciacont,
            @Param("ejercicio") String ejercicio,
            @Param("periodo") String periodo,
            @Param("tipo") String tipo,
            @Param("n") String n,
            @Param("ltm") String ltm,
            @Param("formula") String formula,
            @Param("cero") String cero

    );

    // SP_ESTADORESULTADOS Version 2 HUR-1042

    @Query(value = "{call SP_EstadoResultado1(:Tcia, :Tperiodo, :TForm, :TModel)}", nativeQuery = true)
    List<Map<String, Object>> swEstadoResul1(
            @Param("Tcia") String Tcia,
            @Param("Tperiodo") String Tperiodo,
            @Param("TForm") String TForm,
            @Param("TModel") String TModel);

    @Query(value = "{call SP_EstadoResultado2(:Tcia, :TForm, :TModel)}", nativeQuery = true)
    @Transactional
    @Modifying
    void swEstadoResul2(
            @Param("Tcia") String Tcia,
            @Param("TForm") String TForm,
            @Param("TModel") String TModel);
}
