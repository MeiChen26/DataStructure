package ch07.QuickSort;

public class QuickSort {
    public void quickSort(int arr[], int left, int right) {
    	    int index = partition(arr, left, right);
    	    if(left < index - 1) {
    	    	quickSort(arr, left, index - 1);
    	    }
    	    if(index < right) {
    	    	quickSort(arr, index, right);
    	    }
    }
    
    public int partition(int arr[], int left, int right) {
    	    int pivot = arr[(left + right) / 2];
    	    System.out.println("pivot是："+pivot);
    	    while(left <= right) {
    	    	    while(arr[left] < pivot)
    	    		    left++;
    	    	    while(arr[right] > pivot)
    	    	    	    right--;
    	    	    if(left <= right) {
    	    	    	    int temp = arr[left];
    	    	    	    arr[left] = arr[right];
    	    	    	    arr[right] = temp;
    	    	    	    left++;
    	    	    	    right--;
    	    	    }
    	    	
    	    }
    	    for(int a : arr) {
    	        System.out.print(a+" "); 
    	    }
    	    System.out.println();
    	    return left;
    }
    
    
}
