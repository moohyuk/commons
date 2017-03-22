package com.ryan.commons.mail.service;

import org.springframework.mail.SimpleMailMessage;

public class CustomMailMessage extends SimpleMailMessage {

	private static final long serialVersionUID = -3995515888127959167L;

	private SimpleMailMessage message; 
	private String mailTo;
	private String mailFrom; 
	private String subject;
	private String contents;
	
	public SimpleMailMessage getMessage() {
		return message;
	}
	public void setMessage(SimpleMailMessage message) {
		this.message = message;
	}
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getMailFrom() {
		return mailFrom;
	}
	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
}
