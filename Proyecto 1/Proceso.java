import java.lang.Math;
class Proceso {

//ATRIBUTOS
	private int id;
	private int tamanio;
	private int tiempo;
	private int prioridad;
	private int t_inic;
	private int t_fin;
	private int ent = 0;
	private String nom;
	private static int global=0;
	
//METODOS
	public void CapturaProceso() {
		LeeID();
		System.out.println("\nDATOS DEL PROCESO id: "+GetID()+" =====================");
		LeeNom();
		LeeTamanio();
		LeeTiempo();
		prioridad = (int)(Math.random()*10);
	}
//********************************************************************************************
	public void LeeID() {
		global = global + 1;
		id = global;
	}
//********************************************************************************************
	public void LeeNom() {
		nom = Teclado.LeeCadena("\tNombre: ");
	}
//********************************************************************************************
	public void LeeTamanio() {
		tamanio = Teclado.LeeEntero("\tTama\u00f1o: ");
	}
//********************************************************************************************
	public void LeeTiempo() {
		tiempo = Teclado.LeeEntero("\tTiempo: ");
	}
//********************************************************************************************
	public void Listar() {
		System.out.print("ID: P"+id+"\t||\tNombre: "+nom+"\t||\tTama\u00f1o: "+tamanio+"\t||\tPrioridad: "+prioridad+"\n");
	}
//********************************************************************************************
	public int ReduceTiempo() {
		tiempo = --tiempo;
		return tiempo;
	}
//********************************************************************************************
	public int GetTamanio() {
		return tamanio;
	}
//********************************************************************************************
	public String GetID() {
		return ("P"+id);
	}
//********************************************************************************************
	public String GetNombre() {
		return nom;
	}
//********************************************************************************************
	public int GetTiempo() {
		return tiempo;
	}
//********************************************************************************************
	public void LeeTInic(int t) {
		t_inic = t;
		System.out.println("\nID: P"+id+"\t||Tiempo de inicio: "+t_inic);
	}
//********************************************************************************************
	public void LeeTFin(int t) {
		t_fin = t;
		System.out.println("\nID: P"+id+"\t||Tiempo de fin: "+t_fin);
	}
//********************************************************************************************
	public int GetTInic() {
		return t_inic;
	}
//********************************************************************************************
	public int GetTFin() {
		return t_fin;
	}
//********************************************************************************************
	public int Entradas() {
		ent++;
		return ent;
	}
//********************************************************************************************
	public int GetPrio() {
		return prioridad;
	}
}