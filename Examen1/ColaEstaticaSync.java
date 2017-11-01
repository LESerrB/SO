public class ColaEstaticaSync{

    //ATRIBUTOS
   int []cola;
   int h;
   int t;
   
   //CONSTRUCTORES
   public ColaEstaticaSync(int max){
      cola = new int[max];
      h=t = -1;
   }
   
   //METODOS
	// Metodo que Inserta
   public synchronized void Push(String hilo,int num){
	   while (t == cola.length -1){
		   try{
			   wait();
		   } catch(InterruptedException e){}
	   }
      t++;		
      h++;
      cola[t] = num;
      System.out.println( "{" + hilo + "}=" + num);
      Listar();
      notifyAll();
   }

	//Metodo que elimina
   public synchronized int Pop(String hilo) {
      int aux;
      while(t<0){
	      try{
	    	  wait();
	      } catch(InterruptedException e){}
      }
      
      aux = cola[t];
      t--;
      System.out.println( "{" + hilo + "}=" + aux);
      Listar();
      notifyAll();
      return aux;
   }
   
   public void Listar(){
      int i;
      
      for(i=0; i<=t;i++){
         System.out.print("["+i+"] ="+cola[i]+"  ");
         //System.out.println("");
      }
    System.out.println("");
   }
}