package ch03.DecimalConvert;

import java.util.Scanner;

import ch03.Stack.SqStack;
 //二进制数转化为十进制数
public class BinaryToDeci {
	 
	public static void main(String[] args) throws Exception {
		
		SqStack stack = new SqStack(100);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要转换的二进制：");
        
		//二进制数依次进栈
		while(sc.hasNextInt()) {
			stack.push(sc.nextInt());
		}
		stack.display();
		
		//二进制数依次转换，弹栈输出
		int sum = 0;
		int i = 0;
		while(!stack.isEmpty()) {
			sum += (Integer)stack.pop() * Math.pow(2, i);  // 
			i++;
		}
		
		System.out.println("转换为十进制为：" + sum);
			
	}
	
}
