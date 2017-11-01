class Tabla extends Thread{
	
	public void run(){

		for(int k = 1; k <= 4; k++){
			for(int i = 1; i <= 4; i++)	


			System.out.println("Hilo: "+ getName() +" : " + k +" X "+i+ " = " +k*i);
			System.out.println("\n============================================\n");

		}
		System.out.println("\nTermino el hilo: "+ getName());
		System.out.println("\n");
	}
}