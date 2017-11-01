
class Ejercicio6{
	
	public static void main(String []args){


	SaludoSleep s1 = new SaludoSleep(100);
	SaludoSleep s2 = new SaludoSleep(2000);
	SaludoSleep s3 = new SaludoSleep(4000);

	s1.start();
	s2.start();
	s3.start();

}
}
