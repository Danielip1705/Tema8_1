package ficheros.ej4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		// Creamos objeto scanner
		Scanner sc = new Scanner(System.in);

		// Creamos objeto BufferedWriter e inicializamos a null
		BufferedWriter bw = null;

		// Creamos variable datos e inicializamos a cadena vacia
		String datos = "";

		// Creamos bucle while donde se ejecutara las instrucciones hasta que se escriba
		// fin
		while (!datos.equalsIgnoreCase("fin")) {

			// Iniciamos try para captrar los error del fichero
			try {

				// Iniciamos el bufferedWriter para escribir en la ruta especificada
				bw = new BufferedWriter(new FileWriter("src\\ficheros\\ej4\\Ejercicio 4", true));

				// Imprimimos en consola que nos inserte texto y fin para terminar el bucle
				System.out.println("Inserte cualquier texto [Fin para terminar]");

				// Escribimos datos
				datos = sc.nextLine();

				// Escribimos en el documento el resultado de dato
				bw.write(datos);

				// Salto de linea
				bw.newLine();

				// Limpiamos buffer
				bw.flush();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
