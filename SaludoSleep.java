class SaludoSleep extends Thread {

	private int tiempo;

	//CONSTRUCTOR
	public SaludoSleep(int t){

		tiempo = t;

	} 


	public void run(){

		try{

			sleep(tiempo);
			
		}
		catch(InterruptedException e){

		//lo necesita porque si

				}


				System.out.println("Soy " +getName()+ "despues de dormir: "+ tiempo);

	}
	

}