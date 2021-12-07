public class Sort{

    public static void bubbleSort(int[] array){
	for(int i=0; i < array.length; i++){
	    for(int j = 0; j < array.length - 1; j++){
		if(array[j] > array[j+1]){
		    int aux = array[j];
		    array[j] = array[j+1];
		    array[j+1] = aux;
		}
	    }
	}
    }

    //    public static void quickSort(long[] array){    }

    /*
    public static void main(String [] args){
	int [] lista = {5,3,6,1,8,7,2,4};
	for(int i = 0; i<lista.length; i++){
	    System.out.println(lista[i]);
	}
	bubbleSort(lista);
		for(int i = 0; i<lista.length; i++){
	    System.out.println(lista[i]);
	}
	
    }*/
}
