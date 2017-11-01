public class Hilo5 extends Thread{
	
	public int incr;
	public int tope;

	public Hilo5(int I, int T){

	incr = I;
	tope = T;

	}

	public void run(){

	System.out.println("El hilo "+ getName()+ " imprimira la serie del " +this.incr+ " hasta "+this.tope );
	for (int i = 0; i <= this.tope; i = i+this.incr)

	System.out.println("Nombre "+getName()+ " Imprime " +i);
	

	}

}