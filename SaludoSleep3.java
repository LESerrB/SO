class SaludoSleep3 extends Thread {

	private int tiempo;

	//CONSTRUCTOR
	public SaludoSleep3(int t){

		tiempo = t;

	} 


	public void run(){

	
	for(int k=1; k<=4; k++){



		try{


			sleep(tiempo);
			
		}
		catch(InterruptedException e){

		//lo necesita porque si

				}
				System.out.println("\nHola soy " +getName());

				System.out.println("\nme voy a dormir soy "+getName());
				
				System.out.println("\nSoy " +getName()+ "despues de dormir: "+ tiempo);
		}
	}
	

}