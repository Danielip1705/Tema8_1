package ficheros.ej2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc;
		int num;
		int suma = 0;
		int i = 1;
		int media = 0;

		try {
			sc = new Scanner(new FileReader("src\\ficheros\\ej2\\Enteros.txt"));

			while (sc.hasNextInt()) {
				num = sc.nextInt();
				suma += num;
				i++;
			}
			media = suma / i;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + media);
	}

}
