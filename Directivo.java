/**
Clase que tiene los constructores del objeto Directivo, sus getters y setters heredados de la clase Empleado y toString.
@author Raudry_Rico_Emilio_Arsenio
@version 1.0
*/
public class Directivo extends Empleado{
    /**
     Constructor sin parametros heredado del Empleado.
     */
    public Directivo(){
	super();
    }

    /**
     Constructor con parametros heredado del Empleado.
     @param nombre String con el nombre del Directivo.
     */
    public Directivo(String nombre){
	super(nombre);
    }

    /**
     Metodo toString con informacion del Directivo.
     @return String con el nombre del Directivo, marcando su puesto.
     */
    @Override
    public String toString(){
	return "Directivo: " + this.getNombre();
    }

}
