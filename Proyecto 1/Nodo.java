class Nodo {

	//ATRIBUTOS
	private Proceso info;
	private Nodo sig;//Apunta al siguiente nodo

	//CONSTRUCTORES
	public Nodo(Proceso dato, Nodo sig) {
		info = dato;
		this.sig = sig;
	}

	//METODOS
	public void SetInfo(Proceso dato) {
		info = dato;
	}

	public void SetSig(Nodo sig) {
		this.sig = sig;
	}

	public Proceso GetInfo() {
		return info;
	}

	public Nodo GetSig() {
		return sig;
	}
}
