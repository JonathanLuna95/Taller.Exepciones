package com.krakeDev.Taller.Excepciones;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	
	private static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String telefono = "0981234567";
			// telefono incorrecto
			ValidarContacto.validarTelefono(telefono);
		
		GuardarContacto.guardar(telefono);
		LeerContacto.leer();
		
		log.info("Se guardo el telefono de forma exitosa");
		} catch (IllegalArgumentException e) {
			log.error("Ocurrio un error: " + e);
		}
		
		
	}

}
