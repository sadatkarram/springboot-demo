package com.balagi.balagiconfigservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties("db")
public class TestDataSource {
	
	private String connectionUrl;
	private String driverClassname;
	private String username;
	private String password;
	
	public String getConnectionUrl() {
		return connectionUrl;
	}
	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}
	public String getDriverClassname() {
		return driverClassname;
	}
	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public TestDataSource(String connectionUrl, String driverClassname, String username, String password) {
		super();
		this.connectionUrl = connectionUrl;
		this.driverClassname = driverClassname;
		this.username = username;
		this.password = password;
	}
	public TestDataSource() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TestDataSource [connectionUrl=" + connectionUrl + ", driverClassname=" + driverClassname + ", username="
				+ username + ", password=" + password + "]";
	}
	
	
}
