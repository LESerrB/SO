class serie1 extends Thread{
	
	public void run(){

	int i;
	for(i=1; i <= 10; i++)
		System.out.println(getName() + ":  "+ i);

	
	}
}