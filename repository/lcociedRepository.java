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
import com.empresa.entity.lcocied;
import com.empresa.entity.lcociedPk;

public interface lcociedRepository extends JpaRepository<lcocied, lcociedPk>{
	
	@Query(value="{call SP_CRUD_lcocied(:opcion, :p_ciacont, :dl_asien, :dl_secue, :dl_tipope,:dl_ctasal,:dl_ctatra, "
			+ ":dl_usrcrea, :dl_feccrea, :dl_hracrea, :dl_usract,:dl_fecact,:dl_hraact)}"
			, nativeQuery = true)
	@Transactional
	List<Map<String,Object[]>> listByDetAndCab(
							  @Param("opcion") int option,
							  @Param("p_ciacont") String p_ciacont,
							  
							  @Param("dl_asien") String dl_asien,
							  @Param("dl_secue") String dl_secue,
							  @Param("dl_tipope") String dl_tipope,
							  @Param("dl_ctasal") String  dl_ctasal,
							  @Param("dl_ctatra") String dl_ctatra,
							  
							  @Param("dl_usrcrea") String dl_usrcrea,
							  @Param("dl_feccrea") LocalDate dl_feccrea,
							  @Param("dl_hracrea") LocalTime dl_hracrea,
							  @Param("dl_usract") String dl_usract,
							  @Param("dl_fecact") LocalDate dl_fecact,
							  @Param("dl_hraact") LocalTime dl_hraact);

	@Query(value="{call SP_CRUD_lcocied(:opcion, :p_ciacont, :dl_asien, :dl_secue, :dl_tipope,:dl_ctasal,:dl_ctatra, "
			+ ":dl_usrcrea, :dl_feccrea, :dl_hracrea, :dl_usract,:dl_fecact,:dl_hraact)}"
			, nativeQuery = true)
	@Transactional
	List<lcocied> listByDetalle(
							  @Param("opcion") int option,
							  @Param("p_ciacont") String p_ciacont,
							  
							  @Param("dl_asien") String dl_asien,
							  @Param("dl_secue") String dl_secue,
							  @Param("dl_tipope") String dl_tipope,
							  @Param("dl_ctasal") String  dl_ctasal,
							  @Param("dl_ctatra") String dl_ctatra,
							  
							  @Param("dl_usrcrea") String dl_usrcrea,
							  @Param("dl_feccrea") LocalDate dl_feccrea,
							  @Param("dl_hracrea") LocalTime dl_hracrea,
							  @Param("dl_usract") String dl_usract,
							  @Param("dl_fecact") LocalDate dl_fecact,
							  @Param("dl_hraact") LocalTime dl_hraact);

	
	@Query(value="{call SP_CRUD_lcocied(:opcion, :p_ciacont, :dl_asien, :dl_secue, :dl_tipope,:dl_ctasal,:dl_ctatra, "
			+ ":dl_usrcrea, :dl_feccrea, :dl_hracrea, :dl_usract,:dl_fecact,:dl_hraact)}"
			, nativeQuery = true)
		@Transactional
		@Modifying
		void nuevoRegistro(
				 @Param("opcion") int option,
				  @Param("p_ciacont") String p_ciacont,
				  
				  @Param("dl_asien") String dl_asien,
				  @Param("dl_secue") String dl_secue,
				  @Param("dl_tipope") String dl_tipope,
				  @Param("dl_ctasal") String  dl_ctasal,
				  @Param("dl_ctatra") String dl_ctatra,
				  
				  @Param("dl_usrcrea") String dl_usrcrea,
				  @Param("dl_feccrea") LocalDate dl_feccrea,
				  @Param("dl_hracrea") LocalTime dl_hracrea,
				  @Param("dl_usract") String dl_usract,
				  @Param("dl_fecact") LocalDate dl_fecact,
				  @Param("dl_hraact") LocalTime dl_hraact);

	@Query(value="{call SP_CRUD_lcocied(:opcion, :p_ciacont, :dl_asien, :dl_secue, :dl_tipope,:dl_ctasal,:dl_ctatra, "
			+ ":dl_usrcrea, :dl_feccrea, :dl_hracrea, :dl_usract,:dl_fecact,:dl_hraact)}"
			, nativeQuery = true)
		@Transactional
		@Modifying
		void actualizaRegistro( 
				@Param("opcion") int option,
				  @Param("p_ciacont") String p_ciacont,
				  
				  @Param("dl_asien") String dl_asien,
				  @Param("dl_secue") String dl_secue,
				  @Param("dl_tipope") String dl_tipope,
				  @Param("dl_ctasal") String  dl_ctasal,
				  @Param("dl_ctatra") String dl_ctatra,
				  
				  @Param("dl_usrcrea") String dl_usrcrea,
				  @Param("dl_feccrea") LocalDate dl_feccrea,
				  @Param("dl_hracrea") LocalTime dl_hracrea,
				  @Param("dl_usract") String dl_usract,
				  @Param("dl_fecact") LocalDate dl_fecact,
				  @Param("dl_hraact") LocalTime dl_hraact);

	@Query(value="{call SP_CRUD_lcocied(:opcion, :p_ciacont, :dl_asien, :dl_secue, :dl_tipope,:dl_ctasal,:dl_ctatra, "
			+ ":dl_usrcrea, :dl_feccrea, :dl_hracrea, :dl_usract,:dl_fecact,:dl_hraact)}"
			, nativeQuery = true)
		@Transactional
		@Modifying
		void eliminarRegistro(
				 @Param("opcion") int option,
				  @Param("p_ciacont") String p_ciacont,
				  
				  @Param("dl_asien") String dl_asien,
				  @Param("dl_secue") String dl_secue,
				  @Param("dl_tipope") String dl_tipope,
				  @Param("dl_ctasal") String  dl_ctasal,
				  @Param("dl_ctatra") String dl_ctatra,
				  
				  @Param("dl_usrcrea") String dl_usrcrea,
				  @Param("dl_feccrea") LocalDate dl_feccrea,
				  @Param("dl_hracrea") LocalTime dl_hracrea,
				  @Param("dl_usract") String dl_usract,
				  @Param("dl_fecact") LocalDate dl_fecact,
				  @Param("dl_hraact") LocalTime dl_hraact);
		
}
