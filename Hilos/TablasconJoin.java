class TablasconJoin{
	
	public static void main(String[] args) {
		
		//declarar arreglo de 10 hilos

		Tablascon10Hilos []arreglo_tablas = new Tablascon10Hilos[10]; //dimensiona el arreglo

		int i;

		for(i = 0; i < 10; i++)
		{
			arreglo_tablas[i] = new Tablascon10Hilos(i+1);
			//casilla 1	--- arreglo 1	
			arreglo_tablas[i].start();

		}
		
		for(i = 0; i < 10; i++)
		{
			try{
				arreglo_tablas[i].join();
				}
		catch(java.lang.InterruptedException e){}

		}
	System.out.println("Termino el hilo principal...");
	}
}