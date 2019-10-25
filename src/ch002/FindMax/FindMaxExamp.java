package ch002.FindMax;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxExamp {
	
	
	public static void main(String[] args) {
		FindMaxExamp obj = new FindMaxExamp();
	    
		Shape[] arr = obj.init();
	  
		System.out.println("数组中面积最大的是第"+obj.findMax(arr)+"个元素");
		
		//根据面积排序
		Arrays.sort(arr);
        obj.output(arr);
	}
	
	public Shape[] init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径");
		System.out.println("请输入正方形的边长");
		System.out.println("请输入长方形的宽和高");
		//初始化数组
		Shape[] sh1= {new Circle(sc.nextDouble()), new Square(sc.nextDouble()), new Rectangle(sc.nextDouble(), sc.nextDouble())};		
		return sh1;
	}
	/*
	 * 比较shape的面积
	 */
	public int findMax(Shape[] a) {
		int max = 0;
		for(int i=1;i<a.length;i++)
			if (a[i].compareTo(a[max])>0)
				max = i;
		
		return max+1;   //人性化下标
	}
	
	public void output(Shape[] arr) {
	    System.out.println("面积从小到大的排列顺序是：");
	    for (Shape shape : arr) {
		    System.out.println(shape+ " ");
	    }	
	}
}
         

