package ficheros.ej1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ej1Ficheros {

	public static void main(String[] args) {

		// Creamos bufferedReader e inicializamos a null
		BufferedReader lec = null;
		// Creamos con la variable int suma
		int suma = 0;
		// Creamos con la variable int media
		double media = 0;
		// Creamos linea con string para que almacene la linea del txt
		String linea = "";
		// Creamos array con string para que los datos de la lina
		String[] datos;
		// Creamos try (siempre se creara un try ya que a la hora de crear BUFFR lanza
		// una excepcion)
		try {
			// Inicializamos el objeto del BuferredReader con la ruta del txt
			lec = new BufferedReader(new FileReader("src\\ficheros\\ej1\\NumerosReales.txt"));

			linea = lec.readLine();
			// Creamos while para que itere cada linea del txt, si no llegue al final se
			// ejecuta las siguientes instrucciones
			while (linea != null) {
				// Inicializamos el array con los datos de la primera linea separados por el
				// espacio
				datos = linea.split(" ");
				// Imprimimos array
				System.out.println(Arrays.toString(datos));
				// Creamos bucle for para recorrer el array
				for (int i = 0; i < datos.length; i++) {
					// Inicializamos suma con el valor del dato parseado a int
					suma += Integer.parseInt(datos[i]);

				}

				// Hacemos la media de suma
				media = suma / datos.length;

				// Imprimimios la suma
				System.out.println("Suma: " + suma);
				// Imprimimos la media
				System.out.println("Media: " + media);

				linea = lec.readLine();

			}
			// Cerramos BufferedReader
			lec.close();

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
