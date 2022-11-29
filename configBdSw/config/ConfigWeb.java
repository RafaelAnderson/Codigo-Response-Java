package com.empresa.configBdSw.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigWeb implements WebMvcConfigurer {
    
    @Autowired
    private DatabaseCambio databasecambio;

    @Override
	public void addInterceptors(InterceptorRegistry registry){
        
        registry.addInterceptor(databasecambio)
                .addPathPatterns("/**");
                
    }
}
