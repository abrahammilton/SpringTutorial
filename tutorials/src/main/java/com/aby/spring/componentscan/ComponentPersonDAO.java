package com.aby.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDAO {

	@Autowired
	ComponentJdbcConnection connection;

	public ComponentJdbcConnection getConnection() {
		return connection;
	}

	public void setConnection(ComponentJdbcConnection connection) {
		this.connection = connection;
	}
	
}
