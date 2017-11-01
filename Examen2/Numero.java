public class Numero extends Thread {

//ATRIBUTOS
	int num;//VALOR
	String nombre;//NOMBRRE
  	
//CONSTRUCTOR
	public Numero(String nombre) {
		this.num = (int)(Math.random()*10);
		setName(nombre);
	}

//METODOS
	public void run() {
		System.out.print("	"+getName()+" "+num+"	");			
	}

	public int GetInfo() {
		return num;
	}
}