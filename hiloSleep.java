class hiloSleep extends Thread{
	
	//ATRIBUTOS

	//CONSTRUCTORES

	//METODOS

	public void run(){

	System.out.println("Hola soy: " +Thread.currentThread().getName() + "despues de haber dormido: " + Thread.currentThread().sleep());

	}
}