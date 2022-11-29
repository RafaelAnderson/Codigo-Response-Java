package com.empresa.configBdSw.componente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import com.empresa.configBdSw.config.ContextHolder;

@Component
public class CustomRoutingDataSource extends AbstractRoutingDataSource {
    
    @Autowired
    DataSourceMap dataSources;

    @Override
    public Object determineCurrentLookupKey() {    	

        String key = ContextHolder.getClient();
        
        if ((key == "") || (key == null) ) {
        	key = "srvin";

            System.out.println("CustomRoutingDataSource 2=> key null : " + key );
        }
        if (!dataSources.getDataSourceMap().containsKey(key)) {
            DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds.setPassword(System.getProperty("pass"));
            ds.setUsername(System.getProperty("user"));
            ds.setUrl(System.getProperty("url"));
            dataSources.addDataSource(key, ds);
            setDataSources(dataSources);
            afterPropertiesSet();

            System.out.println("CustomRoutingDataSource 3=> dataSources : " + dataSources.getDataSourceMap().containsKey(key));
            System.out.println("CustomRoutingDataSource 3=> Url : " + ds.getUrl());
            System.out.println("CustomRoutingDataSource 3=> Username : " + ds.getUsername());
        }

        return key;
    }
    
    @Autowired
    public void setDataSources(DataSourceMap dataSources) {
    	
		System.setProperty("url","jdbc:mysql://174.138.178.198:3306/idadmin");
		System.setProperty("user","lidsoftprod");
		System.setProperty("pass","P@$$Kurt1982Prod");
				
        setTargetDataSources(dataSources.getDataSourceMap());
    }
}
