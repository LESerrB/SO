/*100 hilos (maximo paralelismo...)...
cada hilo hace una sola multiplicación
hilo-0 = 1x1
hilo-1 = 1x2 .......*/

class Ejercicio14{

	public static void main(String []args){

		for(int i = 1; i <= 10; i++)
			for(int j = 1; j <= 10; j++)
			{
				Tabla3 t = new Tabla3(i,j);
				t.start();
				System.out.println("\nHola soy " + t.getName());
			}
	
		System.out.println("\nTermino el hilo principal...");
 		System.out.println("\n");
 		}




}
