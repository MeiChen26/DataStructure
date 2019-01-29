package ch002;

public class reverseArray {
    public static void main(String[] args) {
		int result[] = {1,2,3,4,5,6,7};	
		reverse(result);
	}
    
    public static void reverse(int arr[]) {
    	    int i=0;
    	    int j= arr.length-1;
    	    while(i<j) {
    	    	    int temp = arr[i];
    	    	    arr[i] = arr[j];
    	    	    arr[j] = temp;
    	    	    i++;
    	    	    j--;
    	    }
    	    
    	    for(int a : arr)
    	        System.out.println(a);
    }
}
