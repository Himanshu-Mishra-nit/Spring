package com.in28minutes.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.scope.JdbcConnection;

@Component
public class ComponentPersonDAO {
	
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setComponentJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}

	

}
