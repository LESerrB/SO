class ColaCircular {

//ATRIBUTOS
	private int T;
	private int H;
	private Proceso []colacir;
	private int k, j;

//CONSTRUCTOR
	public ColaCircular(int max) {
		colacir = new Proceso [max];
		H = T = -1;
	}

//METODOS
	public boolean ValidaEspacio() {
		return !((H == 0 && T == colacir.length-1) || (T+1 == H));
	}
//********************************************************************************************
	public void Insertar(Proceso dato) {

		if (T == -1)
			H++;
		else

			if (T == colacir.length-1)
				T = -1;
		
		T++;
		colacir[T] = dato;	
	}
//********************************************************************************************
	public void Listar() {
		int i;

		if (H <= T)
			for(i = H; i <= T; i++)
				System.out.println ( "Id: "+colacir[i].GetID()+
									 "\t||\tNombre: "+colacir[i].GetNombre()+
									 "\t||\tTama\u00f1o: "+colacir[i].GetTamanio()+
									 "\t||\tPrioridad: "+colacir[i].GetPrio() );
		else{
			for (i = H; i < colacir.length; i++)
				System.out.println ( "Id: "+colacir[i].GetID()+
									 "\t||\tNombre: "+colacir[i].GetNombre()+
									 "\t||\tTama\u00f1o: "+colacir[i].GetTamanio()+
									 "\t||\tPrioridad: "+colacir[i].GetPrio() );
			for(i = 0; i <= T; i++)
				System.out.println ( "Id: "+colacir[i].GetID()+
									 "\t||\tNombre: "+colacir[i].GetNombre()+
									 "\t||\tTama\u00f1o: "+colacir[i].GetTamanio()+
									 "\t||\tPrioridad: "+colacir[i].GetPrio() );
		}	
	}
//********************************************************************************************
	public boolean ValidaVacio() {
		return (H == -1);
	}
//********************************************************************************************
	public Proceso Borrar() {
		Proceso aux = colacir[H];

		if (H == T)
			H = T = -1;
		else

			if (H == colacir.length-1)
				H = T;
			else
				H++;

		return aux;	
	}
//********************************************************************************************
	public int TiempoEjec() {
		int i;
		int tejec = 0;

		if (H <= T)
			for(i = H; i <= T; i++)
				tejec = tejec + colacir[i].GetTFin();
		else {
			for (i = H; i < colacir.length; i++)
				tejec = tejec + colacir[i].GetTFin();
			for(i = 0; i <= T; i++)
				tejec = tejec + colacir[i].GetTFin();
		}
		return tejec;
	}
//*******************************************************************************************
	public int TiempoEsp() {
		int i;
		int tesp = 0;

		if (H <= T)
			for(i = H; i <= T; i++)
				tesp = tesp + colacir[i].GetTInic();
		else {
			for (i = H; i < colacir.length; i++)
				tesp = tesp + colacir[i].GetTInic();
			for(i = 0; i <= T; i++)
				tesp = tesp + colacir[i].GetTInic();
		}
		return tesp;
	}
//*******************************************************************************************
	private void auxcambiaDatos( int k, int j ) {
        Proceso aux;
        aux = colacir[k];
        colacir[k] = colacir[j];
        colacir[j] = aux;
    }
//*******************************************************************************************
    public void SortIntercambio() {
        for ( k=H; k<T; k++ )
            for ( j=k+1; j<=T; j++ )
                if ( colacir[k].GetPrio() < colacir[j].GetPrio() )
                    auxcambiaDatos(k,j);
        }
}