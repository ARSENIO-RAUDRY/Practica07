/**
Clase que tiene los constructores del objeto Tecnico,sus getters y setters heredados de la clase Operador, toString y trabaja.
@author Raudry_Rico_Emilio_Arsenio
@version 1.0
*/
public class Tecnico extends Operador{

    /**
     Constructor sin parametros heredado del Operador.
     */
    public Tecnico(){
	super();
    }
    /**
     Constructor con parametros heredado del Operador.
     @param nombre String con el nombre del Tecnico.
     */
    public Tecnico(String nombre){
	super(nombre);
    }

    /**
     Metodo toString con informacion del Tecnico.
     @return String con el nombre del Tecnico, marcando su puesto.
     */
    @Override
    public String toString(){
	return "Tecnico: " + this.getNombre();
    }

    /**
     Metodo que indica que el Tecnico anda en el jale.
     @return String con el mensaje de que anda jalando.
     */
    public String trabaja(){
	return "Ando jalando";
    }

}
