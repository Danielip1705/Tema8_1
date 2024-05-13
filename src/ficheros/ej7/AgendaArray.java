package ficheros.ej7;

import java.util.ArrayList;

public class AgendaArray {

	public static ArrayList<Agenda> listaAgenda = new ArrayList<Agenda>(20);

	// Funcion para mostrar las agendas registradas
	public static void listadoAgenda() {
		for (Agenda valor : listaAgenda) {
			if (valor != null) {
				System.out.println(valor);
			}
		}
	}

	public static boolean anyadirAgenda(Agenda ag) {
		boolean anyadido = false;

		if (listaAgenda.contains(ag)) {
			listaAgenda.add(ag);
			anyadido = true;
		}

		return anyadido;
	}
}
