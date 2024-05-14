package ficheros.ej3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		// Creamos el objeto scanner
		Scanner sc = new Scanner(System.in);
		// Creamos un buffered writer e inicializamos a null
		BufferedWriter bw = null;
		// Creamos una varible string
		String datos = "";

		// Creamos try para capturar el error del fichero
		try {

			// Iniciamos el bufferedWriter con el documento
			bw = new BufferedWriter(new FileWriter("src\\ficheros\\ej3\\Alumnos.txt", true));

			// Imprimimos en consola que nos indique el alumno
			System.out.println("Escriba el nombre del alumno");

			// Escribimos los datos
			datos = sc.nextLine();

			// Escribimos en el documento los datos escritos anteriormente
			bw.write(datos);

			// Escribimos un espacio
			bw.write(" ");

			// Imprimimos en consola que nos indique la edad
			System.out.println("Escriba la edad");

			// Lo escribimos en datos
			datos = sc.nextLine();

			// Escribimos en el documento los datos escritos anteriormente
			bw.write(datos);

			// Escribimos un espacio
			bw.write(" ");

			// Imprimimos en consola que nos indique la altura
			System.out.println("Escriba la altura");

			// Lo escribimos en datos
			datos = sc.nextLine();

			// Escribimos en el documento los datos escritos anteriormente
			bw.write(datos);

			// Indicamos un salto de linea
			bw.newLine();

			// Vaciamos buffer
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
