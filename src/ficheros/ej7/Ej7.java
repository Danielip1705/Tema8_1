package ficheros.ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// Creamos scanner para leer los elementos
		Scanner sc = new Scanner(System.in);
		// Creamos ops con la variable int para elegir las opciones
		int ops;
		/// Creamos nombre y telefono con String para poder crear el objeto agenda
		String nombre, telefono;
		// Creamos objeto Agenda para poder crear mas objetos
		Agenda ag;

		// Creamos bucle do while
		do {

			// Imprimimos por consola el menu
			System.out.println(
					"1. Nuevo contacto.\n" + "2. Buscar por nombre.\n" + "3. Mostrar todos.\n" + "4. Salir.\n");
			// Escribimos la opcion que queremos
			ops = sc.nextInt();
			// Limpiamos buffer
			sc.nextLine();
			// Declaramos switch case teniendo en cuenta la opcion elegida por el usuario
			switch (ops) {
			// En el caso 1 añadiremos un nuevo objeto Agenda en la lista
			case 1:
				System.out.println("Inserte el nombre");
				nombre = sc.nextLine();
				System.out.println("Inserte el telefono");
				telefono = sc.nextLine();
				ag = new Agenda(nombre, telefono);
				AgendaArray.anyadirAgenda(ag);
				break;
			// En el caso 2 buscaremos en la lista el objeto por su nombre a encotrar
			case 2:
				System.out.println("Inserte el nombre a buscar");
				nombre = sc.nextLine();
				AgendaArray.buscarAgenda(nombre);
				break;
			// En el caso 3 guardaremos todos los elementos de la lista en un documento de
			// texto
			case 3:
				System.out.println("Guardando...");
				AgendaArray.guardarDatos();
				break;
			// En el caso 4 nos saldremos del programa
			case 4:
				System.out.println("Saliendo del programa");
				break;
			// Si el usuario no ha elegido ningun numero de los anteriores casos, le diremos
			// que la opcion selecionada no existe
			default:
				System.out.println("Esta opcion no existe");
			}
			// Nos saldramos de bucle si el usuario seleciona la opcion 4
		} while (ops != 4);
		// Cerramos scanner
		sc.close();
	}
}
