import java.util.Scanner;

public class MenuExamen {
	
   

	public static void main(String[] args) throws InterruptedException {
		 int tcola1; //Tama�o de la cola 1
		 int tcola2;  //Tama�o de la cola 2
		 int m; //Numero de Productores
		 int n; //Numero de Consumidores y Productores
		 int z; //Consumidores
		 Productor productores; //Arreglo de Productores
		 PC pc;//Arreglo de Productores y Consumidores
		 Consumidor consumidores;//Arreglo de consumidores
		
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		   
		   //Toma de valores
		   System.out.println("Ingrese el tama�o de la cola 1");
		   tcola1 = leer.nextInt();
		   System.out.println("Ingrese el tama�o de la cola 2");
		   tcola2 = leer.nextInt();
		   
		   System.out.println("Ingrese el numero de Productores");
		   m = leer.nextInt();   
		   System.out.println("Ingrese el numero de Consumidores y Productores");
		   n = leer.nextInt();
		   System.out.println("Ingrese el numero de Consumidores");   
		   z = leer.nextInt();
		   
		   //Se crea la Cola 1
		   ColaEstaticaSync cola1 = new ColaEstaticaSync(tcola1);
		   
		   //Se crea un arreglo de productores para tener objetos independientes

		   for(int i=0;i<m;i++){
			   
			   productores = new Productor("P"+(i+1),cola1);
			   productores.start();
			   productores.join();
			   
		   }
		   
		   //Se crea la cola 2
		   ColaEstaticaSync cola2 = new ColaEstaticaSync(tcola2);
		 //Se crea un arreglo de productores y consumidores para tener objetos independientes
		   for(int i=0;i<n;i++){
			   
			   pc = new PC("PC"+(i+1),cola1,cola2);
			   pc.start();
			   pc.join();
			   
		   }
		 //Se crea un arreglo de consumidores para tener objetos independientes
		 
		   for(int i=0;i<z;i++){
			   
			   consumidores = new Consumidor("C"+(i+1),cola2);
			   consumidores.start();
			   consumidores.join();
			   
		   }
		   
		   
		 

		   
	}

}
