package ch07.InsertionSort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InsertionSort {
    /**
     * 插入排序
     */
	public void insertSort(int[] array) {
		int size = array.length;
		int j;
		for(int i = 1; i< size; i++) {  //n-1趟扫描
			int tmp = array[i];  //将待插入的第i条记录暂存在tmp中
			for(j = i -1; j >= 0 && array[j] > tmp; j--) { 
                array[j+1] = array[j];  //将前面比tmp大的记录向后移动
		}
			array[j+1] = tmp;  //将tmp插入到第j+1的位置
	}//算法结束
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
