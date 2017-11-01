class Productos extends Thread {
	
	//ATRIBUTOS

	private int numtabla;
	private int i;

	//CONSTRUCTORES

	public Productos(int t, int p){

		numtabla = t;
		i = p;

	}

	//METODOS

	public void run(){

		System.out.println(getName()+" : "+ numtabla+" X "+i+" = "+(numtabla*i));
	}
}