package ejemplo3;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JOptionPane;


public class Principal {
	// Atributo
	private HashSet<Alumno> conjunto;

	public Principal() {
		// Creamos el atributo
		conjunto = new HashSet<Alumno>();
		// Crear y a�adir los alumnos, algunos de ellos iguales
		crearAñadirAlumnos();

		//Visualizar los elementos del conjunto
		mostrarDatos();
		
	}

	//M�todo para mostrar los datos
	public void mostrarDatos(){
		Iterator<Alumno> iterador = conjunto.iterator();
		String cadena = "";
		Alumno alu;
		while (iterador.hasNext()) {
			alu = iterador.next();
			cadena += alu.toString();
		}
		JOptionPane.showMessageDialog(null, cadena);
	}
	
	// Crear y a�adir los alumnos
	public void crearAñadirAlumnos() {
		/* Creo varios alumnos, algunos iguales */
		Alumno alum1 = new Alumno("Pedro", 50);
		Alumno alum2 = new Alumno("Maria", 20);
		Alumno alum3 = new Alumno("Pedro", 40);
		Alumno alum4 = new Alumno("Pedro", 50);

		/* A�adimos los objetos al conjunto */
		conjunto.add(alum1);
		conjunto.add(alum2);
		conjunto.add(alum3);
		conjunto.add(alum4);
	}

	public static void main(String[] args) {
		// Crear el objeto
		new Principal();
		// Cerrar la aplicaci�n
		System.exit(0);

	}// Fin del main
}// Fin de la clase
