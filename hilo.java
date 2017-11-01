class hilo extends Thread{
	
	//ATRIBUTOS

	//CONSTRUCTORES

	//METODOS

	public void run(){

	System.out.println(Thread.currentThread().getName() + ": tiene prioridad " + Thread.currentThread().getPriority() + " y su ID " + getId());

	}
}