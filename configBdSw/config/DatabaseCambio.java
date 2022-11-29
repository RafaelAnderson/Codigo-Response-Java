package com.empresa.configBdSw.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.empresa.ServiciosPruebas;

@Component
public class DatabaseCambio implements HandlerInterceptor {
    
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String hostname = request.getServerName();
        
        System.out.println("DatabaseSwitchInterceptor - preHandle ==> " + hostname);
        System.out.println("DatabaseSwitchInterceptor - Entrar preHandle 1==> " + System.getProperty("url"));
        System.out.println("DatabaseSwitchInterceptor - Entrar preHandle 2==> " + System.getProperty("user"));
        System.out.println("DatabaseSwitchInterceptor - Entrar preHandle 3==> " + System.getProperty("pass"));
        
        System.setProperty("url",ServiciosPruebas.vURI);
        System.setProperty("user",ServiciosPruebas.vUSR);
        System.setProperty("pass",ServiciosPruebas.vPSW); 

        ContextHolder.setClient(ServiciosPruebas.vKey);

        System.out.println("valorrrrr => ContextHolder.getClient() : " + ContextHolder.getClient());
        System.out.println("DatabaseSwitchInterceptor - Salir preHandle 1==> " + System.getProperty("url"));
        System.out.println("DatabaseSwitchInterceptor - Salir preHandle 2==> " + System.getProperty("user"));
        System.out.println("DatabaseSwitchInterceptor - Salir preHandle 3==> " + System.getProperty("pass"));

        return true;
    }
    
}
