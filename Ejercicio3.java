/*Serie entera con un hilo

1. escribir un programa concurrente que ejecute un hilo, el hilo debera imprimir
una serie numerica que inicia siempre en el numero 1 y termina en el numero 10

2. modificar el programa principal para que ejecute 3 hilos

3. explique que sucede con los valores de cada hilo, ¿se comparte la variable
o cada hilo tiene sus propios valores de la variable?   */
import java.lang.Thread;

class Ejercicio3{
	
	public static void main(String []args){

		

	hiloint h1 = new hiloint();
	hiloint h2 = new hiloint();
	hiloint h3 = new hiloint();

	h1.start();
	h2.start();
	h3.start();


}
}