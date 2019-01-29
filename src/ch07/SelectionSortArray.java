package ch07;

import java.util.ArrayList;

public class SelectionSortArray {
	/*
	 * 选择排序
	 */
    public void selectSort(ArrayList<Integer> arr) {
    	   int size = arr.size();  //取数组的大小 
       for(int i = 0; i < size - 1; i++) {
    		   int min = i;    //设第i个记录的值最小
    		   for(int j = i+1; j < size; j++) {  //在子序列中找关键字最小的记录
    			   if(arr.get(min) > arr.get(j))
    				   min = j;
    		   }
    		   if(min != i) {    //将本趟关键字值最小的记录与第i条记录交换
    			   int temp = arr.get(i);
    			   arr.set(i, arr.get(min));
    			   arr.set(min, temp);
    		   }
    	   }
    }
}
