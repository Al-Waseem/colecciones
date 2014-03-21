package ejercicio4;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Empleado(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public Empleado(){
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}
	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	public boolean equals(Object objeto){
		boolean devolver = false;
		if (objeto.getClass().isInstance(new Empleado())){
			Empleado emple = (Empleado) objeto;
			if((this.sueldo == emple.getSueldo())){
				devolver = true;
			}
		}
		return devolver;
	}
	
	public int hashCode(){
		return (int) this.sueldo;
	}
	
	public String toString(){
		return "Nombre: " + this.nombre + " Sueldo: " + this.sueldo + "\n";
	}
}
