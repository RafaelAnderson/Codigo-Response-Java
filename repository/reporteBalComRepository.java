package com.empresa.repository;

import java.util.List;
import java.util.Map;
import com.empresa.entity.lcoTasa;
import com.empresa.entity.lcoTasaPk;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface reporteBalComRepository extends JpaRepository<lcoTasa, lcoTasaPk>{
    @Query(value="{call SP_balance_comprobacion(:opcion, :Cia, :ejercicio, :PER, :Nd, :pCta, :tipRep)}" , nativeQuery = true)
    List<Object[]> swBalComp(	@Param("opcion") int opcion,
								  @Param("Cia") String Cia,
								  @Param("ejercicio") String ejercicio,
								  
								  @Param("PER") String PER,
								  @Param("Nd") String Nd,
								  @Param("pCta") String pCta,
								  @Param("tipRep") String tipRep
								  );
	
	@Query(value="{call SP_balance_comprobacion(:opcion, :Cia, :ejercicio, :PER, :Nd, :pCta, :tipRep)}" , nativeQuery = true)
	List<Object[]> swBalCompAper (	@Param("opcion") int opcion,
									@Param("Cia") String Cia,
									@Param("ejercicio") String ejercicio,
									
									@Param("PER") String PER,
									@Param("Nd") String Nd,
									@Param("pCta") String pCta,
									@Param("tipRep") String tipRep
									);

	@Query(value="{call SP_balance_comprobacion(:opcion, :Cia, :ejercicio, :PER, :Nd, :pCta, :tipRep)}" , nativeQuery = true)
	List<Object[]> swBalCompNOrd  (	@Param("opcion") int opcion,
									@Param("Cia") String Cia,
									@Param("ejercicio") String ejercicio,
									
									@Param("PER") String PER,
									@Param("Nd") String Nd,
									@Param("pCta") String pCta,
									@Param("tipRep") String tipRep
									);
	@Query(value="{call SP_balance_comprobacion(:opcion, :Cia, :ejercicio, :PER, :Nd, :pCta, :tipRep)}" , nativeQuery = true)		
	List<Map<String,Object[]>> swBalComptipo2(	@Param("opcion") int opcion,
									@Param("Cia") String Cia,
									@Param("ejercicio") String ejercicio,
									
									@Param("PER") String PER,
									@Param("Nd") String Nd,
									@Param("pCta") String pCta,
									@Param("tipRep") String tipRep
									);
	  
	  @Query(value="{call SP_balance_comprobacion(:opcion, :Cia, :ejercicio, :PER, :Nd, :pCta, :tipRep)}" , nativeQuery = true)
	  List<Map<String,Object[]>> swBalCompApertipo2 (	@Param("opcion") int opcion,
									  @Param("Cia") String Cia,
									  @Param("ejercicio") String ejercicio,
									  
									  @Param("PER") String PER,
									  @Param("Nd") String Nd,
									  @Param("pCta") String pCta,
									  @Param("tipRep") String tipRep
									  );
  
	  @Query(value="{call SP_balance_comprobacion(:opcion, :Cia, :ejercicio, :PER, :Nd, :pCta, :tipRep)}" , nativeQuery = true)
	  List<Map<String,Object[]>> swBalCompNOrdtipo2  (	@Param("opcion") int opcion,
									  @Param("Cia") String Cia,
									  @Param("ejercicio") String ejercicio,
									  
									  @Param("PER") String PER,
									  @Param("Nd") String Nd,
									  @Param("pCta") String pCta,
									  @Param("tipRep") String tipRep
									  );									

}
