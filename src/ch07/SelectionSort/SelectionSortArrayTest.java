package ch07.SelectionSort;

import java.util.ArrayList;

public class SelectionSortArrayTest {
    public static void main(String[] args) {
		SelectionSortArray tst = new SelectionSortArray();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		/*
		 * 初始化数组，添加随机数
		 */
		int maxsize = 1000;
		for(int i = 0; i < maxsize; i++) {	
			arr.add((int)(Math.random()*100));
		}
		tst.selectSort(arr);
		
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
