package com.ryan.commons.mail.service;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ryan.commons.CommonsApplication;
import com.ryan.commons.config.mail.MailConfiguration;

@RunWith(SpringRunner.class)
//@SpringApplicationConfiguration(classes = MailConfiguration.class)
@ContextConfiguration(classes = {MailConfiguration.class})
@ComponentScan(basePackages = "com.ryan.commons")
public class MailServiceTest /*extends SpringBootServletInitializer*/ {

//	@Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
//        return application.sources(CommonsApplication.class);
//    }
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        super.onStartup(servletContext);
//    }
    
    @Autowired
    @Qualifier("mailService")
    MailService mailService;
    
    @Test
    public void test() {
		CustomMailMessage mailMessage = new CustomMailMessage();
		mailMessage.setFrom("lmhyuks@gmail.com");
		mailMessage.setTo("lmhyuk.ryan@gmail.com");
		mailMessage.setSubject("[Test] mailTest");
		mailMessage.setContents("test ....");

        mailService.send(mailMessage);
    }

}
