package ficheros.ej6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		String linea = "";
		String lineaTexto;
		String[] lista = null;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ficheros\\ej6\\Ordenado.txt"));
			BufferedReader br = new BufferedReader(new FileReader("src\\ficheros\\ej6\\Numeros.txt"));
			lineaTexto = br.readLine();
			while (lineaTexto != null) {
				lista = lineaTexto.split("-");
				Arrays.sort(lista);
				for (String valor : lista) {
					bw.write(valor + " ");
					System.out.println(valor);
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
