package com.ryan.commons;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class CommonsApplication extends SpringBootServletInitializer {

	public static void main(String[] args){
		
		SpringApplication.run(CommonsApplication.class, args);
	    /*
	    ApplicationContext ctx = SpringApplication.run(CommonsApplication.class, args);
	    
		System.out.println("Let's inspect the beans provided by Spring boot:");
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
		SpringApplication commonApps = new SpringApplication(CommonsApplication.class);
		commonApps.run(args);
		*/
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(CommonsApplication.class);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
    }
}
