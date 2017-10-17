package com.example.demo.fakemock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.servicio.DocumentoService;

@Component
public class DocumentoFakeMock {
	
	@Autowired DocumentoService documentoService;
	
	public void setInitialData() {
		
	}

}
