public class Transpuesta extends Thread {

//ATRIBUTOS
	int num;//VALOR
	String nombre;//NOMBRE
  
	
//CONSTRUCTOR
	public Transpuesta(String nombre, int num1) {
		this.num = num1;
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