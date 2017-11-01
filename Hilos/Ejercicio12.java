/*escribir un programa concurrente que ejecute 1 hilo, el hilo deberá imprimir su nombre y 
todas las tablas de multiplicar del 1-10*/

class Ejercicio12{
	
		public static void main(String []args){

			Tabla t = new Tabla();

			t.start();

	System.out.println("Termino el hilo principal...");
}
}