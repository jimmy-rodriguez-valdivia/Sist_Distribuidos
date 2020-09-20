import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random numeroAletorio = new Random();
		int cantidadPaginas = 0;
		Scanner Teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese la cantidad en numero de paginas, puede elegir de 10, 100, 1k o 1M");
			cantidadPaginas = Teclado.nextInt();
		} while (cantidadPaginas != 10 && cantidadPaginas != 100 && cantidadPaginas != 1000
				&& cantidadPaginas != 1000000);
		System.out.println("La cantidad de Paginas registradas son:");
		System.out.println(cantidadPaginas);
		System.out.println();

		int fila = cantidadPaginas;
		int columna = cantidadPaginas;
		int Arreglo[] = new int[cantidadPaginas];
		int[][] matriz = new int[fila][columna];
		int[][] matrizU = new int[fila][columna];
		int SumaPrioridadColumna;

		for (fila = 0; fila < matriz.length; fila++) {
			for (columna = 0; columna < matriz[fila].length; columna++) {
				matriz[fila][columna] = numeroAletorio.nextInt(50 - 5 + 1) + 5;
			}
		}

		for (fila = 0; fila < matriz.length; fila++) {
			for (columna = 0; columna < matriz[0].length; columna++) {
				System.out.print(matriz[fila][columna] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Indique de que indice (x,y) desea obtener el Page Rank");
		int indicex = Teclado.nextInt();
		int indicey = Teclado.nextInt();
		double pageRank = 0;
		System.out.println();

		// ordenando matrices
		int mayor;
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				for (int x = 0; x < fila; x++) {
					for (int y = 0; y < columna; y++) {
						if (matriz[i][j] > matriz[x][y]) {
							mayor = matriz[i][j];
							matriz[i][j] = matriz[x][y];
							matriz[x][y] = mayor;
						}
					}
				}
			}
		}

		for (fila = 0; fila < matriz.length; fila++) {
			for (columna = 0; columna < matriz[0].length; columna++) {
				System.out.print(matriz[fila][columna] + "\t");
			}
			System.out.println();
		}

		int sumaColumnas = 0;
		for (fila = 0; fila < matriz[0].length; fila++) { // Filas
			sumaColumnas = 0;
			for (columna = 0; columna < matriz.length; columna++) { // Columnas
				sumaColumnas = sumaColumnas + matriz[columna][fila];
				matrizU[fila][columna] = (matriz[fila][columna] / sumaColumnas);
			}
			System.out.println("La suma de la Columna  es: " + sumaColumnas);
		}

		for (fila = 0; fila < matriz[0].length; fila++) { // Filas
			sumaColumnas = 0;
			for (columna = 0; columna < matriz.length; columna++) { // Columnas
				sumaColumnas = sumaColumnas + matriz[columna][fila];
				matrizU[fila][columna] = (sumaColumnas / matriz[fila][columna]);
			}
		}

		System.out.println();
		for (fila = 0; fila < matrizU.length; fila++) {
			for (columna = 0; columna < matrizU[0].length; columna++) {
				System.out.print(matrizU[fila][columna] + "\t");
			}
			System.out.println();
		}

		for (fila = 0; fila < matriz.length; fila++) {
			for (columna = 0; columna < matrizU[0].length; columna++) {
				if ((indicex != matriz[fila].length) && (indicey != matriz.length)) {
					pageRank = (1 - 0.86) + 0.86 * ((matriz[fila][columna]) / matrizU[fila][columna]);
				}
			}
		}
		System.out.println("El page Rank es: " + pageRank);

	}
}