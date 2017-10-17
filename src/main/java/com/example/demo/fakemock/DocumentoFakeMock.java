package com.example.demo.fakemock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Documento;
import com.example.demo.servicio.DocumentoService;

@Component
public class DocumentoFakeMock {
	
	@Autowired DocumentoService documentoService;
	
	public void setInitialData() {
		documentoService.save(new Documento(1,null,9878L,"Mr Robot",4.8));
		documentoService.save(new Documento(2,null,9879L,"Teemo",4.8));
		documentoService.save(new Documento(3,null,9879L,"Rick Sanchez",10.0));
	}

}
