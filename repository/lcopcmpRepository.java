package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcopcmp;
import com.empresa.entity.lcopcmpPk;


public interface lcopcmpRepository extends JpaRepository<lcopcmp, lcopcmpPk> {

	@Query(value="{call SP_CrudLcoPcmp(:opcion, :p_ciacont, :cl_tipcmp, :cl_parcmp, :cl_itmp1,:cl_itmp2,:cl_itmp3,:cl_itmp4,:cl_itmp5,:cl_itmp6,:cl_itmp7,"
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
	List<lcopcmp> listAll(
							  @Param("opcion") int opcion,
							  @Param("p_ciacont") String p_ciacont,
							  @Param("cl_tipcmp") String cl_tipcmp,
							  @Param("cl_parcmp") String cl_parcmp,
							  @Param("cl_itmp1") String cl_itmp1,
							  @Param("cl_itmp2") String cl_itmp2,
							  @Param("cl_itmp3") String cl_itmp3,
							  @Param("cl_itmp4") String cl_itmp4,
							  @Param("cl_itmp5") String cl_itmp5,
							  @Param("cl_itmp6") String cl_itmp6, 
							  @Param("cl_itmp7") String cl_itmp7,
							  @Param("cl_usrcrea") String cl_usrcrea,
							  @Param("cl_feccrea") LocalDate cl_feccrea,
							  @Param("cl_hracrea") LocalTime cl_hracrea,
							  @Param("cl_usract") String cl_usract,
							  @Param("cl_fecact") LocalDate cl_fecact,
							  @Param("cl_hraact") LocalTime cl_hraact);
							  

	@Query(value="{call SP_CrudLcoPcmp(:opcion, :p_ciacont, :cl_tipcmp, :cl_parcmp, :cl_itmp1,:cl_itmp2,:cl_itmp3,:cl_itmp4,:cl_itmp5,:cl_itmp6,:cl_itmp7,"
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
	List<lcopcmp> listCom(
							  @Param("opcion") int opcion,
							  @Param("p_ciacont") String p_ciacont,
							  
							  @Param("cl_tipcmp") String cl_tipcmp,
							  @Param("cl_parcmp") String cl_parcmp,
							  @Param("cl_itmp1") String cl_itmp1,
							  @Param("cl_itmp2") String cl_itmp2,
							  @Param("cl_itmp3") String cl_itmp3,
							  @Param("cl_itmp4") String cl_itmp4,
							  @Param("cl_itmp5") String cl_itmp5,
							  @Param("cl_itmp6") String cl_itmp6, 
							  @Param("cl_itmp7") String cl_itmp7,
							  @Param("cl_usrcrea") String cl_usrcrea,
							  @Param("cl_feccrea") LocalDate cl_feccrea,
							  @Param("cl_hracrea") LocalTime cl_hracrea,
							  @Param("cl_usract") String cl_usract,
							  @Param("cl_fecact") LocalDate cl_fecact,
							  @Param("cl_hraact") LocalTime cl_hraact);
	

							  		

	@Query(value="{call SP_CrudLcoPcmp(:opcion, :p_ciacont, :cl_tipcmp, :cl_parcmp, :cl_itmp1,:cl_itmp2,:cl_itmp3,"
			+ ":cl_itmp4,:cl_itmp5,:cl_itmp6,:cl_itmp7,"
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
	
		@Transactional
		@Modifying
		void nuevoRegistro(
				 @Param("opcion") int opcion,
				 @Param("p_ciacont") String p_ciacont,
				  
				  @Param("cl_tipcmp") String cl_tipcmp,
				  @Param("cl_parcmp") String cl_parcmp,
				  @Param("cl_itmp1") String cl_itmp1,
				  @Param("cl_itmp2") String cl_itmp2,
				  @Param("cl_itmp3") String cl_itmp3,
				  @Param("cl_itmp4") String cl_itmp4,
				  @Param("cl_itmp5") String cl_itmp5,
				  @Param("cl_itmp6") String cl_itmp6, 
				  @Param("cl_itmp7") String cl_itmp7,
				  
				  
				  
			
				  @Param("cl_usrcrea") String cl_usrcrea,
				  @Param("cl_feccrea") LocalDate cl_feccrea,
				  @Param("cl_hracrea") LocalTime cl_hracrea,
				  @Param("cl_usract") String cl_usract,
				  @Param("cl_fecact") LocalDate cl_fecact,
				  @Param("cl_hraact") LocalTime cl_hraact);
				  
	
	@Query(value="{call SP_CrudLcoPcmp(:opcion, :p_ciacont, :cl_tipcmp, :cl_parcmp, :cl_itmp1,:cl_itmp2,:cl_itmp3,"
			+ ":cl_itmp4,:cl_itmp5,:cl_itmp6,:cl_itmp7,"
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
		@Transactional
		@Modifying
		void actualizaRegistro( 
				 @Param("opcion") int opcion,
				 @Param("p_ciacont") String p_ciacont,
				  
				  @Param("cl_tipcmp") String cl_tipcmp,
				  @Param("cl_parcmp") String cl_parcmp,
				  @Param("cl_itmp1") String cl_itmp1,
				  @Param("cl_itmp2") String cl_itmp2,
				  @Param("cl_itmp3") String cl_itmp3,
				  @Param("cl_itmp4") String cl_itmp4,
				  @Param("cl_itmp5") String cl_itmp5,
				  @Param("cl_itmp6") String cl_itmp6, 
				  @Param("cl_itmp7") String cl_itmp7,
			
				  @Param("cl_usrcrea") String cl_usrcrea,
				  @Param("cl_feccrea") LocalDate cl_feccrea,
				  @Param("cl_hracrea") LocalTime cl_hracrea,
				  @Param("cl_usract") String cl_usract,
				  @Param("cl_fecact") LocalDate cl_fecact,
				  @Param("cl_hraact") LocalTime cl_hraact);
				  
	
	@Query(value="{call SP_CrudLcoPcmp(:opcion, :p_ciacont, :cl_tipcmp, :cl_parcmp, :cl_itmp1,:cl_itmp2,:cl_itmp3,"
			+ ":cl_itmp4,:cl_itmp5,:cl_itmp6,:cl_itmp7,"
			+ ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
			, nativeQuery = true)
		@Transactional
		@Modifying
		void eliminarRegistro(
				 @Param("opcion") int opcion,
				 @Param("p_ciacont") String p_ciacont,
				  
				  @Param("cl_tipcmp") String cl_tipcmp,
				  @Param("cl_parcmp") String cl_parcmp,
				  @Param("cl_itmp1") String cl_itmp1,
				  @Param("cl_itmp2") String cl_itmp2,
				  @Param("cl_itmp3") String cl_itmp3,
				  @Param("cl_itmp4") String cl_itmp4,
				  @Param("cl_itmp5") String cl_itmp5,
				  @Param("cl_itmp6") String cl_itmp6, 
				  @Param("cl_itmp7") String cl_itmp7,
				  
				  
				  
			
				  @Param("cl_usrcrea") String cl_usrcrea,
				  @Param("cl_feccrea") LocalDate cl_feccrea,
				  @Param("cl_hracrea") LocalTime cl_hracrea,
				  @Param("cl_usract") String cl_usract,
				  @Param("cl_fecact") LocalDate cl_fecact,
				  @Param("cl_hraact") LocalTime cl_hraact);
				  
	
	@Query(value="{call SP_CRUD_lote(:opcion, :p_ciacont, :ejer, :lote)}"
			, nativeQuery = true)
	List<Map<String, Object>> ListarLote(
				@Param("opcion") String opcion,
				@Param("p_ciacont") String p_ciacont,
				@Param("ejer") String ejer,
				@Param("lote") String lote
			);
	
	
	
	@Query(value="{call SP_CRUD_lote(:opcion, :p_ciacont, :ejer, :lote)}"
			, nativeQuery = true)
	
		@Transactional
		@Modifying
		void agregarLote(
				  @Param("opcion") String opcion,
				  @Param("p_ciacont") String p_ciacont,
				  @Param("ejer") String ejer,
				  @Param("lote") String lote);	
	
	@Query(value="{call SP_CRUD_lote(:opcion, :p_ciacont, :ejer, :lote)}"
			, nativeQuery = true)
	
		@Transactional
		@Modifying
		void actualizarLote(
				  @Param("opcion") String opcion,
				  @Param("p_ciacont") String p_ciacont,
				  @Param("ejer") String ejer,
				  @Param("lote") String lote);	


				  @Query(value="{call SP_CrudLcoPcmp(:opcion, :p_ciacont, :cl_tipcmp, :cl_parcmp, :cl_itmp1,:cl_itmp2,:cl_itmp3,:cl_itmp4,:cl_itmp5,:cl_itmp6,:cl_itmp7,"
				  + ":cl_usrcrea, :cl_feccrea, :cl_hracrea, :cl_usract,:cl_fecact,:cl_hraact)}"
				  , nativeQuery = true)
				  List<Map<String, Object>> listComTipo(
			@Param("opcion") int opcion,
			@Param("p_ciacont") String p_ciacont,
			
			@Param("cl_tipcmp") String cl_tipcmp,
			@Param("cl_parcmp") String cl_parcmp,
			@Param("cl_itmp1") String cl_itmp1,
			@Param("cl_itmp2") String cl_itmp2,
			@Param("cl_itmp3") String cl_itmp3,
			@Param("cl_itmp4") String cl_itmp4,
			@Param("cl_itmp5") String cl_itmp5,
			@Param("cl_itmp6") String cl_itmp6, 
			@Param("cl_itmp7") String cl_itmp7,
			@Param("cl_usrcrea") String cl_usrcrea,
			@Param("cl_feccrea") LocalDate cl_feccrea,
			@Param("cl_hracrea") LocalTime cl_hracrea,
			@Param("cl_usract") String cl_usract,
			@Param("cl_fecact") LocalDate cl_fecact,
			@Param("cl_hraact") LocalTime cl_hraact);


	@Query(value="{call SP_CRUD_lcopcmpxml(:opcion, :cia, :cl_tipo, :cl_tipcmp, :cl_parcmp, :cl_itmp1, :cl_itmp2, :cl_itmp3, :cl_itmp4, :mnd)}", nativeQuery = true)
		List<lcopcmp> swListarPrmCmpXml(
					@Param("opcion") int opcion,
					@Param("cia") String cia,
					@Param("cl_tipo") String cl_tipo,
					@Param("cl_tipcmp") String cl_tipcmp,
					@Param("cl_parcmp") String cl_parcmp,
					@Param("cl_itmp1") String cl_itmp1,
					@Param("cl_itmp2") String cl_itmp2,
					@Param("cl_itmp3") String cl_itmp3,
					@Param("cl_itmp4") String cl_itmp4,
					@Param("mnd") String mnd);

	@Query(value="{call SP_CRUD_lcopcmpxml(:opcion, :cia, :cl_tipo, :cl_tipcmp, :cl_parcmp, :cl_itmp1, :cl_itmp2, :cl_itmp3, :cl_itmp4, :mnd)}", nativeQuery = true)
		List<Map<String, Object>> swListarPrmCmpCtaMnd(
					@Param("opcion") int opcion,
					@Param("cia") String cia, 
					@Param("cl_tipo") String cl_tipo,
					@Param("cl_tipcmp") String cl_tipcmp,
					@Param("cl_parcmp") String cl_parcmp,
					@Param("cl_itmp1") String cl_itmp1,
					@Param("cl_itmp2") String cl_itmp2,
					@Param("cl_itmp3") String cl_itmp3,
					@Param("cl_itmp4") String cl_itmp4,
					@Param("mnd") String mnd);
			

	@Query(value="{call SP_CRUD_lcopcmpxml(:opcion, :cia, :cl_tipo, :cl_tipcmp, :cl_parcmp, :cl_itmp1, :cl_itmp2, :cl_itmp3, :cl_itmp4, :mnd)}", nativeQuery = true)
		List<Map<String, Object>> swURegPrmCmpXML(
					@Param("opcion") int opcion,
					@Param("cia") String cia, 
					@Param("cl_tipo") String cl_tipo,
					@Param("cl_tipcmp") String cl_tipcmp,
					@Param("cl_parcmp") String cl_parcmp,
					@Param("cl_itmp1") String cl_itmp1,
					@Param("cl_itmp2") String cl_itmp2,
					@Param("cl_itmp3") String cl_itmp3,
					@Param("cl_itmp4") String cl_itmp4,
					@Param("mnd") String mnd);


	@Query(value="{call SP_CRUD_lcopcmpxml(:opcion, :cia, :cl_tipo, :cl_tipcmp, :cl_parcmp, :cl_itmp1, :cl_itmp2, :cl_itmp3, :cl_itmp4, :mnd)}", nativeQuery = true)
		List<Map<String, Object>> swPrmCmpVarXml(
					@Param("opcion") int opcion,
					@Param("cia") String cia, 
					@Param("cl_tipo") String cl_tipo,
					@Param("cl_tipcmp") String cl_tipcmp,
					@Param("cl_parcmp") String cl_parcmp,
					@Param("cl_itmp1") String cl_itmp1,
					@Param("cl_itmp2") String cl_itmp2,
					@Param("cl_itmp3") String cl_itmp3,
					@Param("cl_itmp4") String cl_itmp4,
					@Param("mnd") String mnd);
				
}
