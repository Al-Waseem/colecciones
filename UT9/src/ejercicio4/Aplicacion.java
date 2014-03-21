package ejercicio4;

import java.util.HashSet;

import javax.swing.JOptionPane;

public class Aplicacion {
	
	private HashSet<Empleado> empleados;
	
	Aplicacion(){
		
		Empleado emple1 = new Empleado("Was", 3333);
		Empleado emple2 = new Empleado("Was", 3335);
		Empleado emple3 = new Empleado("Roberto", 3213);
		Empleado emple4 = new Empleado("José", 3443);
		Empleado emple5 = new Empleado("Was", 36653);
		Empleado emple6 = new Empleado("Was", 3335);
		Empleado emple7 = new Empleado("Fer", 36653);
		
		
		
		empleados = new HashSet();
		
		
		empleados.add(emple1);
		empleados.add(emple2);
		empleados.add(emple3);
		empleados.add(emple3);
		empleados.add(emple4);
		empleados.add(emple5);
		empleados.add(emple6);
		empleados.add(emple7);
		
		
		String mostrar="";
		

		
		JOptionPane.showMessageDialog(null, mostrar);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Aplicacion();
		System.exit(0);

	}

}
