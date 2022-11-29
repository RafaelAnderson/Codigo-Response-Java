package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcociec;

public interface lcociecRepository extends JpaRepository<lcociec, String>{
	
	
	@Query(value="{call SP_CRUD_lcociec(:opcion, :p_ciacont, :cl_asien, :cl_descr, :cl_cmpr, "
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
	
	List<lcociec> EliminarCabeDeta(
							  @Param("opcion") int opcion,
							  @Param("p_ciacont") String p_ciacont,
							  
							  @Param("cl_asien") String cl_asien,
							  @Param("cl_descr") String cl_descr,
							  @Param("cl_cmpr") String cl_cmpr,
						
							  @Param("cl_usrcrea") String cl_usrcrea,
							  @Param("cl_feccrea") LocalDate cl_feccrea,
							  @Param("cl_hracrea") LocalTime cl_hracrea,
							  @Param("cl_usract") String cl_usract,
							  @Param("cl_fecact") LocalDate cl_fecact,
							  @Param("cl_hraact") LocalTime cl_hraact);

	
	
	
	@Query(value="{call SP_CRUD_lcociec(:opcion, :p_ciacont, :cl_asien, :cl_descr, :cl_cmpr, "
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
	
	List<lcociec> listAll(
							  @Param("opcion") int opcion,
							  @Param("p_ciacont") String p_ciacont,
							  
							  @Param("cl_asien") String cl_asien,
							  @Param("cl_descr") String cl_descr,
							  @Param("cl_cmpr") String cl_cmpr,
						
							  @Param("cl_usrcrea") String cl_usrcrea,
							  @Param("cl_feccrea") LocalDate cl_feccrea,
							  @Param("cl_hracrea") LocalTime cl_hracrea,
							  @Param("cl_usract") String cl_usract,
							  @Param("cl_fecact") LocalDate cl_fecact,
							  @Param("cl_hraact") LocalTime cl_hraact);

	
	
	@Query(value="{call SP_CRUD_lcociec(:opcion, :p_ciacont, :cl_asien, :cl_descr, :cl_cmpr, "
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
		@Transactional
		@Modifying
		void nuevoRegistro(
				@Param("opcion") int opcion,
				  @Param("p_ciacont") String p_ciacont,
				  
				  @Param("cl_asien") String cl_asien,
				  @Param("cl_descr") String cl_descr,
				  @Param("cl_cmpr") String cl_cmpr,
			
				  @Param("cl_usrcrea") String cl_usrcrea,
				  @Param("cl_feccrea") LocalDate cl_feccrea,
				  @Param("cl_hracrea") LocalTime cl_hracrea,
				  @Param("cl_usract") String cl_usract,
				  @Param("cl_fecact") LocalDate cl_fecact,
				  @Param("cl_hraact") LocalTime cl_hraact);
	
	@Query(value="{call SP_CRUD_lcociec(:opcion, :p_ciacont, :cl_asien, :cl_descr, :cl_cmpr, "
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
		@Transactional
		@Modifying
		void actualizaRegistro( 
				@Param("opcion") int opcion,
				  @Param("p_ciacont") String p_ciacont,
				  
				  @Param("cl_asien") String cl_asien,
				  @Param("cl_descr") String cl_descr,
				  @Param("cl_cmpr") String cl_cmpr,
			
				  @Param("cl_usrcrea") String cl_usrcrea,
				  @Param("cl_feccrea") LocalDate cl_feccrea,
				  @Param("cl_hracrea") LocalTime cl_hracrea,
				  @Param("cl_usract") String cl_usract,
				  @Param("cl_fecact") LocalDate cl_fecact,
				  @Param("cl_hraact") LocalTime cl_hraact);


		
	@Query(value="{call SP_CRUD_lcociec(:opcion, :p_ciacont, :cl_asien, :cl_descr, :cl_cmpr, "
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true) 
		@Transactional
		@Modifying
		void eliminarRegistro(
				@Param("opcion") int opcion,
				  @Param("p_ciacont") String p_ciacont,
				  
				  @Param("cl_asien") String cl_asien,
				  @Param("cl_descr") String cl_descr,
				  @Param("cl_cmpr") String cl_cmpr,
			
				  @Param("cl_usrcrea") String cl_usrcrea,
				  @Param("cl_feccrea") LocalDate cl_feccrea,
				  @Param("cl_hracrea") LocalTime cl_hracrea,
				  @Param("cl_usract") String cl_usract,
				  @Param("cl_fecact") LocalDate cl_fecact,
				  @Param("cl_hraact") LocalTime cl_hraact);

}
