package ejercicio6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import ejercicio4.Empleado;

public class Aplicacion {
	
	private Collection<Empleado> empleados;

	Aplicacion(){
		
		empleados = new HashSet();
		
		String msgMenu = "1.- Aٌñdir un Empleado\n" +
				"2.- Listar en orden de entrada\n" +
				"3.- Borrar por nombre\n" +
				"4.- Borrar por indice\n" +
				"5.- Modificar por indice\n" +
				"6.- Insertar en una posiciَn\n" +
				"7.- Salir\n ";
		
		int opcion;
		
		do{
			
		
		opcion= menus.CrearMenus.crearMenu(msgMenu, "Gestion Empleados", 7);
		
		switch(opcion){
		case 1:
			aٌñdirEmpleado();
			break;
		case 2:
			OrdenarEmpleados();
			break;
		case 3:
			String nom = entradadatos.EntradaDatosGrafica.pedirCadena("El nombre del empleado que quieres borrar");
			borrarEmpleado(nom);// por el nombre
			break;
		case 4:
			int index = entradadatos.EntradaDatosGrafica.pedirEntero("El indice del empleado que quieres borrar");
			borrarEmpleado(index); // por el indice
			break;
		case 5:
			int in = entradadatos.EntradaDatosGrafica.pedirEntero("El indice del empleado que quieres borrar");
			modificarEmpleado(in);
			break;
		case 6:
			int inx = entradadatos.EntradaDatosGrafica.pedirEntero("En que posición quieres añadir al empleado");
			insertarEmpleado(inx);
			break;
		case 7:
			System.exit(0);
			
		}
		
		}while(opcion !=7);
		
		
	}
	
	private void OrdenarEmpleados() {

		Iterator<Empleado> it = empleados.iterator();
		String mostrar="";
		while(it.hasNext()){
			mostrar += it.next().toString();
		}
		
		JOptionPane.showMessageDialog(null, mostrar);
	}

	private void insertarEmpleado(int inx) {

		String nom = entradadatos.EntradaDatosGrafica.pedirCadena("Escribe el nombre del empleado");
		double sueldo = entradadatos.EntradaDatosGrafica.pedirDouble("El sueldo del empleado " + nom);
		
		ArrayList<Empleado> lista = new ArrayList<>(empleados);
		
		lista.add(inx, new Empleado(nom, sueldo));
		
		empleados.clear();
		empleados.addAll(lista);
		
		
	}

	private void modificarEmpleado(int index) {

		ArrayList<Empleado> lista = new ArrayList<>(empleados);
		
		String nomNuevo = entradadatos.EntradaDatosGrafica.pedirCadena("Escribe el nombre nuevo del empleado");
		double sueldoNuevo = entradadatos.EntradaDatosGrafica.pedirDouble("Escribe el sueldo nuevo del empleado");
		
		lista.get(index).setNombre(nomNuevo);
		lista.get(index).setSueldo(sueldoNuevo);
		
		empleados.clear();
		empleados.addAll(lista);
	}

	private void borrarEmpleado(int ind){
		
		// hay que convertir el HashSet a una lista para poder utilizar el indice de los elementos porque el HashSet no tiene orden
		
		ArrayList<Empleado> lista = new ArrayList<>(empleados);
		
		lista.remove(ind);// eleminar el elemento del indice
		empleados.clear(); // vaciar el HashSet de los empleados
		empleados.addAll(lista); // añadir los elementos finales de la lista al HashSet
		
	}

	private void borrarEmpleado(String nom) {

		Iterator<Empleado> it = empleados.iterator();
		
		if(it.hasNext()){
			if(it.next().getNombre() == nom){
				empleados.remove(it.next().getNombre());
			}
		}
	}

	private void aٌñdirEmpleado() {

		String nom = entradadatos.EntradaDatosGrafica.pedirCadena("Escribe el nombre del empleado");
		double sueldo = entradadatos.EntradaDatosGrafica.pedirDouble("El sueldo del empleado " + nom);
		
		empleados.add(new Empleado(nom,sueldo));
	}

	public static void main(String[] args) {
		
		new Aplicacion();
		
		System.exit(0);

	}

}
