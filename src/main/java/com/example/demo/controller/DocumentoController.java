package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Documento;
import com.example.demo.servicio.DocumentoService;

@RestController
public class DocumentoController {

	@Autowired DocumentoService documentoService;
	
	@GetMapping(value="documentos")
	public List<Documento> getAll(){
		return documentoService.findAll();
	}
	
	
}
