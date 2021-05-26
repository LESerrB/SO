/*Desplegar propiedades de los hilos

escribir un programa concurrente que ejecute 3 hilos
que ejecute 3 hilos cada uno imprima en pantalla
su nombre, su id y su prioridad

 run:

ID del hilo principal: 1 
Termino el Hilo Principal....
		Soy el Thread-0 con prioridad 10 Mi ID es: 9

		*/

import java.lang.Thread;

class Ejercicio1{
	
	public static void main(String []args){

	hilo h1 = new hilo();
	hilo h2 = new hilo();
	hilo h3 = new hilo();

	System.out.println("Termino el hilo principal.....");

	h1.start();
	h2.start();
	h3.start();




	}
}
