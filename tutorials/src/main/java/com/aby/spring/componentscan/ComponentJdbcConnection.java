package com.aby.spring.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, 
			 proxyMode = ScopedProxyMode.TARGET_CLASS) // Same instance is returned coz we create person instance and access
												// jdbc through person instance. New instance is created using proxyMode 
public class ComponentJdbcConnection {

	public ComponentJdbcConnection() {
		System.out.println("JDBC Connection");
	}
}
