package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.fakemock.DetalleFakeMock;
import com.example.demo.fakemock.DocumentoFakeMock;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired private DetalleFakeMock detalleFakeMock;
	@Autowired private DocumentoFakeMock documentoFackeMock;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@PostConstruct
	void init() {
		documentoFackeMock.setInitialData();
		detalleFakeMock.setInitialData();
	}


}
