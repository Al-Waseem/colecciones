package ejemplo2;


import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Aplicacion {
	
	ListaGenerica <String> nomLista;
	ListaGenerica <Character> charLista;
	
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
				añadirObj();
				break;
			case 2:
				String objetoParaBorrar = entradadatos.EntradaDatosGrafica.pedirCadena("Que nombre quieres borrar?");
				borrarObj(objetoParaBorrar);
				break;
			case 3:
				mostrarObjetos();
				break;
			case 4:
				System.exit(0);
			}//fin switch
			
	}while(op != 4); // fin do
		
}// fin Aplicacion
	
	void crearLista(){
		String nombreLista = entradadatos.EntradaDatosGrafica.pedirCadena("El nombre de la lista");
		nomLista = new ListaGenerica<String>(nombreLista);
	}
	
	void añadirObj(){
		String nom = entradadatos.EntradaDatosGrafica.pedirCadena("Escribe un nombre");
		nomLista.añadirObjetoT(nom);
	}
	
	void borrarObj(String nom){
		nomLista.borrarObjetoT(nom);
	}
	
	void mostrarObjetos(){
		
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
