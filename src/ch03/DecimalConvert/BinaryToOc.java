package ch03.DecimalConvert;

import java.util.Scanner;

import ch03.Stack.SqStack;
 //二进制数转化为八进制数
public class BinaryToOc {
	 
	public static void main(String[] args) throws Exception {
		
		SqStack stack = new SqStack(100);
		SqStack result = new SqStack(100);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要转换的二进制：");     
		//二进制数依次进栈
		while(sc.hasNextInt()) {
			stack.push(sc.nextInt());
		}
		stack.display();	
		//二进制数依次转换，弹栈输出
		int len = stack.length();
		int count = 0;
		int sum = 0;
		for(int i = 0; i<len; i++) {
			sum += (Integer)stack.pop() * Math.pow(2, count);  
			count++; 
			if(count == 3 || stack.isEmpty()) {
				result.push(sum);
				count = 0;
				sum = 0;
			}		
		}
		
		System.out.print("转换为八进制为：" );
		result.display();
			
	}
	
}
