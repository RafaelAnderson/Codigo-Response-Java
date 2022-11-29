package com.empresa.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoTasa;
import com.empresa.entity.lcoTasaPk;

@Repository
public interface lcoTasaRepository extends JpaRepository<lcoTasa, lcoTasaPk> {
	
	@Query(value="{call SP_CrudLcoTasa(:opcion,:cia,:tl_tiptasa, :tl_codtasa, :tl_dsctasa, "
			+ ":tl_valref1,:tl_valref2, :tl_tasa, :tl_detcbi,:tl_detcob, :tl_flabas,"
			+ ":tl_usrcrea, :tl_feccrea,:tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
			, nativeQuery = true)
	List<lcoTasa> listar(	  @Param("opcion") int option,
							  @Param("cia") String cia,
							  @Param("tl_tiptasa") String tl_tiptasa,
			                  @Param("tl_codtasa") String tl_codtasa,
			                  @Param("tl_dsctasa") String tl_dsctasa,
			                  @Param("tl_valref1") Double tl_valref1,
			                  @Param("tl_valref2") Double tl_valref2,
			                  @Param("tl_tasa") Double tl_tasa,
			                  @Param("tl_detcbi") String tl_detcbi,
			                  @Param("tl_detcob") String tl_detcob,
			                  @Param("tl_flabas") String tl_flabas,
			                  @Param("tl_usrcrea") String tl_usrcrea,
			                  @Param("tl_feccrea") LocalDate tl_feccrea,
			                  @Param("tl_hracrea") LocalTime tl_hracrea,
			                  @Param("tl_usract") String tl_usract,
			                  @Param("tl_fecact") LocalDate tl_fecact,
			                  @Param("tl_hraact") LocalTime tl_hraact);
			                  


@Query(value="{call SP_CrudLcoTasa(:opcion,:cia,:tl_tiptasa, :tl_codtasa, :tl_dsctasa, "
		+ ":tl_valref1,:tl_valref2, :tl_tasa, :tl_detcbi,:tl_detcob, :tl_flabas,"
		+ ":tl_usrcrea, :tl_feccrea,:tl_hracrea, :tl_usract, :tl_fecact, :tl_hraact)}"
		, nativeQuery = true)
@Transactional
@Modifying
void Transaccion(@Param("opcion") int option,
						  @Param("cia") String cia,
						  @Param("tl_tiptasa") String tl_tiptasa,
		                  @Param("tl_codtasa") String tl_codtasa,
		                  @Param("tl_dsctasa") String tl_dsctasa,
		                  @Param("tl_valref1") Double tl_valref1,
		                  @Param("tl_valref2") Double tl_valref2,
		                  @Param("tl_tasa") Double tl_tasa,
		                  @Param("tl_detcbi") String tl_detcbi,
		                  @Param("tl_detcob") String tl_detcob,
		                  @Param("tl_flabas") String tl_flabas,
		                  @Param("tl_usrcrea") String tl_usrcrea,
		                  @Param("tl_feccrea") LocalDate tl_feccrea,
		                  @Param("tl_hracrea") LocalTime tl_hracrea,
		                  @Param("tl_usract") String tl_usract,
		                  @Param("tl_fecact") LocalDate tl_fecact,
		                  @Param("tl_hraact") LocalTime tl_hraact);
		                  

}
