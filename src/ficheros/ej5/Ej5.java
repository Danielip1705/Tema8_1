package ficheros.ej5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String datos = "";
		BufferedWriter bw = null;
		File ruta = new File("src\\ficheros\\ej5\\datos.txt");
		try {

			bw = new BufferedWriter(new FileWriter(ruta, true));

			if (!ruta.exists()) {
				
				ruta.createNewFile();
			}
			System.out.println("Escriba su nombre y edad");

			datos = sc.nextLine();

			bw.newLine();

			bw.write(datos);

			bw.flush();

		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
