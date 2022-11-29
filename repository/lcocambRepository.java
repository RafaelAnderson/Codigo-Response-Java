package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcocamb;
import com.empresa.entity.lcocambPk;

public interface lcocambRepository extends JpaRepository<lcocamb, lcocambPk>{
	
	
	//METODO QUE LLAMA AL PROCEDURE PARA LISTAR LOS REGISTROS
		//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
		//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
		//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_Crud_camb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
				+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact)}"
				, nativeQuery = true)
		
		List<lcocamb> listAll(
								  @Param("opcion") int option,
								  @Param("cl_tipmon") String cl_tipmon,
								  @Param("cl_fectcamb") LocalDate cl_fectcamb,
								  @Param("cl_tipcmpx") Double cl_tipcmpx,
								  @Param("cl_tipcmpn") Double cl_tipcmpn,
								  @Param("cl_tipvtax") Double cl_tipvtax,
								  @Param("cl_tipvtan") Double cl_tipvtan,
								  @Param("cl_usrcrea") String  cl_usrcrea,
								  @Param("cl_feccrea") LocalDate cl_feccrea,
								  @Param("cl_hracrea") LocalTime cl_hracrea,
								  @Param("cl_usract") String  cl_usract,
								  @Param("cl_fecact") LocalDate cl_fecact,
								  @Param("cl_hraact") LocalTime cl_hraact);

		
		//METODO QUE LLAMA AL PROCEDURE PARA CREAR LOS REGISTROS
			//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
			//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
			//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_Crud_camb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
				+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact)}"
				, nativeQuery = true)
			@Transactional
			@Modifying
			void nuevoRegistro(@Param("opcion") int option,
					
					  @Param("cl_tipmon") String cl_tipmon,
					  @Param("cl_fectcamb") LocalDate cl_fectcamb,
					  @Param("cl_tipcmpx") Double cl_tipcmpx,
					  @Param("cl_tipcmpn") Double cl_tipcmpn,
					  @Param("cl_tipvtax") Double cl_tipvtax,
					  @Param("cl_tipvtan") Double cl_tipvtan,
					  @Param("cl_usrcrea") String  cl_usrcrea,
					  @Param("cl_feccrea") LocalDate cl_feccrea,
					  @Param("cl_hracrea") LocalTime cl_hracrea,
					  @Param("cl_usract") String  cl_usract,
					  @Param("cl_fecact") LocalDate cl_fecact,
					  @Param("cl_hraact") LocalTime cl_hraact);
			//METODO QUE LLAMA AL PROCEDURE PARA ACTUALIZAR LOS REGISTROS
			//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
			//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
			//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_Crud_camb(:opcion,:cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
				+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact)}"
				, nativeQuery = true)
			@Transactional
			@Modifying
			void actualizaRegistro(@Param("opcion") int option,
					
					  @Param("cl_tipmon") String cl_tipmon,
					  @Param("cl_fectcamb") LocalDate cl_fectcamb,
					  @Param("cl_tipcmpx") Double cl_tipcmpx,
					  @Param("cl_tipcmpn") Double cl_tipcmpn,
					  @Param("cl_tipvtax") Double cl_tipvtax,
					  @Param("cl_tipvtan") Double cl_tipvtan,
					  @Param("cl_usrcrea") String  cl_usrcrea,
					  @Param("cl_feccrea") LocalDate cl_feccrea,
					  @Param("cl_hracrea") LocalTime cl_hracrea,
					  @Param("cl_usract") String  cl_usract,
					  @Param("cl_fecact") LocalDate cl_fecact,
					  @Param("cl_hraact") LocalTime cl_hraact);


			//METODO QUE LLAMA AL PROCEDURE PARA ELIMINAR UN REGISTRO
			//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
			//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
			//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_Crud_camb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
				+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact)}"
				, nativeQuery = true)
			@Transactional
			@Modifying
			void eliminaRegistro(@Param("opcion") int option,
					  @Param("cl_tipmon") String cl_tipmon,
					  @Param("cl_fectcamb") LocalDate cl_fectcamb,
					  @Param("cl_tipcmpx") Double cl_tipcmpx,
					  @Param("cl_tipcmpn") Double cl_tipcmpn,
					  @Param("cl_tipvtax") Double cl_tipvtax,
					  @Param("cl_tipvtan") Double cl_tipvtan,
					  @Param("cl_usrcrea") String  cl_usrcrea,
					  @Param("cl_feccrea") LocalDate cl_feccrea,
					  @Param("cl_hracrea") LocalTime cl_hracrea,
					  @Param("cl_usract") String  cl_usract,
					  @Param("cl_fecact") LocalDate cl_fecact,
					  @Param("cl_hraact") LocalTime cl_hraact);
			
			//METODO QUE LLAMA AL PROCEDURE PARA LISTAR REGISTROS ESPECIFICOS
			//EL PRIMER PARAMETRO QUE SE ENVIA ES LA OPCION DE QUE CONSULTA QUIERE REALIZAR
			//EL SEGUNDO PARAMETRO QUE ES ENVIA ES EL P_CIACONT
			//LUEGO SE ENVIA EL OBJETO COMPLETO, CAMPO POR CAMPO
		@Query(value="{call SP_Crud_camb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
				+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact)}"
				, nativeQuery = true)
			List<lcocamb> listaUno(@Param("opcion") int option,
					
					  @Param("cl_tipmon") String cl_tipmon,
					  @Param("cl_fectcamb") LocalDate cl_fectcamb,
					  @Param("cl_tipcmpx") Double cl_tipcmpx,
					  @Param("cl_tipcmpn") Double cl_tipcmpn,
					  @Param("cl_tipvtax") Double cl_tipvtax,
					  @Param("cl_tipvtan") Double cl_tipvtan,
					  @Param("cl_usrcrea") String  cl_usrcrea,
					  @Param("cl_feccrea") LocalDate cl_feccrea,
					  @Param("cl_hracrea") LocalTime cl_hracrea,
					  @Param("cl_usract") String  cl_usract,
					  @Param("cl_fecact") LocalDate cl_fecact,
					  @Param("cl_hraact") LocalTime cl_hraact);

			@Query(value="SELECT * FROM lcocamb where  (year (cl_fectcamb) )=?1 and (month (cl_fectcamb) )=?2 and cl_tipmon=?3 ",nativeQuery = true)
			public List<lcocamb> getByYearMonth(int year, int month, String money);

			
	//=============================================================================================================================================		


	@Query(value="{call SP_crudTipoCambioNic_lcocamb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
				+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact,   :cl_tipcn21,:cl_tipvn21)}"
				, nativeQuery = true)
		
		List<lcocamb> swListarTcb(
								  @Param("opcion") int option,
								  @Param("cl_tipmon") String cl_tipmon,
								  @Param("cl_fectcamb") LocalDate cl_fectcamb,
								  @Param("cl_tipcmpx") Double cl_tipcmpx,
								  @Param("cl_tipcmpn") Double cl_tipcmpn,
								  @Param("cl_tipvtax") Double cl_tipvtax,
								  @Param("cl_tipvtan") Double cl_tipvtan,
								  @Param("cl_usrcrea") String  cl_usrcrea,
								  @Param("cl_feccrea") LocalDate cl_feccrea,
								  @Param("cl_hracrea") LocalTime cl_hracrea,
								  @Param("cl_usract") String  cl_usract,
								  @Param("cl_fecact") LocalDate cl_fecact,
								  @Param("cl_hraact") LocalTime cl_hraact,
								  
								  @Param("cl_tipcn21") Double cl_tipcn21,
								  @Param("cl_tipvn21") Double cl_tipvn21 );


	@Query(value="{call SP_crudTipoCambioNic_lcocamb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
	+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact,   :cl_tipcn21,:cl_tipvn21)}"
	, nativeQuery = true)
		@Transactional
		@Modifying
		void registrarTcb(
								@Param("opcion") int option,
								@Param("cl_tipmon") String cl_tipmon,
								@Param("cl_fectcamb") LocalDate cl_fectcamb,
								@Param("cl_tipcmpx") Double cl_tipcmpx,
								@Param("cl_tipcmpn") Double cl_tipcmpn,
								@Param("cl_tipvtax") Double cl_tipvtax,
								@Param("cl_tipvtan") Double cl_tipvtan,
								@Param("cl_usrcrea") String  cl_usrcrea,
								@Param("cl_feccrea") LocalDate cl_feccrea,
								@Param("cl_hracrea") LocalTime cl_hracrea,
								@Param("cl_usract") String  cl_usract,
								@Param("cl_fecact") LocalDate cl_fecact,
								@Param("cl_hraact") LocalTime cl_hraact,
								
								@Param("cl_tipcn21") Double cl_tipcn21,
								@Param("cl_tipvn21") Double cl_tipvn21 );	


	@Query(value="{call SP_crudTipoCambioNic_lcocamb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
	+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact,   :cl_tipcn21,:cl_tipvn21)}"
	, nativeQuery = true)
		@Transactional
		@Modifying
		void actualizarTcb(
								@Param("opcion") int option,
								@Param("cl_tipmon") String cl_tipmon,
								@Param("cl_fectcamb") LocalDate cl_fectcamb,
								@Param("cl_tipcmpx") Double cl_tipcmpx,
								@Param("cl_tipcmpn") Double cl_tipcmpn,
								@Param("cl_tipvtax") Double cl_tipvtax,
								@Param("cl_tipvtan") Double cl_tipvtan,
								@Param("cl_usrcrea") String  cl_usrcrea,
								@Param("cl_feccrea") LocalDate cl_feccrea,
								@Param("cl_hracrea") LocalTime cl_hracrea,
								@Param("cl_usract") String  cl_usract,
								@Param("cl_fecact") LocalDate cl_fecact,
								@Param("cl_hraact") LocalTime cl_hraact,
								
								@Param("cl_tipcn21") Double cl_tipcn21,
								@Param("cl_tipvn21") Double cl_tipvn21 );													


	@Query(value="{call SP_crudTipoCambioNic_lcocamb(:opcion, :cl_tipmon,:cl_fectcamb, :cl_tipcmpx, :cl_tipcmpn,:cl_tipvtax, "
	+ ":cl_tipvtan, :cl_usrcrea, :cl_feccrea, :cl_hracrea,:cl_usract,:cl_fecact, :cl_hraact,   :cl_tipcn21,:cl_tipvn21)}"
	, nativeQuery = true)
		@Transactional
		@Modifying
		void eliminarTcb(
								@Param("opcion") int option,
								@Param("cl_tipmon") String cl_tipmon,
								@Param("cl_fectcamb") LocalDate cl_fectcamb,
								@Param("cl_tipcmpx") Double cl_tipcmpx,
								@Param("cl_tipcmpn") Double cl_tipcmpn,
								@Param("cl_tipvtax") Double cl_tipvtax,
								@Param("cl_tipvtan") Double cl_tipvtan,
								@Param("cl_usrcrea") String  cl_usrcrea,
								@Param("cl_feccrea") LocalDate cl_feccrea,
								@Param("cl_hracrea") LocalTime cl_hracrea,
								@Param("cl_usract") String  cl_usract,
								@Param("cl_fecact") LocalDate cl_fecact,
								@Param("cl_hraact") LocalTime cl_hraact,
								
								@Param("cl_tipcn21") Double cl_tipcn21,
								@Param("cl_tipvn21") Double cl_tipvn21 );



	@Query(value="{call SP_crudTipoCambioNic_lcocamb(:opcion, :cl_tipmon,:cl_fectcamb,:cl_tipcn21,:cl_tipvn21)}"
			, nativeQuery = true)
	@Transactional
	@Modifying
	void actualizarTcbNic(
			@Param("opcion") int option,
			@Param("cl_tipmon") String cl_tipmon,
			@Param("cl_fectcamb") LocalDate cl_fectcamb,

			@Param("cl_tipcn21") Double cl_tipcn21,
			@Param("cl_tipvn21") Double cl_tipvn21 );

}
