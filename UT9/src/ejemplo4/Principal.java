package ejemplo4;

import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        /* Creamos varios alumnos algunos iguales en nombre y edad */
        Alumno al1 = new Alumno("Ponci", 60);
        Alumno al2 = new Alumno("Nieves", 60);
        Alumno al3 = new Alumno("Ponci", 60);
        Alumno al4 = new Alumno("Nieves", 58);
        Alumno al5 = new Alumno("Ponci", 60);
        Alumno al6 = new Alumno("Nieves", 60);
        Alumno al7 = new Alumno("Nieves", 42);
        Alumno al8 = new Alumno("Dolores", 50);
        Alumno al9 = new Alumno("Ponci", 45);
        Alumno al10 = new Alumno("Jesús", 45);
        Alumno al;
        
        /* Creamos la colección TreeSet */
        TreeSet<Alumno> coleccion = new TreeSet<Alumno>();
        
        /*Añadimos los alumnos a la colección  */
        coleccion.add(al1);
        coleccion.add(al2);
        coleccion.add(al3);
        coleccion.add(al4);
        coleccion.add(al5);
        coleccion.add(al6);
        coleccion.add(al7);
        coleccion.add(al8);
        coleccion.add(al9);
        coleccion.add(al10);
        
        /*Creamos el iterador para poder recorrer la colección  */
        String cadena = "";
        Iterator<Alumno> iterador = coleccion.iterator();
        while (iterador.hasNext()) {
            al =(Alumno) iterador.next();
            cadena +=al.toString();
        }
        JOptionPane.showMessageDialog(null, cadena);
    }//Fin del método main
}//Fin de la clase
