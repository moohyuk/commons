package com.ryan.commons.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Controller
public class TestController {

	@RequestMapping("/")
	public void testInit(){
		System.out.println("Test init... ");
	}
}
