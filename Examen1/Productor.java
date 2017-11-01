public class Productor extends Thread{
    
	ColaEstaticaSync cola;
	
	public Productor(String nombre, ColaEstaticaSync cola){
		this.cola = cola;
		setName(nombre);
	}
	public void run(){
		
			cola.Push(getName(),(int)(Math.random()*10));
		
		
	}
    
}