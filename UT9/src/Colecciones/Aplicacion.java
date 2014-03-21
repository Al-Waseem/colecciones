package Colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Aplicacion {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		for(int i=0;i<1e5; i++){
			arrayList.add(i);
			linkedList.add(i);
		}
		
		
		
		calcularTiempo("ArrayList", arrayList);
		calcularTiempo("LinkedList", linkedList);
	}
	
	public static void calcularTiempo(String tipo, List lista){
		
		long empezar = System.currentTimeMillis();
		
		for (int i = 0; i < 1E5; i++) {
			lista.add(i);
			lista.add(0,i);
		}
		
		long terminar = System.currentTimeMillis();
		
		System.out.println(terminar-empezar + " millisegondos para " + tipo);
		
	}

}
