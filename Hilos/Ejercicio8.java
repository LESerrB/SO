/*Modificar el ejercicio anterior colocando un ciclo en el metodo run()
modificar el metodo run para nque implemente un ciclo de 4 iteraciones
ejecutar el programa varias veces observando las salidas*/
class Ejercicio8{
	
	public static void main(String []args){


	SaludoSleep3 s1 = new SaludoSleep3(100);
	SaludoSleep3 s2 = new SaludoSleep3(2000);
	SaludoSleep3 s3 = new SaludoSleep3(4000);

	s1.start();
	s2.start();
	s3.start();

	System.out.println("Termino el hilo principal...");
}

}
