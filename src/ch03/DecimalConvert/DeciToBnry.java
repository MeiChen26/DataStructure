package ch03.DecimalConvert;

import java.util.Scanner;
import java.util.Stack;

public class DeciToBnry {
    public Stack convertDToB(int decimal) {
    	Stack stack = new Stack();
    	while(decimal != 0) {
    		stack.push(decimal % 2);
    		decimal /= 2;
    	}
    	return stack;
    }
    
    public static void main(String[] args) {
    	System.out.println("请输入一个十进制数");
    	Scanner sc = new Scanner(System.in);
    	DeciToBnry test = new DeciToBnry();
    	int input = sc.nextInt();
    	Stack stack = test.convertDToB(input);
    	System.out.println("对应的二进制数为");
    	while(!stack.isEmpty()) {
    		System.out.print(stack.pop());
    	}
    }
}
