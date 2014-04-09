       package ejemplo3;

public class Alumno {
	/* Atributos */
	private String nombre;
	private int edad;

	/* Constructores */
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Alumno() {
	}

	/* M�todos de acceso */
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	/*
	 * Definimos cuando dos objetos Alumno son iguales, sobreescribimos el
	 * m�todo equals
	 */
	public  boolean equals(Object alum2) {
	        boolean devolver = false;
	        if (alum2.getClass().isInstance (new Alumno())) {
	        	
				Alumno alu=(Alumno)alum2;
				if ((nombre.equals(alu.getNombre()) && (edad==alu.getEdad()))) {
	            devolver = true;        
				}
	        }
	        return devolver;
	    }

	/* Asignamos el c�digo hash al objeto */
	public int hashCode() {
		return nombre.hashCode() + edad;
		
	}

	/* M�todo para visualizar un alumno */
	public String toString() {
		return "Nombre: " + nombre + "  Edad: " + edad + "\n";
		
	}
}// Fin de la clase
