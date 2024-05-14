package ficheros.ej5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		// Creamos objeto scanner
		Scanner sc = new Scanner(System.in);

		// Creamos con String datos e inicializamos a cadena vacia
		String datos = "";

		// Creamos bufferedWriter e inicializamos a null
		BufferedWriter bw = null;

		// Creamos objeto file e inicalizamos con una ruta donde estara (o creara) un
		// documento de texto
		File ruta = new File("src\\ficheros\\ej5\\datos.txt");

		// Creamos try para captura el error del fichero
		try {

			// Declaramos con if que si la ruta no existe
			if (!ruta.exists()) {
				// Se crea
				ruta.createNewFile();
			}

			// Inicalizos el buffuered writer para escribbir en el documento de una "Ruta"
			// especificada
			bw = new BufferedWriter(new FileWriter(ruta, true));

			// Imprimimos en consola que nos inserte el nombre y la edad
			System.out.println("Escriba su nombre y edad");

			// Escribimos datos
			datos = sc.nextLine();

			// Escribimos los datos en el documento
			bw.write(datos);

			// Limpiamos el buffer
			bw.flush();

		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
