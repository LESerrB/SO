class Tabla2 extends Thread{
	private int i;

	//CONSTRUCTOR
	public Tabla2(int t){

		i = t;

	}

	//METODO
	public void run(){

		int j;
		for(j = 1; j <= 10; j++)
			System.out.println(getName() + " : " + i + " X "+ j + " = "+ (i*j));
			System.out.println("\n============================================\n");
		
		System.out.println("\nTermino el hilo: "+ getName());
		System.out.println("\n");

	}


}