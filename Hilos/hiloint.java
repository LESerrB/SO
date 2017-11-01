class hiloint extends Thread{
	
	//ATRIBUTOS

	//CONSTRUCTORES

	//METODOS

	public void run(){

	for(int i=1; i<=10; i++){
		System.out.println("El hilo "  + getName() + "  Imprime " + i);
	}
}
}