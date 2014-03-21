package ejemplo1;

import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Aplicacion {
	
	ListaArray nomLista;
	
	Aplicacion(){

		//crear la lista
		crearLista();
		
		String opcionesTxt = "1. A�adir Nombre \n" +
				"2. Borrar Nombre\n" +
				"3. Mostrar Nombres \n" +
				"4. Salir";
		
		int op = menus.CrearMenus.crearMenu(opcionesTxt, "Lista de nombres", 4);
		
		do{
			
			switch (op){
			case 1:
				añadirNombre();
				break;
			case 2:
				String nombreParaBorrar = entradadatos.EntradaDatosGrafica.pedirCadena("Que nombre quieres borrar?");
				borrarNombre(nombreParaBorrar);
				break;
			case 3:
				mostrarNombres();
				break;
			case 4:
				System.exit(0);
			}//fin switch
			
	}while(op != 4); // fin do
		
}// fin Aplicacion
	
	void crearLista(){
		String nombreLista = entradadatos.EntradaDatosGrafica.pedirCadena("El nombre de la lista");
		nomLista = new ListaArray(nombreLista);
	}
	
	void añadirNombre(){
		String nom = entradadatos.EntradaDatosGrafica.pedirCadena("Escribe un nombre");
		nomLista.añadirNombre(nom);
	}
	
	void borrarNombre(String nom){
		nomLista.borrarNombre(nom);
	}
	
	void mostrarNombres(){
		
		String mostrar = nomLista.devolverLosNombres();
		
		JTextArea tabla = new JTextArea();
		tabla.setEditable(false);
		tabla.setText(mostrar);
		JScrollPane barra = new JScrollPane(tabla);
		JOptionPane.showMessageDialog(null, barra);
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Aplicacion();
		System.exit(0);
		
	}

}
