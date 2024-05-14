package ficheros.ej6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		// Creamos con String la variable linea
		String linea = "";

		// Creamos con String la variable linea texto
		String lineaTexto;

		// Creamos un array de String
		String[] lista = null;
		// Creamos array de int
		int[] listanum;

		// Creamos try para capturar el error del fichero
		try {

			// Creaamos objeto Buffered writer y le indicamos la ruta de donde va a escribir
			// el resultado
			BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ficheros\\ej6\\Ordenado.txt"));

			// Creamos objeto BufferedReader y le indicamos al ruta de donde va a leer
			BufferedReader br = new BufferedReader(new FileReader("src\\ficheros\\ej6\\Numeros.txt"));

			// Iniciamos linea de texto con la primera linea del documento
			lineaTexto = br.readLine();

			// Creamos bucle while que se terminara cuando no haya mas lineas para leer
			while (lineaTexto != null) {

				// Iniciamos lista con el resultado de la primera linea del documento quitando
				// los guiones medios
				lista = lineaTexto.split("-");
				listanum = new int[lista.length];
				for (int i = 0; i < lista.length; i++) {
					listanum[i] = Integer.valueOf(lista[i]);
				}
				Arrays.sort(listanum);

				for (int valor : listanum) {
					bw.write(valor + " ");
				}
				System.out.println(Arrays.toString(lista));
				bw.newLine();
				bw.flush();
				lineaTexto = br.readLine();
			}
			System.out.println(linea);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
