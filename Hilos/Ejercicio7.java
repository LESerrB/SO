/*modificar el ejercicio anterior para que imprimia el nombre del hilo en el momento en que 
esta en ejecucion antes de mandarlo a dormir con sleep y que el hilo principal
se despida al terminar*/



class Ejercicio7{
	
	public static void main(String []args){


	SaludoSleep2 s1 = new SaludoSleep2(100);
	SaludoSleep2 s2 = new SaludoSleep2(2000);
	SaludoSleep2 s3 = new SaludoSleep2(4000);

	s1.start();
	s2.start();
	s3.start();

	System.out.println("Termino el hilo principal...");
}

}