/* ejercicio 4 SERIES ENTERAS CON 3 HILOS

Escribe un programa concurrente 


*/



public class Ejercicio4{
	
	public static void main(String []args){
		Hilo5 h1 = new Hilo5(2,20);
		Hilo5 h2 = new Hilo5(5,50);
		Hilo5 h3 = new Hilo5(10,100);

		h1.start();
		h2.start();
		h3.start();
	}
}