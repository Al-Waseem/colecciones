package ejercicio2;
import java.util.*;

import javax.swing.JOptionPane;

public class Aplicacion {
	
	private LinkedList<Hijo> listaHijos;
	private ArrayList<Hijo> arrayHijos;
	
	
	Aplicacion(){
		
		arrayHijos = new ArrayList<Hijo>();
		listaHijos= new LinkedList<Hijo>();
		
		String msgMenu = "Elije una de las opciones:\n" +
				"1.- A�adir un hijo al Array\n" +
				"2.- A�adir un hijo a la lista\n" +
				"3.- Copiar los hijos del Array a la lista\n" +
				"4.- Borrar los hijos del Array que estan en la lista\n" +
				"5.- Borrar los hijos de la lista que no estan en el Array\n" +
				"6.- Borrar todos los hijos del Array\n" +
				"7.- Mostrar los Hijos\n" +
				"8.- Salir";
		
		int op;
		
		do{
		
			op = menus.CrearMenus.crearMenu(msgMenu, "Tareas", 8);
			
			switch(op){
			case 1:
				añadirHijoArray();
				break;
			case 2:
				añadirHijoLista();
				break;
			case 3:
				copiarHijos();
				break;
			case 4:
				borrarHijosArray();// borra los hijos del array que estan en la lista
				break;
			case 5:
				borrarHijoLista();// borra los hijos de la lista que no estan en el array
				break;
			case 6:
				borrarTodosHijos(listaHijos);
				borrarTodosHijos(arrayHijos);
			case 7:
				JOptionPane.showMessageDialog(null, "Listas de hijos \n\n" +
						""+ mostrarHijos(listaHijos) + "\n\n-----------\n\n" +
						""+mostrarHijos(arrayHijos) + "|n");
				break;
			case 8:
				System.exit(0);
				break;
			}
		}while(op != 7);
	}
	
	
	String mostrarHijos(Collection<Hijo> c){
		
		String losHijos="";
		Iterator<Hijo> it = c.iterator();
		while(it.hasNext()){
			losHijos += it.next().toString();
		}
		return losHijos;
	}


	void borrarTodosHijos(Collection<Hijo> c) {
		Iterator<Hijo> it = c.iterator();
		while(it.hasNext()){
			c.remove(it);
		}
	}


	void borrarHijoLista() {
		
		Iterator<Hijo> itArray = arrayHijos.iterator();
		
		Iterator<Hijo> itLista = listaHijos.iterator();
		
		while(itArray.hasNext()){
			int index = listaHijos.indexOf(itLista);
			for(int i=0; i<arrayHijos.size(); i++){
				if(listaHijos.get(index) != arrayHijos.get(i)){
					listaHijos.remove(index);
				}
			}
		}
	}


	void borrarHijosArray() {
		Iterator<Hijo> itArray = arrayHijos.iterator();
		Iterator<Hijo> itLista = listaHijos.iterator();
		
		while(itArray.hasNext()){
			int index = arrayHijos.indexOf(itArray);
			for(int i=0; i<listaHijos.size(); i++){
				if(arrayHijos.get(index) == listaHijos.get(i)){
					arrayHijos.remove(index);
				}
			}
		}
	}


	void copiarHijos() {
		
		Iterator<Hijo> it = arrayHijos.iterator();
		while(it.hasNext()){
			listaHijos.add(it.next());
		}
	}

	void añadirHijoLista() {
		String nom = entradadatos.EntradaDatosGrafica.pedirCadena("Nombre del hijo");
		int edad = entradadatos.EntradaDatosGrafica.pedirEntero("Su edad");
		listaHijos.add(new Hijo(nom, edad));
	}

	void añadirHijoArray() {
		String nom = entradadatos.EntradaDatosGrafica.pedirCadena("Nombre del hijo");
		int edad = entradadatos.EntradaDatosGrafica.pedirEntero("Su edad");
		arrayHijos.add(new Hijo(nom, edad));
	}

	public static void main(String[] args) {
		
		new Aplicacion();
		System.exit(0);
	}
}
