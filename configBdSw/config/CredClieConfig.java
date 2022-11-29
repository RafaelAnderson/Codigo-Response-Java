package com.empresa.configBdSw.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.empresa.service.CredClieService;
import com.empresa.service.CredClieServiceImp;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.empresa.repository" })
@ComponentScan("com.empresa")
@PropertySource("classpath:application.properties")
public class CredClieConfig {
    
    @Bean
    public CredClieService credclieService() {
		return new CredClieServiceImp();
	}
}
