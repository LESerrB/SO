/*escribir un programa concurrente que ejecute 1 hilo, el hilo deberá imprimir su nombre y 
todas las tablas de multiplicar del 1-10 un hilo por cada tabla

sale todo revuelto por el planificador

*/

class Ejercicio13{
	
		public static void main(String []args){

			for(int i = 1; i <= 4; i++){

			Tabla2 t = new Tabla2(i);

			t.start();

			System.out.println("\nHola soy " +t.getName());

}	
		System.out.println("\nTermino el hilo principal...");
 		System.out.println("\n");
 		}
}