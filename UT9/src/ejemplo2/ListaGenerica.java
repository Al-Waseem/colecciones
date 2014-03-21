package ejemplo2;

import java.util.ArrayList;

public class ListaGenerica<T> {
	
	private String nombrePropio;
	private ArrayList <T> lista;
	
	public ListaGenerica(String nombrePropio){
		this.nombrePropio = nombrePropio;
		lista = new ArrayList<T>();
	}
	
	public void añadirObjetoT(T objetoT){
		lista.add(objetoT);
	}
	
	public int buscarObjetoT(T ObjetoT){
		return lista.indexOf(ObjetoT);
	}
	
	public void borrarObjetoT(T objetoT){
		int index = buscarObjetoT(objetoT);
		
		lista.remove(index);
	}
	
	public String devolverLosNombres(){
		String nombres="";
		
		for(int i =0; i<lista.size();i++){
			nombres += lista.get(i)+"\n";
		}
		
		return nombres;
	}

	/**
	 * @return the nombrePropio
	 */
	public String getNombrePropio() {
		return nombrePropio;
	}
	
	

}