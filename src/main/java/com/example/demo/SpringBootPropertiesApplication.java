package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPropertiesApplication implements CommandLineRunner{
//    @Value("${myapp.language}")
//    String lang;
	
	@Autowired
	MyProperties myProps;
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("lang is "+myProps.getMyapp().getLanguage()+" name is "+myProps.getName()+" first zip is "+myProps.getZip()[0]);
	}

}

