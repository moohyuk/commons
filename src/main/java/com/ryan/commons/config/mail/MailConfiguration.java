package com.ryan.commons.config.mail;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ConfigurationProperties(prefix = "mail")
public class MailConfiguration {
	
//	private static final String MAIL_DEBUG = "mail.debug";
//	private static final String MAIL_SMTP_STARTTLS_REQUIRED = "mail.smtp.starttls.required";
	private static final String MAIL_SMTP_AUTH = "mail.smtp.auth";
	private static final String MAIL_SMTP_STARTTLS_ENABLE = "mail.smtp.starttls.enable";

	private String host;
	private String protocol;
	private int port;
	private String username;
	private String password;
	private String defaultEncoding;
	private SmtpProperty smtp;

	@Bean
	public JavaMailSender javaMailSender() {
		
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(host);
		mailSender.setProtocol(protocol);
		mailSender.setPort(port);
		mailSender.setUsername(username);
		mailSender.setPassword(password);
		mailSender.setDefaultEncoding(getDefaultEncoding());

		Properties mailProperties = new Properties();
		mailProperties.put(MAIL_SMTP_AUTH, smtp.getAuth());
		mailProperties.put(MAIL_SMTP_STARTTLS_ENABLE, smtp.getStartTlsEnable());

		return mailSender;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
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

	public String getDefaultEncoding() {
		return defaultEncoding;
	}

	public void setDefaultEncoding(String defaultEncoding) {
		this.defaultEncoding = defaultEncoding;
	}

	public SmtpProperty getSmtp() {
		return smtp;
	}

	public void setSmtp(SmtpProperty smtp) {
		this.smtp = smtp;
	}

	public static String getMailSmtpAuth() {
		return MAIL_SMTP_AUTH;
	}

	public static String getMailSmtpStarttlsEnable() {
		return MAIL_SMTP_STARTTLS_ENABLE;
	}


}