package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ej1Ficheros {

	public static void main(String[] args) {

		BufferedReader lec = null;
		int suma = 0;
		int contador=0;
		String linea = "";
		String[] a;
		try {
			lec = new BufferedReader(new FileReader("src\\ficheros\\NumerosReales.txt"));

			while ((linea = lec.readLine()) != null) {

				System.out.println(linea);
				a = linea.split(" ");
				System.out.println(Arrays.toString(a));
				for(int i =0;i<a.length;i++) {
					//parsear string a int y trabajar con ellos
					// con suma y contador
				}
			}

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
