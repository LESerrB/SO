class Tablascon10Hilos extends Thread{
	
	//ATRIBUTOS

	private int numtabla;



	//CONSTRUCTORES

	public Tablascon10Hilos(int t){

		numtabla = t; //recibe el numero de la tabla del main


	}

	//METODOS

	public void run(){

		//declarar arreglo de 10 hilos

		Productos []hilos = new Productos[10]; //dimensiona el arreglo

		int i;

		for(i = 0; i < 10; i++)
		{
			hilos[i] = new Productos(numtabla, i+1);
			//casilla 1	--- arreglo 1	
			hilos[i].start();
		}

		for(i = 0; i < 10; i++)
		{
			try{
				hilos[i].join();
				}
		catch(java.lang.InterruptedException e){}

		}
	System.out.println("Termino el hilo "+getName()+".....");
	}

}