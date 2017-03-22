package com.ryan.commons.mail.service;

import java.util.List;

import org.springframework.mail.MailException;

public interface MailService {

	void send(CustomMailMessage message) throws MailException;
	
	void send(List<CustomMailMessage> messages) throws MailException;
}
