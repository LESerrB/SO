/*Escribir un programa concurrente que ejecute 3 hilos
cada uno imprima su nombre, su id y su prioridad
a) El primer hilo se crea con los valores de default
b) El segundo hilo se crea desde el main se le cambia su prioridad
asignandole la MAXIMA prioridad permitida
c) El tercer hilo se crea y desde el main se cambia su nombre y su
prioridad por la minima permitida */

import java.lang.Thread;

class Ejercicio2{
	
	public static void main(String []args){

	hilo h1 = new hilo();	//creacion del hilo
	hilo h2 = new hilo();	//creacion del hilo
	hilo h3 = new hilo();	//creacion del hilo

	System.out.println("Termino el hilo principal.....");

	h1.setName("Hilo 1");
	h1.setPriority(Thread.MAX_PRIORITY);
	h2.setName("Hilo 2");
	h2.setPriority(Thread.MIN_PRIORITY);
	h3.setName("Hilo 3");
	h3.setPriority(Thread.NORM_PRIORITY);

	h1.start();
	h2.start();
	h3.start();



	}
}