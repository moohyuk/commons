package com.ryan.commons.config.mail;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@ConfigurationPropertiesBinding
@ConfigurationProperties(prefix = "mail.smtp")
@EnableConfigurationProperties
public class SmtpProperty implements Serializable {

	private static final long serialVersionUID = -7754847347246081428L;
	
	private boolean startTlsEnable;
	private boolean auth;
	
	public boolean getStartTlsEnable() {
		return startTlsEnable;
	}
	
	public void setStartTlsEnable(Boolean startTlsEnable) {
		this.startTlsEnable = startTlsEnable;
	}
	
	public boolean getAuth() {
		return auth;
	}
	
	public void setAuth(Boolean auth) {
		this.auth = auth;
	}
	
	
}
