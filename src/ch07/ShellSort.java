package ch07;

public class ShellSort {
    public void shellSort(int[] d, int[] array) {
    	    int size = d.length;
    	    
    	    int i, j;
    	    for(int k = 0; k < size; k++) {
    	    	    int dk = d[k];
    	    	    for(i = dk; i < array.length; i++) {
    	    	    	    int temp = array[i];
    	    	    	    for(j = i -dk; j >= 0 && temp < array[j]; j -= dk) {
    	    	    	    	    array[j+dk] = array[j];
    	    	    	    }
    	    	    	    array[j+dk] = temp;
    	    	    	  
    	    	    }  
    	    	    for(int a : array) {
    	    	    	    	    System.out.print(a+" ");
    	    	   }    
    	    	    	    System.out.println();
    	    	    
    	    }
    }
    
}
