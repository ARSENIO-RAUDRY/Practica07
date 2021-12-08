/**
Clase que tiene los constructores del objeto Operador, sus getters y setters heredados de la clase Empleado y toString.
@author Raudry_Rico_Emilio_Arsenio
@version 1.0
*/
import java.util.Random;
public class Sort{
    /**
     Metodo que permite ordenar un arreglo por Bubblesort.
     @param array Arreglo con los numeros a ordenar.
     */
    public static void bubbleSort(int[] array){
	for(int i=0; i < array.length; i++){ //Iterador que permite recorrer todo el arreglo.
	    for(int j = 0; j < array.length - 1; j++){ //Iterador que permite recorrer a todo el arreglo, hasta poner el mayor al final de este
		if(array[j] > array[j+1]){ //Si el elemento actual del arreglo es mayor que su sucesor, estos se intercambian
		    int aux = array[j];
		    array[j] = array[j+1];
		    array[j+1] = aux;
		}
	    }
	}
    }
    /**
     Metodo que permite ordenar un arreglo por Quicksort.
     @param array Arreglo con los numeros a ordenar.
     @param izq Ultimo elemento a la izquierda del arreglo.
     @param der Ultimo elemento a la derecha del arreglo.
     */
    public static void quickSort(int[] array, int izq, int der){
	int i, d, pivote, aux;
	i=izq; //Establecemos indices derecho e izquierdo, que recorreran el arreglo.
	d=der;
	pivote=array[(izq+der)/2]; //Obtenemos el valor del pivote para comparar.
	do{ //Comparamos cada elemento con el pivote.
	    while(array[i]<pivote) //Si el elemento izquierdo es menor que el pivote, se mueve al otro, si no se detiene.
		i++;
	    while(array[d]>pivote) //Si el elemento derecho es mayor que el pivote, se mueve al otro, si no se detiene.
		d--;
	
	    if(i<=d){ //Intercambio de elementos que no correspondan con sus respectivos lado derecho(mayor) a izquierdo(menor).
	    aux=array[i];
	    array[i]=array[d];
	    array[d]=aux;
	    i++; //Como ya estan en el correcto lado, se recorren ambos al siguiente.
	    d--;
	}
	}while(i<=d);//Se paran las comparaciones cuando d sobrepasa a i, encontrandose justo a lado del pivote.
	
	if(izq<d){ //Como d es ahora menor que i, es el elmento que se encuentra a la izquierda del pivote.
	    quickSort(array,izq,d);
	}
	if(i<der){ //Como i es ahora mayor que d, es el elmento que se encuentra a derecha del pivote.
	    quickSort(array,i,der);
	}
    }

    /**
     Metodo main que permite ejecutar los bubble y quicksort.
     @param args String de inicio.
     */ 
    public static void main(String [] args){
	int [] lista = new int[100000]; //Creacion del primer arreglo con 100,000 numeros.
	int [] lista2 = new int[100000]; //Creacion del segundo arreglo con 100,000 numeros.
        Random rmd = new Random(); //Creamos un objeto random para crear nuestros numeros.

	//Bubblesort
	System.out.println("\n\n=====Arreglo DESORDENADO:=====");
	for(int i=0;i<lista.length; i++){ //Asignacion de los numeros aleatorios
	    lista[i]=rmd.nextInt(500000); 
	}

	for(int i=0;i<lista.length; i++){//Imprime todo el primer arreglo.
	    System.out.print(lista[i]+" ");
	}

	System.out.println("\n\n=====Arreglo ORDENADO con Bubblesort:=====");

	bubbleSort(lista);//Llamada a la ejecucion de bubbleSort

	for(int i=0;i<lista.length; i++){//Imprime todo el arreglo ya ordenado.
	    System.out.print(lista[i]+" ");
	}

	//Quicksort
	System.out.println("\n\n=====Arreglo DESORDENADO:=====");
	for(int i=0;i<lista2.length; i++){//Asignacion de los numeros aleatorios.
	    lista2[i]=rmd.nextInt(500000);
	}

	for(int i=0;i<lista2.length; i++){//Imprime todo el segundo arreglo.
	    System.out.print(lista2[i]+" ");
	}

	System.out.println("\n\n=====Arreglo ORDENADO con Quicksort:=====");

	quickSort(lista2,0,lista2.length-1);//Llamada a la ejecucion de quickSort.

	for(int i=0;i<lista2.length; i++){//Imprime todo el segundo arreglo ya ordenado.
	    System.out.print(lista2[i]+" ");
	}

	System.out.println("\n");
    }
}
