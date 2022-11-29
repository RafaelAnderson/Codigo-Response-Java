package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.Ubigeo;

@Repository
public interface UbigeoRepository extends JpaRepository<Ubigeo, String> {
	
	@Query(value="{call SP_ListUbigeo(:opcion, :cod_dep, :cod_prov, :cod_dist, :id_ubigeo)}"
			, nativeQuery = true)
	List<Ubigeo> listar(@Param("opcion") int option,
			                  @Param("cod_dep") String cod_dep,
			                  @Param("cod_prov") String cod_prov,
			                  @Param("cod_dist") String cod_dist,
			                  @Param("id_ubigeo") String id_ubigeo
			                  );
	

}
