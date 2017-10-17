package com.example.demo.fakemock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Detalle;
import com.example.demo.entity.Documento;
import com.example.demo.servicio.DetalleService;

@Component
public class DetalleFakeMock {
	@Autowired
	private DetalleService detalleService;

	public void setInitialData() {
		detalleService.save(new Detalle(1L,new Documento(1,null,9878L,"Mr Robot",4.8),"US",9000,3,10.5," Servicios secretos"));
		detalleService.save(new Detalle(2L,new Documento(2,null,9879L,"Teemo",4.8),"US",9000,3,10.5," Servicios secretos"));
		detalleService.save(new Detalle(3L,new Documento(3,null,9879L,"Rick Sanchez",10.0),"US",9000,3,10.5," Servicios secretos"));
	}
}
