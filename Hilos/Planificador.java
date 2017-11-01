class Planificador {

	public static void main(String[] args) {
		int tam, quantum, fin = 0, espacio, t_ejec = 0, num_proc = 0, t_ejecp = 0, t_espp = 0;
		double t_eject = 0.0, t_espt = 0.0;
		Proceso p, aux = null;
		ColaDinamica proclistos = new ColaDinamica();
		ColaCircular procejec;

		tam = Teclado.LeeEntero("\nTama\u00f1o de la memoria: ");
		procejec = new ColaCircular(tam);
		espacio = tam;
		quantum = Teclado.LeeEntero("Tama\u00f1o del Quantum: ");
//******************************************************************************************
	//SE VAN CREANDO, ORDENANDO Y AGREGANDO LOS PROCESOS A LA COLA DE PROCESOS LISTOS 
		while (fin != 1) {
			p = new Proceso();
			p.CapturaProceso();
			proclistos.Insertar(p);
			fin = Teclado.LeeEntero("Insertar otro Proceso? SI:0/ NO:1\t");
			num_proc++;
		}
		System.out.println("\n\t>>>>>>>>>Cola de procesos listos<<<<<<<<<\n");
		proclistos.Listar();
//******************************************************************************************
	//SE CARGAN UNO POR UNO LOS PROCESOS DE LA COLA DE PROCESOS LISTOS A LA COLA DE EJECUCION
		//PRIORIDAD COOPERATIVO
		while ( procejec.ValidaEspacio() == true && proclistos.GetH() != null ) {
			aux = proclistos.Borrar().GetInfo(); //EXTRAE EL SIGUIENTE PROCESO A EJECUTAR
			procejec.Insertar(aux);			//INSERTA EL PRIMER PROCESO EN LA COLA DE PROCESOS LISTOS PARA EJECUCUION
			espacio = espacio - aux.GetTamanio(); //RESTA EL TAMAÑO DEL PROCESO DEL TAMAÑO DE LA MEMORIA
			System.out.println ("\nSe cargo el proceso:" + aux.GetID() + "\t||Nombre: " + aux.GetNombre() + 
								"\t||Tama\u00f1o: " + aux.GetTamanio() + "\t||Restan: " + espacio + " de memoria");
			
			aux.LeeTInic(t_ejec);
			while ( aux.GetTiempo() != 0 ) {
				aux.ReduceTiempo();
				System.out.println("Restan: " + aux.GetTiempo() + " milisegundos de ejecucion");
				t_ejec++;
				System.out.println("Van: " + t_ejec + " milisegundos de ejecucion");
			}
			aux.LeeTFin(t_ejec);

			System.out.println("\nTermino el proceso " + aux.GetID() + " recuperando memoria...\n");
			espacio = espacio + aux.GetTamanio();//RECUPERA EL TAMAÑO DE MEMORIA UTILIZADA

			if ( espacio < aux.GetTamanio() ) { //SI LA MEMORIA ES INSUFICIENTE MANDA EL MENSAJE CORRESPONDIENTE
				System.out.println("\nEsperando a que se libere memoria...\n");
				proclistos.Insertar(aux);//REGRESA EL PROCESO A LA COLA DE PROCESOS LISTOS
				System.out.println("\nRestan\n\t>>>>>>>>>Cola de procesos listos<<<<<<<<<\n");
				proclistos.Listar();
			}
		}
//******************************************************************************************
		t_ejecp = procejec.TiempoEjec();
		t_espp = procejec.TiempoEsp();

		t_eject = (double)(t_ejecp/num_proc);
		t_espt = (double)(t_espp/num_proc);
		System.out.println("Tiempo de Ejecucion:" + t_eject);
		System.out.println("Tiempo de Espera:" + t_espt);
		
		/*System.out.println("\n\t>>>>>>>>>Cola de procesos Listos para Ejecucion<<<<<<<<<");
		procejec.Listar();*/
	}
}