package com.miracle.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class EasyBackstageApplication {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(){
		return new ModelAndView("index");
	}
	
    public static void main(String[] args) {
        SpringApplication.run(EasyBackstageApplication.class, args);
    }
    
}
