package ficheros.ej7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AgendaArray {

	/**
	 * Creamos arrayList que contedra objetos de la clase Agenda de tamaño 20s
	 */
	public static ArrayList<Agenda> listaAgenda = new ArrayList<Agenda>(20);

	/**
	 * Funcion que añade un objeto agenda a la lista
	 * 
	 * @param ag Objeto Agenda creado
	 * @return booleano true o false, dependiando si se ha añadido o no a la lista
	 */
	public static boolean anyadirAgenda(Agenda ag) {
		boolean anyadido = false;

		if (!listaAgenda.contains(ag)) {
			listaAgenda.add(ag);
			anyadido = true;
		}

		return anyadido;
	}

	/**
	 * Funcion que busca un objeto en concreto de la lista por su nombre
	 * 
	 * @param nombre cadena que contiene el nombre a buscar en la lista
	 */
	public static void buscarAgenda(String nombre) {

		for (Agenda valor : listaAgenda) {

			if (valor.nombre.equals(nombre)) {
				System.out.println(valor);
			}
		}
	}

	/**
	 * Funcion que muestra todos los objetos de la lista
	 */
	public static void listadoAgenda() {
		for (Agenda valor : listaAgenda) {
			if (valor != null) {
				System.out.println(valor);
			}
		}
	}

	/**
	 * Funcion que guarda todos los objetos de la lista a un documento de texto
	 */
	public static void guardarDatos() {
		String dato = "";
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("src\\ficheros\\ej7\\Contactos.txt"));

			for (Agenda valor : listaAgenda) {
				dato = valor.getNombre();
				bw.write("Nombre: " + dato + " ");
				dato = valor.getTelefono();
				bw.write("telefono : " + dato);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}