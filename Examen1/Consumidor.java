public class Consumidor extends Thread {
    
   ColaEstaticaSync cola;
    
    
	public Consumidor(String name ,  ColaEstaticaSync cola){
         this.cola = cola;
	     setName(name);
   }

   public void run() {
   
   	   System.out.println(cola.Pop(getName()));
   


   }
    
}