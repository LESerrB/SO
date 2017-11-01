class TablaAux extends Thread{
	private int tabla;
	private int i;

	public TablaAux(int t, int i){
		tabla = t;
		this.i = i;
	}

	public void run(){
		System.out.println(getName() + " : " + tabla + " x " + i + " = " + (tabla*i));
	}
}