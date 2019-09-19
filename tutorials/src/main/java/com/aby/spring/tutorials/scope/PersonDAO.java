package com.aby.spring.tutorials.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

	@Autowired
	JdbcConnection connection;

	public JdbcConnection getConnection() {
		return connection;
	}

	public void setConnection(JdbcConnection connection) {
		this.connection = connection;
	}
	
}
