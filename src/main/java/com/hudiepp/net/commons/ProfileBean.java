package com.hudiepp.net.commons;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProfileBean {

	@Value("${server.port}")
	private String serverProt;

	@Value("${server.id}")
	private String id;

	@Value("${mybatis.mapper-locations}")
	private String mapperLocations;

	@Value("${spring.datasource.username}")
	private String dsUserName;

	@Value("${spring.datasource.password}")
	private String dsPasswd;

	@Value("${spring.datasource.url}")
	private String dsUrl;

	@Value("${spring.datasource.driver-class-name}")
	private String dsClassName;

	public String getServerProt() {
		return serverProt;
	}

	public void setServerProt(String serverProt) {
		this.serverProt = serverProt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMapperLocations() {
		return mapperLocations;
	}

	public void setMapperLocations(String mapperLocations) {
		this.mapperLocations = mapperLocations;
	}

	public String getDsUserName() {
		return dsUserName;
	}

	public void setDsUserName(String dsUserName) {
		this.dsUserName = dsUserName;
	}

	public String getDsPasswd() {
		return dsPasswd;
	}

	public void setDsPasswd(String dsPasswd) {
		this.dsPasswd = dsPasswd;
	}

	public String getDsUrl() {
		return dsUrl;
	}

	public void setDsUrl(String dsUrl) {
		this.dsUrl = dsUrl;
	}

	public String getDsClassName() {
		return dsClassName;
	}

	public void setDsClassName(String dsClassName) {
		this.dsClassName = dsClassName;
	}

}
