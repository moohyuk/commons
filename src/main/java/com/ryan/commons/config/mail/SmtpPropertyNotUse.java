package com.ryan.commons.config.mail;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "ryanmail.smtp")
@EnableConfigurationProperties
public class SmtpPropertyNotUse {

    private SmtpProperty smtp = new SmtpProperty();
    private boolean auth;
	private boolean starTtlsEnable;
	
    public SmtpProperty getSmtpProperty() {
    	smtp.setAuth(auth);
    	smtp.setStartTlsEnable(starTtlsEnable);
    	return smtp;
    }

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

	public boolean isStarTtlsEnable() {
		return starTtlsEnable;
	}

	public void setStarTtlsEnable(boolean starTtlsEnable) {
		this.starTtlsEnable = starTtlsEnable;
	}


}
