package ficheros.ej7;

public class Agenda {

	/**
	 * Cadena nombre que contendra el nombre del contacto de la agenda
	 */
	String nombre = "";
	/**
	 * Cadena que contiene el telefono del contacto de la agenda
	 */
	String telefono = "";

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre   Cadena que contendra el nombre del contacto dde la agenda
	 * @param telefono Cadena que contendra el telefono del contacto de la agenda
	 */
	public Agenda(String nombre, String telefono) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (telefono != null && !telefono.equals("")) {
			this.telefono = telefono;
		}
	}

	/**
	 * Get que muestra el nombre del objeto Agenda
	 * 
	 * @return Cadena que contiene el nombre del contacto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Get que muestra el telefono del objeto Agenda
	 * 
	 * @return Cadena que contiene el telefono del objeto Agenda
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Funcion que compara objetos de la clase Agenda por su nombre
	 */
	@Override
	public boolean equals(Object obj) {
		boolean igual = false;
		Agenda ag = (Agenda) obj;

		if (this.nombre.equals(ag)) {
			igual = true;
		}
		return igual;
	}

	/**
	 * Funcion que muestra los datos del objeto
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "Nombre: " + this.nombre + "\n";
		cad += "Telefono: " + this.telefono;

		return cad;
	}

}
