class SaludoSleep2 extends Thread {

	private int tiempo;

	//CONSTRUCTOR
	public SaludoSleep2(int t){

		tiempo = t;

	} 


	public void run(){




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