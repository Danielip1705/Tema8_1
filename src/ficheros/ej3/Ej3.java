package ficheros.ej3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = null;
		String datos = "";
		
			try {
				
				bw = new BufferedWriter(new FileWriter("src\\ficheros\\ej3\\Alumnos.txt", true));

				System.out.println("Escriba el nombre del alumno");

				datos = sc.nextLine();

				bw.write(datos);
				bw.write(" ");

				System.out.println("Escriba la edad");

				datos = sc.nextLine();

				bw.write(datos);
				bw.write(" ");

				System.out.println("Escriba la altura");

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
