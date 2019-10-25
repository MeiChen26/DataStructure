package ch03.HuiWen;

import java.util.Scanner;
import java.util.Stack;

public class HuiWen {
    public boolean isHuiWen(String str) {
    	Stack<Character> stack = new Stack<Character>();
    	for(int i = 0; i < str.length(); i++) {
    		stack.push(str.charAt(i));
    	}
    	
    	for(int i = 0; i < str.length(); i++) {
    		char c = str.charAt(i);
    		if(c != stack.pop())
    			return false;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
		System.out.println("请输入字符串：");
		Scanner sc = new Scanner(System.in);
		HuiWen test = new HuiWen();
		if(test.isHuiWen(sc.next())) {
			System.out.println("是回文");
		}else
			System.out.println("不是回文");
	}
}
