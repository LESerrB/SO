/*ejercicio 17

datos aleatorios

capturar y listar (sus elementos desde el main) un arreglo de tamaño n con un hilo */
import java.util.Scanner;
class Ejercicio17{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int A[];
		int max;
		Lectura h1;


		System.out.print("Tamaño del arreglo: ");
		max = leer.nextInt();
		A = new int[max];
		h1 = new Lectura(A); //SE CREA EL HILO
		h1.start();
		try{
			h1.join();
			}
		catch(java.lang.InterruptedException e){}

		for (int i=0; i<A.length; i++ ) 
			System.out.println("[" + i + "]" + A[i]);
		System.out.println("Termino el hilo pricipal");

	}

}