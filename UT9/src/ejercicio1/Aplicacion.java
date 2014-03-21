package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import menus.*;

public class Aplicacion {
	
	private ArrayList<Empleado> emp;
	
	Aplicacion(){
		
		String menu = "Elige una de las opciones: \n" +
				"1.- A�adir un empleado \n" +
				"2.- Borrar un empleado \n" +
				"3.- Mostrar lista de empleados \n" +
				"4.- Salir";
		
		emp = new ArrayList<Empleado>();
		
		int op;
		
		do{			
			op = menus.CrearMenus.crearMenu(menu, "Empleados", 4);
		
		switch(op){
			case 1:
				añadirEmpleado();
				break;
			case 2:
				borrarEmpleado();
				break;
			case 3:
				mostrarEmpleados();
				break;
			case 4:
				System.exit(0);
		}
		
		}while(op != 4);
		
		
	}
	


	void añadirEmpleado(){
		
		String nombre = entradadatos.EntradaDatosGrafica.pedirCadena("El nombre del empleado");
		int edad = entradadatos.EntradaDatosGrafica.pedirEntero("La edad del empleado: " + nombre);
		
		emp.add(new Empleado(nombre,edad));
				
	}
	
	void borrarEmpleado(){
		int edadBorrar = entradadatos.EntradaDatosGrafica.pedirEntero("Que edad quieres borrar");
		
		/*for(int i=0;i<emp.size();i++){
			if(emp.get(i).getEdad() < edadBorrar){
				emp.remove(i);
			}
		}*/
		
		Iterator<Empleado> it = emp.iterator();
		
		while(it.hasNext()){
			if (it.next().getEdad() < edadBorrar){
				//emp.remove(emp.indexOf(it.next()));
				it.remove();
			}
			
		}
		
	}
	
	void mostrarEmpleados() {
		

		String mostrarEmpleados="";
		

		for(int i=0;i<emp.size();i++){
			mostrarEmpleados += emp.get(i).getNombre() +" | "+ emp.get(i).getEdad() + "\n";
		}
				
		mostrarEmpleados += "Existen: " + emp.size() + " empleados";
		
		JOptionPane.showMessageDialog(null, mostrarEmpleados);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Aplicacion();
		
		System.exit(0);
		
	}

}
