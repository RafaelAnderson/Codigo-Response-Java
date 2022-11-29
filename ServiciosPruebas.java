package com.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.empresa.configBdSw.config.CredClieConfig;
import com.empresa.entity.credcliedb;
import com.empresa.service.CredClieService;

@SpringBootApplication()
public class ServiciosPruebas{

	public static String vKey;
	public static String vURI;
	public static String vUSR;
	public static String vPSW;


	public static void main(String[] args) {
		SpringApplication.run(ServiciosPruebas.class, args);

		System.out.println("funciono BACKGeneral port 8076");

		try {
			
			vKey="";
			vURI="";
			vUSR="";
			vPSW="";
	

			/*vKey="";
			  vURI="jdbc:mysql://174.138.178.198:3306/lcon11111111111";
			  vUSR="lidsoftprod";
			  vPSW="P@$$Kurt1982Prod";*/

			AbstractApplicationContext context = new AnnotationConfigApplicationContext(CredClieConfig.class);						
			CredClieService credclieService = context.getBean(CredClieService.class);
			for (credcliedb credclie : credclieService.findAllCredClie(String.valueOf("11111111111"), String.valueOf("User3"))){
				vKey=credclie.getCu_001();
				vURI="jdbc:mysql://" + credclie.getCu_003() + ":" + credclie.getCu_006() + "/" + credclie.getCu_002(); 
				vUSR=credclie.getCu_004();
				vPSW=credclie.getCu_005();
			}
			context.close();

			System.out.println("Despues de AbstractApplicationContext");

			System.out.println("main vKey => " + vKey);
			System.out.println("main vURI => " + vURI);
			System.out.println("main vUSR => " + vUSR);
			System.out.println("main vPSW => " + vPSW);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

