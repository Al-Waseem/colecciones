package ejemplo4;

public class Alumno implements Comparable <Alumno>{
    private String nombre;
    private int edad;
    
    /* Constructores */
    public Alumno(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Alumno(){}
    
    /* Métodos para acceder a los valores de los atritutos */

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    /*Implementamos el método compareTo(..)  */
    public int compareTo(Alumno obj) {
        int devolver;
        //Comparar los nombres
        int comparacion = nombre.compareTo(obj.nombre);
        if (comparacion==0) {
            if (edad>obj.edad) {
                devolver = 1;
            }else{
                if (edad==obj.edad) {
                    devolver = 0;
                } else {
                    devolver = -1;
                }
            }
        } else {
            devolver = comparacion;
        }
        return devolver;
    }//Fin del método compareTo
    
    /* Método para devolver los datos de un alumno */
    public String  toString() {
        return "NOMBRE: " + nombre + "  EDAD: " + edad + "\n";
    }
}//Fin de la clase
