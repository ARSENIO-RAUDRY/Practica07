/**
Clase que tiene los constructores del objeto Oficial,sus getters y setters heredados de la clase Operador, toString y trabaja.
@author Raudry_Rico_Emilio_Arsenio
@version 1.0
*/
public class Oficial extends Operador{
    /**
     Constructor sin parametros heredado del Operador.
     */
    public Oficial(){
	super();
    }
    /**
     Constructor con parametros heredado del Operador.
     @param nombre String con el nombre del Oficial.
     */
    public Oficial(String nombre){
	super(nombre);
    }

    /**
     Metodo toString con informacion del Oficial.
     @return String con el nombre del Oficial, marcando su puesto.
     */
    @Override
    public String toString(){
	return "Oficial: " + this.getNombre();
    }

    /**
     Metodo que indica que el Oficial esta trabajando.
     @return String con el mensaje de que trabaja.
     */
    public String trabaja(){
	return "Aqui trabaja";
    }

}
