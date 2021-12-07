/**
Clase que tiene los constructores del objeto Empleado, al igual que sus respectivos getters, setters, toString y equals.
@author Raudry_Rico_Emilio_Arsenio
@version 1.0
*/

public class Empleado{
    //Nombre del empleado.
    private String nombre;

    /**
     Constructor sin parametros del objeto empleado.
     Tiene el nombre del empleado.
     */
    public Empleado(){
	this.nombre = "Uriel";
    }

    /**
     Constructor con parametros del objeto empleado.
     @param  nombre Nombre del empleado.
     */
    public Empleado(String nombre){
	this.nombre = nombre;
    }

    /**
     Modifica el nombre del empleado.
     @param nombre String con el nuevo nombre del empleado.
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     Devuelve el nombre del empleado.
     @return String con el nombre del empleado.
     */
    public String getNombre(){
	return this.nombre;
    }

    /**
     Metodo toString con informacion del empleado.
     @return String con el nombre del empleado, marcando su puesto.
     */
    public String toString(){
	return "Empleado: " + this.nombre;
    }
    /**
     Metodo equals que permite saber si dos empleados son iguales.
     @param empleado Objeto que recibira para saber si es identico.
     @return boolean que indica si son objetos identicos o no.
     */
    public boolean equals(Object empleado){
	Empleado em = (Empleado) empleado;
	boolean r = true;
	r = r && this.nombre.equals(em.getNombre());
	return r;
    }
}
