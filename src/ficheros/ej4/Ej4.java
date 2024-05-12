package ficheros.ej4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;

		String datos = "";
		while (!datos.equalsIgnoreCase("fin")) {

			try {

				bw = new BufferedWriter(new FileWriter("src\\ficheros\\ej4\\Ejercicio 4", true));

				System.out.println("Inserte cualquier texto [Fin para terminar]");

				datos = sc.nextLine();

				bw.write(datos);

				bw.newLine();

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
