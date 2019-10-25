package ch03.DecimalConvert;

import java.util.Scanner;
import java.util.Stack;

public class BinaryToDecimal {
	public static void main(String[] args) throws Exception {
		Stack<Integer> stack = new Stack<Integer>();
		BinaryToDecimal tst = new BinaryToDecimal();
		tst.Init(stack);
		tst.Change(stack);
	}

	/*
	 * 从键盘输入要转换的二进制数，依次入栈
	 */
	public void Init(Stack<Integer> stack) throws Exception {	
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要转换的二进制数：");
		while (sc.hasNextInt()) {
			stack.push(sc.nextInt());
		}
	}
	/*
	 * 二进制数转换为十进制数
	 */
	public void Change(Stack<Integer> stack) {
		int sum = 0;
		int i = 0;
		while (!stack.isEmpty()) {
			sum += (Integer) stack.pop() * Math.pow(2, i); 
			i++;
		}
		System.out.println("转换为十进制为：" + sum);
	}
}
