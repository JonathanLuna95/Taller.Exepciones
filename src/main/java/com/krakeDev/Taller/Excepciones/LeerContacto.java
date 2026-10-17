package com.krakeDev.Taller.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerContacto {
	
	private static final Logger log = LogManager.getLogger(LeerContacto.class);
	
	public static void leer() {
		FileReader lectorArchivo = null;
		BufferedReader lector = null; 
		
		try {
			lectorArchivo = new FileReader("contactos.txt");
			
			lector = new BufferedReader(lectorArchivo);
			
			for(int i = 0; i<6; i++) {
				// readLine leer linea por linea
				System.out.println(lector.readLine());
			}
			
		log.info("Se pudo leer exitosamente");
			
		}catch (FileNotFoundException e) {
			log.error("Ocurrio un error al encontrar el archivo" + e);
		}catch (IOException e) {
			log.error("Ocurrio un error al leer el archivo" + e);
		}finally {
			try {
				if(lectorArchivo != null) {
				lectorArchivo.close();
				}
				if(lector != null) {
				lector.close();
				}
				log.info("Se cerro exitosamente");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	

}
