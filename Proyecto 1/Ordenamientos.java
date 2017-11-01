public class Ordenamientos {
	
	public ColaCircular v;
	public int i, j;

	private void auxcambiaDatos( ColaCircular v, int i, int j) {
        Proceso aux;
        aux = v[i];
        v[i] = v [j];
        v[j] = aux;
    }

    public void SortIntercambio( ColaCircular v, int h, int t) {
        for ( i=h; i<t; i++ )
            for ( j=i+1; j<=t; j++ )
                if ( v[i].Getinfo().GetPrio() > v[j].Getinfo().GetPrio() )
                    auxcambiaDatos(v,i,j);
        }
}