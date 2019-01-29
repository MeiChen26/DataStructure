package ch07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//冒泡排序
public class BubbleSort {	
    public void bubbleSort(int[] array) {
    	    int size = array.length;    //数组的长度
    	    int temp;
    	    boolean flag = true;    //是否交换的标记
    	    /*
    	     * 比较相邻的元素。如果第一个比第二个大，
    	     * 就交换他们两个。重复这个步骤n-1次。
    	     */
    	    for(int i = 1; i < size && flag; i++) {
    	    	    flag = false;
    	    	    for(int j = 0; j < size - i; j++) {

    	    	    	    if(array[j] > array[j+1]) {
    	    	    	    	    /*
    	    	    	    	     * 逆序时交换
    	    	    	    	     */
    	    	    	    	    temp = array[j];
    	    	    	    	    array[j] = array[j+1];
    	    	    	    	    array[j+1] = temp;
    	    	    	    	    flag = true;
    	    	    	    }
    	    	    }
    	    } 	   

    }
    
    /*
     * 从文件读入
     */
    public String readfile() throws IOException {
    	    File myfile = new File("paixu.txt");
    	    FileReader filereader = new FileReader(myfile);
    	    BufferedReader reader = new BufferedReader(filereader);
    	    String line;
    	    while((line = reader.readLine()) != null)
    	    	    return line;
    	    
    	    return null;
    }
    
}

    
 

