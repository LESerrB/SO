class Tabla3 extends Thread{
	private int i, j;

	//CONSTRUCTOR
	public Tabla3(int t, int n){

		i = t;
		j = n;
	}

	//METODO
	public void run(){
		System.out.println("Soy "+ getName() + " estoy creando mi:");
		for (i = 1; i <= 10; i++){
			TablaAux m = new TablaAux(i, j);
			m.start();
		}
System.out.println("....Termino el "+ getName());
			
	}


}