package com.empresa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.empresa.entity.lcoUser;

@Repository
public interface confiUsuarioRepositorio1 extends JpaRepository<lcoUser, String> {
	// Lista los registros de la Tabla de Anexos
	@Query(value = "{call SP_users1(:opcion)}  ", nativeQuery = true)
	List<Map<String, Object[]>> swListarUsr(@Param("opcion") int opcion);
}