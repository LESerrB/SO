class Lectura extends Thread{
	//ATRIBUTOS
	private int []arreglo;

	//CONSTRUCTORES 
	public Lectura(int []A){
	arreglo = A;
	}
	//METODOS
	public void run(){
	int i;
	for(i=0;i<arreglo.length; i++)
	arreglo[i] = (int)(Math.random()*10);
		}
}