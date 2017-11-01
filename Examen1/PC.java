public class PC extends Thread {
    
   ColaEstaticaSync cola1,cola2;
    
    
	public PC(String name ,  ColaEstaticaSync cola1,ColaEstaticaSync cola2){
         this.cola1 = cola1;
         this.cola2 = cola2;
	     setName(name);
   }

   public void run() {
 
   		int aux;
   	   aux = cola1.Pop(getName());
   	   
       
       cola2.Push(getName(),aux);
       
     


   }
    
}