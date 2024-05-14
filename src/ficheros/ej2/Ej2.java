package ficheros.ej2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Creamos el objeto escaner y las ademas variables para su uso
		Scanner sc;
		int num;
		int suma = 0;
		int i = 1;
		int media = 0;

		// Abrimos try para capturar el error del fichero
		try {
			// inicializamos el objeto para que lea el archivo de texto
			sc = new Scanner(new FileReader("src\\ficheros\\ej2\\Enteros.txt"));

			// creamos bulce while donde se terminara si no hay mas numeros para leer en el
			// documento
			while (sc.hasNextInt()) {

				// inicializamos a num con el numero encontrado
				num = sc.nextInt();

				// Guardamos la suma de los numeros que vayamos encontrando
				suma += num;
				// aumentamos el contador i
				i++;
			}
			// Inicializamos media con el resultado de la suma y el contador
			media = suma / i;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Imprimimos en consola la suma y la media
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
	}

}
