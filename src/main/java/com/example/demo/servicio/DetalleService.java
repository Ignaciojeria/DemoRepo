package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Documento;
import com.example.demo.repository.DocumentoRepository;

@Service
public class DetalleService {

	@Autowired
	private DocumentoRepository documentoRepository;
	
	public List<Documento> findAll(){
		return documentoRepository.findAll();
	}
	
}
