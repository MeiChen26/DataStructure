package ch07.SelectionSort;

/*
 * 选择排序。每一趟从带排序序列中选取最小的记录。
 */
public class SelectionSort {   
	public void selectSort(int[] array) {
		int size = array.length;  //数组的长度

        for(int i = 0; i < size - 1; i++) {  //n-1趟排序
        	    int min = i;   //设第i条关键字的记录最小
        	    for(int j = i + 1; j < size; j++) {  //在子序列中选择关键字值最小的记录
        	    	    if(array[j] < array[min])
        	    	    	    min = j;
        	    }
        	    if(min != i) {  //将本趟关键字最小的记录和第i条记录交换
        	    	    int temp = array[i];
        	    	    array[i] = array[min];
        	    	    array[min] = temp;
        	    	 
        	    }	    
        }

 }
}