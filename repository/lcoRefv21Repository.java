package com.empresa.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.lcoRefv21;
import com.empresa.entity.lcoRefv21Pk;

public interface lcoRefv21Repository extends JpaRepository<lcoRefv21, lcoRefv21Pk> {
	
	@Query(value = "{call SP_CRUD_lcorefv(:opcion" +
			",:cia" +
			",:anio" +
			",:rf_tpanex" +
			",:rf_cdanex" +
			",:rf_subdia" +
			",:rf_compro" +
			",:rf_secue" +
			",:rf_tipdocr" +
			",:rf_nmdocr" +
			",:rf_serdoc" +
			",:rf_numdoc" +
			",:rf_fecdoc" +
			",:rf_base" +
			",:rf_basemn" +
			",:rf_baseme" +
			",:rf_igv" +
			",:rf_igvmn" +
			",:rf_igvme)}", nativeQuery = true)

			List<Map<String, Object>> listDetaDocRef(
			@Param("opcion") String opcion,
			@Param("cia") String cia,
			@Param("anio") String anio,
			@Param("rf_tpanex") String rf_tpanex,
			@Param("rf_cdanex") String rf_cdanex,
			@Param("rf_subdia") String rf_subdia,
			@Param("rf_compro") String rf_compro,
			@Param("rf_secue") String rf_secue,
			@Param("rf_tipdocr") String rf_tipdocr,
			@Param("rf_nmdocr") String rf_nmdocr,
			@Param("rf_serdoc") String rf_serdoc,
			@Param("rf_numdoc") String rf_numdoc,
			@Param("rf_fecdoc") LocalDate rf_fecdoc,
			@Param("rf_base") Double rf_base,
			@Param("rf_basemn") Double rf_basemn,
			@Param("rf_baseme") Double rf_baseme,
			@Param("rf_igv") Double rf_igv,
			@Param("rf_igvmn") Double rf_igvmn,
			@Param("rf_igvme") Double rf_igvme);


			@Query(value = "{call SP_CRUD_lcorefv(:opcion" +
			",:cia" +
			",:anio" +
			",:rf_tpanex" +
			",:rf_cdanex" +
			",:rf_subdia" +
			",:rf_compro" +
			",:rf_secue" +
			",:rf_tipdocr" +
			",:rf_nmdocr" +
			",:rf_serdoc" +
			",:rf_numdoc" +
			",:rf_fecdoc" +
			",:rf_base" +
			",:rf_basemn" +
			",:rf_baseme" +
			",:rf_igv" +
			",:rf_igvmn" +
			",:rf_igvme)}", nativeQuery = true)
			@Modifying
			@Transactional
			void crearDetaRef(
				@Param("opcion") String opcion,
				@Param("cia") String cia,
				@Param("anio") String anio,
				@Param("rf_tpanex") String rf_tpanex,
				@Param("rf_cdanex") String rf_cdanex,
				@Param("rf_subdia") String rf_subdia,
				@Param("rf_compro") String rf_compro,
				@Param("rf_secue") String rf_secue,
				@Param("rf_tipdocr") String rf_tipdocr,
				@Param("rf_nmdocr") String rf_nmdocr,
				@Param("rf_serdoc") String rf_serdoc,
				@Param("rf_numdoc") String rf_numdoc,
				@Param("rf_fecdoc") LocalDate rf_fecdoc,
				@Param("rf_base") Double rf_base,
				@Param("rf_basemn") Double rf_basemn,
				@Param("rf_baseme") Double rf_baseme,
				@Param("rf_igv") Double rf_igv,
				@Param("rf_igvmn") Double rf_igvmn,
				@Param("rf_igvme") Double rf_igvme);

				@Query(value = "{call SP_CRUD_lcorefv(:opcion" +
				",:cia" +
				",:anio" +
				",:rf_tpanex" +
				",:rf_cdanex" +
				",:rf_subdia" +
				",:rf_compro" +
				",:rf_secue" +
				",:rf_tipdocr" +
				",:rf_nmdocr" +
				",:rf_serdoc" +
				",:rf_numdoc" +
				",:rf_fecdoc" +
				",:rf_base" +
				",:rf_basemn" +
				",:rf_baseme" +
				",:rf_igv" +
				",:rf_igvmn" +
				",:rf_igvme)}", nativeQuery = true)
				@Modifying
				@Transactional
				void eliminarDetaRef(
					@Param("opcion") String opcion,
					@Param("cia") String cia,
					@Param("anio") String anio,
					@Param("rf_tpanex") String rf_tpanex,
					@Param("rf_cdanex") String rf_cdanex,
					@Param("rf_subdia") String rf_subdia,
					@Param("rf_compro") String rf_compro,
					@Param("rf_secue") String rf_secue,
					@Param("rf_tipdocr") String rf_tipdocr,
					@Param("rf_nmdocr") String rf_nmdocr,
					@Param("rf_serdoc") String rf_serdoc,
					@Param("rf_numdoc") String rf_numdoc,
					@Param("rf_fecdoc") LocalDate rf_fecdoc,
					@Param("rf_base") Double rf_base,
					@Param("rf_basemn") Double rf_basemn,
					@Param("rf_baseme") Double rf_baseme,
					@Param("rf_igv") Double rf_igv,
					@Param("rf_igvmn") Double rf_igvmn,
					@Param("rf_igvme") Double rf_igvme);
	
}
