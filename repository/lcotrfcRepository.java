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
import com.empresa.entity.lcotrfc;
import com.empresa.entity.lcotrfcPk;




public interface lcotrfcRepository extends JpaRepository<lcotrfc , lcotrfcPk>{

	//METODO QUE LLAMA AL PROCEDURE PARA LISTAR LOS REGISTROS
	//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
	//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
	//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
	@Query(value="{call SP_CRUD_lcontrfc(:opcion, :p_ciacont,:tl_cntcst, :tl_ctacar, :tl_ctaabo,:tl_factor, "
			+ ":tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract,:tl_fecact,:tl_hraact)}"
			, nativeQuery = true)
	
	List<Map<String, Object>> listAll(
							  @Param("opcion") int option,
							  @Param("p_ciacont") String p_ciacont,
							  @Param("tl_cntcst") String tl_cntcst,
							  @Param("tl_ctacar") String tl_codtabla,
							  @Param("tl_ctaabo") String tl_ctaabo,
							  @Param("tl_factor") Double tl_factor,
							  @Param("tl_usrcrea") String tl_usrcrea,
							  @Param("tl_feccrea") LocalDate tl_feccrea,
							  @Param("tl_hracrea") LocalTime tl_hracrea,
							  @Param("tl_usract") String tl_usract,
							  @Param("tl_fecact") LocalDate tl_fecact,
							  @Param("tl_hraact") LocalTime tl_hraact);

	
	//METODO QUE LLAMA AL PROCEDURE PARA CREAR LOS REGISTROS
		//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
		//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
		//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_CRUD_lcontrfc(:opcion, :p_ciacont,:tl_cntcst, :tl_ctacar, :tl_ctaabo,:tl_factor, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
				, nativeQuery = true)
		@Transactional
		@Modifying
		void nuevoRegistro(@Param("opcion") int option,
				  @Param("p_ciacont") String p_ciacont,
				  @Param("tl_cntcst") String tl_cntcst,
				  @Param("tl_ctacar") String tl_codtabla,
				  @Param("tl_ctaabo") String tl_ctaabo,
				  @Param("tl_factor") Double tl_factor,
				  @Param("tl_usrcrea") String tl_usrcrea,
				  @Param("tl_feccrea") LocalDate tl_feccrea,
				  @Param("tl_hracrea") LocalTime tl_hracrea,
				  @Param("tl_usract") String tl_usract,
				  @Param("tl_fecact") LocalDate tl_fecact,
				  @Param("tl_hraact") LocalTime tl_hraact);
		
		//METODO QUE LLAMA AL PROCEDURE PARA ACTUALIZAR LOS REGISTROS
		//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
		//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
		//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_CRUD_lcontrfc(:opcion, :p_ciacont,:tl_cntcst, :tl_ctacar, :tl_ctaabo,:tl_factor, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
				, nativeQuery = true)
		@Transactional
		@Modifying
		void actualizaRegistro(@Param("opcion") int option,
				  @Param("p_ciacont") String p_ciacont,
				  @Param("tl_cntcst") String tl_cntcst,
				  @Param("tl_ctacar") String tl_codtabla,
				  @Param("tl_ctaabo") String tl_ctaabo,
				  @Param("tl_factor") Double tl_factor,
				  @Param("tl_usrcrea") String tl_usrcrea,
				  @Param("tl_feccrea") LocalDate tl_feccrea,
				  @Param("tl_hracrea") LocalTime tl_hracrea,
				  @Param("tl_usract") String tl_usract,
				  @Param("tl_fecact") LocalDate tl_fecact,
				  @Param("tl_hraact") LocalTime tl_hraact);


		//METODO QUE LLAMA AL PROCEDURE PARA ELIMINAR UN REGISTRO
		//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
		//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
		//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_CRUD_lcontrfc(:opcion, :p_ciacont,:tl_cntcst, :tl_ctacar, :tl_ctaabo,:tl_factor, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
				, nativeQuery = true)
		@Transactional
		@Modifying
		void eliminaRegistro(@Param("opcion") int option,
				  @Param("p_ciacont") String p_ciacont,
				  @Param("tl_cntcst") String tl_cntcst,
				  @Param("tl_ctacar") String tl_codtabla,
				  @Param("tl_ctaabo") String tl_ctaabo,
				  @Param("tl_factor") Double tl_factor,
				  @Param("tl_usrcrea") String tl_usrcrea,
				  @Param("tl_feccrea") LocalDate tl_feccrea,
				  @Param("tl_hracrea") LocalTime tl_hracrea,
				  @Param("tl_usract") String tl_usract,
				  @Param("tl_fecact") LocalDate tl_fecact,
				  @Param("tl_hraact") LocalTime tl_hraact);
		
		//METODO QUE LLAMA AL PROCEDURE PARA LISTAR REGISTROS ESPECIFICOS
		//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
		//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
		//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_CRUD_lcontrfc(:opcion, :p_ciacont,:tl_cntcst, :tl_ctacar, :tl_ctaabo,:tl_factor, :tl_usrcrea, :tl_feccrea, :tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
				, nativeQuery = true)
		List<Object[]> listaUno(@Param("opcion") int option,
				  @Param("p_ciacont") String p_ciacont,
				  @Param("tl_cntcst") String tl_cntcst,
				  @Param("tl_ctacar") String tl_codtabla,
				  @Param("tl_ctaabo") String tl_ctaabo,
				  @Param("tl_factor") Double tl_factor,
				  @Param("tl_usrcrea") String tl_usrcrea,
				  @Param("tl_feccrea") LocalDate tl_feccrea,
				  @Param("tl_hracrea") LocalTime tl_hracrea,
				  @Param("tl_usract") String tl_usract,
				  @Param("tl_fecact") LocalDate tl_fecact,
				  @Param("tl_hraact") LocalTime tl_hraact);
}
