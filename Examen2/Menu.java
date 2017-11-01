import java.util.Scanner;

public class Menu {

	public static void main(String[] args)throws InterruptedException {
		
		int m; //Numero de Productores
		int n; //Numero de Consumidores y Productores
		
		Numero [][]Matriz;
		Transpuesta [][]Matriz2;
		
		Scanner leer = new Scanner(System.in);

		//Toma de valores
		System.out.println("Ingrese el valor de m:");
		m = leer.nextInt();
		System.out.println("Ingrese el valor de n:");
		n = leer.nextInt();

		//Se inicializa la matriz y se crea dando valores random
		Matriz = new Numero[m][n];
		System.out.println("\n\t>>>>>>>>>>Matriz Original<<<<<<<<<<\n");

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				Matriz[i][j] = new Numero("P["+(i+1)+"]["+(j+1)+"] =" );
				Matriz[i][j].start();
				Matriz[i][j].join();
			}

			System.out.println();
		}

		//SE INICIALIZA LA MATRIZ TRANSPUESTA
		Matriz2 = new Transpuesta[m][n];
		System.out.println("\n\t>>>>>>>>>>Matriz Transpuesta<<<<<<<<<<\n");

		//Traspuesta de la Matriz
		for(int j=0; j<n; j++) {
			for (int i=0; i<m; i++) {
				Matriz2[i][j] = new Transpuesta("T["+(i+1)+"]["+(j+1)+"] =", Matriz[i][j].GetInfo());
				Matriz2[i][j].start();
				Matriz2[i][j].join();
			}

			System.out.println();
		}
	}

}
