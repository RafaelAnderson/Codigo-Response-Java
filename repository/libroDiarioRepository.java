package com.empresa.repository;

import java.util.List;
import java.util.Map;

import com.empresa.entity.lcoCabV;
import com.empresa.entity.lcoCabVPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface libroDiarioRepository extends JpaRepository<lcoCabV, lcoCabVPk>{
    @Query(value="{call SP_LibroDiario(:opcion, :p_ciacont, :ejercicio, :periodo, :subdia)}" , nativeQuery = true)
    List<Map<String, Object>> swLibDiario(@Param("opcion") int opcion,
								  @Param("p_ciacont") String p_ciacont,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("periodo") String periodo,
								  @Param("subdia") String subdia
								  );
    
    @Query(value="{call SP_LibroDiario(:opcion, :p_ciacont, :ejercicio, :periodo, :subdia)}" , nativeQuery = true)
    List<Map<String, Object>> swLibDiarioPLE (@Param("opcion") int opcion,
								  @Param("p_ciacont") String p_ciacont,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("periodo") String periodo,
								  @Param("subdia") String subdia
								  );

    @Query(value="{call SP_LibroDiario(:opcion, :p_ciacont, :ejercicio, :periodo, :subdia)}" , nativeQuery = true)
    List<Map<String, Object>> swPlanCtaPLE (@Param("opcion") int opcion,
								  @Param("p_ciacont") String p_ciacont,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("periodo") String periodo,
								  @Param("subdia") String subdia
								  );

    @Query(value="{call SP_LibroDiario(:opcion, :p_ciacont, :ejercicio, :periodo, :subdia)}" , nativeQuery = true)
    List<Map<String, Object>> swLibDiarioSubdiario (@Param("opcion") int opcion,
								  @Param("p_ciacont") String p_ciacont,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("periodo") String periodo,
								  @Param("subdia") String subdia
								  );

	@Query(value="{call SP_LibroDiario(:opcion, :p_ciacont, :ejercicio, :periodo, :subdia)}" , nativeQuery = true)
    List<Map<String, Object>> swLibDiarioPLESubdiario (@Param("opcion") int opcion,
								  @Param("p_ciacont") String p_ciacont,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("periodo") String periodo,
								  @Param("subdia") String subdia
								  );

}
