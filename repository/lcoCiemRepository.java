package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcoCiem;
import com.empresa.entity.lcoCiemPk;

public interface lcoCiemRepository extends JpaRepository<lcoCiem, lcoCiemPk>{
	
	
	@Query(value="{call SP_CrudlcoCiem( :opcion, :cia, :ejer,:cm_periodo,:cm_subdia,:cm_fcierre,:cm_usrcrea,:cm_feccrea,:cm_hracrea,:cm_usract"
			+ ",:cm_fecractu,:cm_hractu)}"
			, nativeQuery=true)
	List<lcoCiem> listar(
		@Param("opcion") int opcion,@Param("cia") String cia,@Param("ejer") String ejer,@Param("cm_periodo") String cm_periodo,@Param("cm_subdia") String cm_subdia,
		@Param("cm_fcierre") String cm_fcierre,@Param("cm_usrcrea") String cm_usrcrea,@Param("cm_feccrea") LocalDate cm_feccrea,
		@Param("cm_hracrea") LocalTime cm_hracrea,@Param("cm_usract") String cm_usract,@Param("cm_fecractu") LocalDate cm_fecractu,
		@Param("cm_hractu") LocalTime cm_hractu
			);
	
	
	@Query(value="{call SP_CrudlcoCiem( :opcion, :cia, :ejer,:cm_periodo,:cm_subdia,:cm_fcierre,:cm_usrcrea,:cm_feccrea,:cm_hracrea,:cm_usract"
			+ ",:cm_fecractu,:cm_hractu)}"
			, nativeQuery=true)
	@Modifying
	@Transactional
	void transaccion(
			@Param("opcion") int opcion,@Param("cia") String cia,@Param("ejer") String ejer,@Param("cm_periodo") String cm_periodo,@Param("cm_subdia") String cm_subdia,
			@Param("cm_fcierre") String cm_fcierre,@Param("cm_usrcrea") String cm_usrcrea,@Param("cm_feccrea") LocalDate cm_feccrea,
			@Param("cm_hracrea") LocalTime cm_hracrea,@Param("cm_usract") String cm_usract,@Param("cm_fecractu") LocalDate cm_fecractu,
			@Param("cm_hractu") LocalTime cm_hractu
			);
	
	
	@Query(value="{call SP_CrudlcoCiem( :opcion, :cia, :ejer,:cm_periodo,:cm_subdia,:cm_fcierre,:cm_usrcrea,:cm_feccrea,:cm_hracrea,:cm_usract"
			+ ",:cm_fecractu,:cm_hractu)}"
			, nativeQuery=true)
	List<Object> listarGrilla(
			@Param("opcion") int opcion,@Param("cia") String cia,@Param("ejer") String ejer,@Param("cm_periodo") String cm_periodo,@Param("cm_subdia") String cm_subdia,
			@Param("cm_fcierre") String cm_fcierre,@Param("cm_usrcrea") String cm_usrcrea,@Param("cm_feccrea") LocalDate cm_feccrea,
			@Param("cm_hracrea") LocalTime cm_hracrea,@Param("cm_usract") String cm_usract,@Param("cm_fecractu") LocalDate cm_fecractu,
			@Param("cm_hractu") LocalTime cm_hractu
			);
}
