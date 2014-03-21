package ejemplo1;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaArray {
	
	private String nombrePropio;
	private ArrayList <String> lista;
	
	public ListaArray(String nombrePropio){
		this.nombrePropio = nombrePropio;
		lista = new ArrayList<String>();
	}
	
	public void añadirNombre(String nombreAlumno){
		lista.add(nombreAlumno);
	}
	
	public int buscarNombre(String nombreBucado){
		return lista.indexOf(nombreBucado);
	}
	
	public void borrarNombre(String nombreAborrar){
		int index = buscarNombre(nombreAborrar);
		
		lista.remove(index);
	}
	
	public String devolverLosNombres(){
		String nombres="";
		
		for(int i =0; i<lista.size();i++){
			nombres += lista.get(i)+"\n";
		}
		
		return nombres;
	}
	
	public String devolverConIterator(){
		String listaTxt = "";
		
		Iterator<String> it = lista.iterator();
		
		while (it.hasNext()){
			listaTxt += it.next()+"\n";
		}
		
		return listaTxt;
	}

}
