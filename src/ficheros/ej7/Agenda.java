package ficheros.ej7;

public class Agenda {

	String nombre = "";
	String telefono = "";

	public Agenda(String nombre, String telefono) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (telefono != null && !telefono.equals("")) {
			this.telefono = telefono;
		}
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Agenda ag = (Agenda) obj;

		if (this.nombre.equals(ag)) {
			igual = true;
		}
		return igual;
	}

	@Override
	public String toString() {
		String cad = "";
		cad += "Nombre: " + this.nombre + "\n";
		cad += "Telefono: " + this.telefono;
		
		return cad;
	}

}
