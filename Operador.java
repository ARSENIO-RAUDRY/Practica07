/**
Clase que tiene los constructores del objeto Operador, sus getters y setters heredados de la clase Empleado y toString.
@author Raudry_Rico_Emilio_Arsenio
@version 1.0
*/
public class Operador extends Empleado{

    /**
     Constructor sin parametros heredado del Empleado.
     */
    public Operador(){
	super();
    }

    /**
     Constructor con parametros heredado del Empleado.
     @param nombre String con el nombre del Operador.
     */
    public Operador(String nombre){
	super(nombre);
    }

    /**
     Metodo toString con informacion del Operador.
     @return String con el nombre del Operador, marcando su puesto.
     */
    @Override
    public String toString(){
	return "Operador: " + this.getNombre();
    }

}
