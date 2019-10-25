package ch07;

import ch07.BubbleSort.BubbleSort;
import ch07.HeapSort.HeapSort;
import ch07.InsertionSort.InsertionSort;
import ch07.QuickSort.QuickSort;
import ch07.SelectionSort.SelectionSort;

public class Exercise7_4_3 {
	/*
	 * 测试每一种排序的运行速度
	 */
    public static void main(String[] args) {
    	
    	    Exercise7_4_3 tst = new Exercise7_4_3();
    	    
    	    int[] array = tst.init();
    	    tst.run(array); 
	}
    //1.初始化
    public int[] init() {
    	    int maxsize = 100000;
		int[] array = new int[maxsize];
    	    for(int i = 0; i < maxsize; i++) {  	    	   
    	        array[i] = (int)(Math.random() * maxsize);  //生成随机数
    	    	    //array[i]= i;
    	    	    //array[i] = maxsize - i;
    	    }
    	    return array;
    }
    
    public void run(int[] array) {
    	    System.out.println("冒泡排序所需时间：" + testSortTime(array,'b') + "毫秒");
  	    System.out.println("直接插入排序所需时间：" + testSortTime(array, 's') + "毫秒");
  	    System.out.println("选择排序所需时间：" + testSortTime(array, 'i') + "毫秒");
  	  System.out.println("堆排序所需时间：" + testSortTime(array, 'h') + "毫秒");
  	System.out.println("快速排序所需时间：" + testSortTime(array, 'q') + "毫秒");
    }
    
    public long testSortTime(int[] array, char sortmethod) {
      	
    	    BubbleSort bs = new BubbleSort();
      	SelectionSort select = new SelectionSort();
      	InsertionSort insert = new InsertionSort();
      	HeapSort hsort = new HeapSort();
      	QuickSort qsort = new QuickSort();
      	
      	/*
      	 * 定义起始时间
      	 */
    	    long startTime, endTime, testTime;
    	    startTime = System.currentTimeMillis();
    	    
    	    
    	    switch(sortmethod) {
    	        case 'b': bs.bubbleSort(array);
    	                  break;
    	        case 's': insert.insertSort(array);
    	                  break;
    	        case 'i': select.selectSort(array);
    	        case 'h': hsort.heapSort(array);
    	        case 'q': qsort.quickSort(array, 0, array.length - 1);

    	    }
    	    
    	    endTime = System.currentTimeMillis();
    	    testTime = endTime - startTime;
    	    
    	    return testTime;
    }
}
