package com.ryan.commons.mail.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service(value = "mailService")
public class MailServiceImpl implements MailService {

	private static final Logger LOGGER = LoggerFactory.getLogger(MailServiceImpl.class);
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void send(CustomMailMessage message) {
		sendMail(message);
	}
	
	@Override
	public void send(List<CustomMailMessage> messages) {
		for (CustomMailMessage message : messages) {
			sendMail(message);
		}
	}
	
	private void sendMail(CustomMailMessage message) {
		try {
			LOGGER.debug(">> Send mailMessage: {}", message);
			doSend(message);
		} catch (Exception e) {
			LOGGER.error(">> Occur Exception: {}", e.getMessage());
		}
	}
	
	private void doSend(CustomMailMessage message) throws MessagingException {
		try {
			MimeMessage mimeMessage = javaMailSender.createMimeMessage();
	        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
		    messageHelper.setTo(message.getMailTo());
		    messageHelper.setFrom(message.getMailFrom());
		
		    messageHelper.setSubject(message.getSubject());
		    messageHelper.setText(message.getContents(), true);
		    javaMailSender.send(mimeMessage);
		    
		} catch (MessagingException e) {
            throw e;
        }
	}
	
//	private MimeMessageHelper getMimeMessageHelper(MailMessage message, MimeMessage mimeMessage) throws MessagingException {
//		MimeMessageHelper mimeMessageHelper = makeMessageHelper(message, mimeMessage);
//		mimeMessageHelper.setFrom(message.);
//		
//		return mimeMessageHelper;
//    }
//	
//	private MimeMessageHelper makeMessageHelper(MailMessage message, MimeMessage mimeMessage) throws MessagingException {
//        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, message.isMultipart());
//        if (StringUtils.hasText(message.getEncoding())) {
//            helper = new MimeMessageHelper(mimeMessage, message.isMultipart(), message.getEncoding());
//        }
//        return helper;
//    }
}
