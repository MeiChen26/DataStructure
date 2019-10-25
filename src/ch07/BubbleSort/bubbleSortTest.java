package ch07.BubbleSort;

import java.io.IOException;

public class bubbleSortTest {
    public static void main(String[] args) throws IOException {  
		BubbleSort tst = new BubbleSort();
		
		String result = tst.readfile(); //从文件读入到字符串
		String[] arrs = result.split(" ");  //字符串分割成字符串数组
		int[] array = new int[arrs.length];
		
		for(int i = 0; i < arrs.length; i++) {
			array[i] = Integer.parseInt(arrs[i]);
		}
		
		tst.bubbleSort(array);
		
		//显示排好序的数组
		for(int a : array)
			System.out.println(a);
		
	}
}
