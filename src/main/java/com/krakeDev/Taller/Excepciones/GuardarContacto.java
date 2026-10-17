package com.krakeDev.Taller.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GuardarContacto {
	
	private static final Logger log = LogManager.getLogger(GuardarContacto.class);
	
	public static void guardar() throws IOException {
		
		FileWriter escritor = null; // Escribir el archivo 
		
		try {
			escritor = new FileWriter("contactos.txt");
			escritor.write("Nombre: Maria\n");
			escritor.write("Apellido: Gomez\n");
			escritor.write("Telefono: 0981234567\n");
		}catch(IOException e) {
			log.error("Ocurrio un error: " , e);
		}finally {
			escritor.close();
		}
	}

}
