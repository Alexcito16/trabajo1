package com.trabajo1;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.trabajo1.components.Dependencia;

@SpringBootApplication
public class Trabajo1Application implements CommandLineRunner{

	Dependencia dependencia;
	
	
	public Trabajo1Application(Dependencia dependencia) {
		this.dependencia = dependencia;
	}

	public static void main(String[] args) {
		SpringApplication.run(Trabajo1Application.class, args);
	}

	@Override
	public void run(String... args)  {
		
		// suma
		//this.dependencia.salida_mensajes(this.dependencia.suma(dependencia.leer_teclado(), dependencia.leer_teclado())); 
		
		//resta
		//this.dependencia.salida_mensajes(this.dependencia.resta(dependencia.leer_teclado(), dependencia.leer_teclado()));
		// mayor de dos numeros 
		
		//this.dependencia.salida_mensajes(dependencia.mayor(this.dependencia.leer_teclado(), this.dependencia.leer_teclado()));
		ArrayList<String> vector = this.dependencia.tabla(dependencia.leer_teclado());
		for(String valor: vector) {
			dependencia.salida_mensajes(valor);
		}
	}
	
	
 
}
