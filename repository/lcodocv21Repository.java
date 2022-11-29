package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.empresa.entity.lcodocv21;
import com.empresa.entity.lcodocv21Pk;

public interface lcodocv21Repository extends JpaRepository<lcodocv21, lcodocv21Pk> {
	

		@Query(value="{call SP_CRUD_lcodocv21(:opcion, :p_ciacont,:ejercicio,:il_subdia, :il_compro, :il_secue,:il_tipo, :il_descri,:il_archivo,:il_imagen, "
				+ ":il_usrcrea, :il_fecCrea, :il_hracrea, :il_usract,:il_fecact,:il_hraact)}"
				, nativeQuery = true)
		
		List<lcodocv21> swListaCabAsiento(
								  @Param("opcion") int option,
								  @Param("p_ciacont") String p_ciacont,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("il_subdia") String il_subdia,
								  @Param("il_compro") String il_compro,
								  @Param("il_secue") String il_secue,
								  @Param("il_tipo") String  il_tipo,
								  @Param("il_descri") String il_descri,
								  @Param("il_archivo") String il_archivo,
								  @Param("il_imagen") String il_imagen,
								  @Param("il_usrcrea") String il_usrcrea,
								  @Param("il_fecCrea") LocalDate il_fecCrea,
								  @Param("il_hracrea") LocalTime il_hracrea,
								  @Param("il_usract") String  il_usract,
								  @Param("il_fecact") LocalDate il_fecact,
								 @Param("il_hraact") LocalTime il_hraact);
		
		
		
		
		@Query(value="{call SP_CRUD_lcodocv21(:opcion, :p_ciacont,:ejercicio,:il_subdia, :il_compro, :il_secue,:il_tipo, :il_descri,:il_archivo,:il_imagen, "
				+ ":il_usrcrea, :il_fecCrea, :il_hracrea, :il_usract,:il_fecact,:il_hraact)}"
				, nativeQuery = true)
		
		List<Object[]> swObtUltSecDocV(
								  @Param("opcion") int option,
								  @Param("p_ciacont") String p_ciacont,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("il_subdia") String il_subdia,
								  @Param("il_compro") String il_compro,
								  @Param("il_secue") String il_secue,
								  @Param("il_tipo") String  il_tipo,
								  @Param("il_descri") String il_descri,
								  @Param("il_archivo") String il_archivo,
								  @Param("il_imagen") String il_imagen,
								  @Param("il_usrcrea") String il_usrcrea,
								  @Param("il_fecCrea") LocalDate il_fecCrea,
								  @Param("il_hracrea") LocalTime il_hracrea,
								  @Param("il_usract") String  il_usract,
								  @Param("il_fecact") LocalDate il_fecact,
								 @Param("il_hraact") LocalTime il_hraact);

		
		//METODO QUE LLAMA AL PROCEDURE PARA CREAR LOS REGISTROS
			//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
			//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
			//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_CRUD_lcodocv21(:opcion, :p_ciacont,:ejercicio,:il_subdia, :il_compro, :il_secue,:il_tipo, :il_descri,:il_archivo,:il_imagen, "
				+ ":il_usrcrea, :il_fecCrea, :il_hracrea, :il_usract,:il_fecact,:il_hraact)}"
				, nativeQuery = true)
			@Transactional
			@Modifying
			void swCreaDocAsiento(
					@Param("opcion") int option,
					  @Param("p_ciacont") String p_ciacont,
					  @Param("ejercicio") String ejercicio,
					  
					  @Param("il_subdia") String il_subdia,
					  @Param("il_compro") String il_compro,
					  @Param("il_secue") String il_secue,
					  @Param("il_tipo") String  il_tipo,
					  @Param("il_descri") String il_descri,
					  @Param("il_archivo") String il_archivo,
					  @Param("il_imagen") String il_imagen,
					  @Param("il_usrcrea") String il_usrcrea,
					  @Param("il_fecCrea") LocalDate il_fecCrea,
					  @Param("il_hracrea") LocalTime il_hracrea,
					  @Param("il_usract") String  il_usract,
					  @Param("il_fecact") LocalDate il_fecact,
					 @Param("il_hraact") LocalTime il_hraact);
			//METODO QUE LLAMA AL PROCEDURE PARA ACTUALIZAR LOS REGISTROS
			//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
			//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
			//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_CRUD_lcodocv21(:opcion, :p_ciacont,:ejercicio,:il_subdia, :il_compro, :il_secue,:il_tipo, :il_descri,:il_archivo,:il_imagen, "
				+ ":il_usrcrea, :il_fecCrea, :il_hracrea, :il_usract,:il_fecact,:il_hraact)}"
				, nativeQuery = true)
			@Transactional
			@Modifying
			void swActuaDocAsie(
					@Param("opcion") int option,
					  @Param("p_ciacont") String p_ciacont,
					  @Param("ejercicio") String ejercicio,
					  
					  @Param("il_subdia") String il_subdia,
					  @Param("il_compro") String il_compro,
					  @Param("il_secue") String il_secue,
					  @Param("il_tipo") String  il_tipo,
					  @Param("il_descri") String il_descri,
					  @Param("il_archivo") String il_archivo,
					  @Param("il_imagen") String il_imagen,
					  @Param("il_usrcrea") String il_usrcrea,
					  @Param("il_fecCrea") LocalDate il_fecCrea,
					  @Param("il_hracrea") LocalTime il_hracrea,
					  @Param("il_usract") String  il_usract,
					  @Param("il_fecact") LocalDate il_fecact,
					 @Param("il_hraact") LocalTime il_hraact);


			//METODO QUE LLAMA AL PROCEDURE PARA ELIMINAR UN REGISTRO
			//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
			//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
			//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_CRUD_lcodocv21(:opcion, :p_ciacont,:ejercicio,:il_subdia, :il_compro, :il_secue,:il_tipo, :il_descri,:il_archivo,:il_imagen, "
				+ ":il_usrcrea, :il_fecCrea, :il_hracrea, :il_usract,:il_fecact,:il_hraact)}"
				, nativeQuery = true)
			@Transactional
			@Modifying
			void swEliminarDocAsie(
					@Param("opcion") int option,
					  @Param("p_ciacont") String p_ciacont,
					  @Param("ejercicio") String ejercicio,
					  
					  @Param("il_subdia") String il_subdia,
					  @Param("il_compro") String il_compro,
					  @Param("il_secue") String il_secue,
					  @Param("il_tipo") String  il_tipo,
					  @Param("il_descri") String il_descri,
					  @Param("il_archivo") String il_archivo,
					  @Param("il_imagen") String il_imagen,
					  @Param("il_usrcrea") String il_usrcrea,
					  @Param("il_fecCrea") LocalDate il_fecCrea,
					  @Param("il_hracrea") LocalTime il_hracrea,
					  @Param("il_usract") String  il_usract,
					  @Param("il_fecact") LocalDate il_fecact,
					 @Param("il_hraact") LocalTime il_hraact);

		@Query(value="{call SP_ModificarAsientoTemp(:p_ciacont,:ejercicio,:il_subdia, :il_compro, :il_secue,:il_tipo, :il_descri,:il_archivo,:il_imagen, "
		+ ":il_usrcrea, :il_fecCrea, :il_hracrea, :il_usract,:il_fecact,:il_hraact)}"
				, nativeQuery = true)
			@Transactional
			@Modifying
			void modificarAsientos(
					  @Param("p_ciacont") String p_ciacont,
					  @Param("ejercicio") String ejercicio,
					  
					  @Param("il_subdia") String il_subdia,
					  @Param("il_compro") String il_compro,
					  @Param("il_secue") String il_secue,
					  @Param("il_tipo") String  il_tipo,
					  @Param("il_descri") String il_descri,
					  @Param("il_archivo") String il_archivo,
					  @Param("il_imagen") String il_imagen,
					  @Param("il_usrcrea") String il_usrcrea,
					  @Param("il_fecCrea") LocalDate il_fecCrea,
					  @Param("il_hracrea") LocalTime il_hracrea,
					  @Param("il_usract") String  il_usract,
					  @Param("il_fecact") LocalDate il_fecact,
					 @Param("il_hraact") LocalTime il_hraact
			);



}
