package com.ejemplo.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}



//Modelo vista Controlador

/*Existe una clase controladora que recibe la petición y la delega al lugar que corresponda
Ej. Lógica de negocios, u otros. Es como un pivot en basquet

3 Capas: 
Controlador: intermediario
Modelo: El modelado de nuestros datso, clases, atributos, métodos, etiquetas, 
mapeos para el manejo de datos
Vista: la interfaz gráfica, lo que va a ver el usuario

Se pueden incluir mas capas, siendo asi la arquitectura de capas.

Como SpingBoot se basa en backend, trabajaremos con Postman para simular la 
interfaz gráfica.


*/

/*Jason Web Token - JWT posee 3 partes: 
Header
Payload
Verify Signature
*/