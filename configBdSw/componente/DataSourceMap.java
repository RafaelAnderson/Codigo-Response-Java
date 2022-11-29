package com.empresa.configBdSw.componente;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component
public class DataSourceMap {
    private Map<Object, Object> dataSourceMap = new ConcurrentHashMap<>();

	    public void addDataSource(String session, DataSource dataSource) {
			dataSourceMap.put(session, dataSource);
	    }

	    public Map<Object, Object> getDataSourceMap() {
	        return dataSourceMap;
	    }
}
