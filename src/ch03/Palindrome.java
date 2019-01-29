package ch03;

import java.util.LinkedList;
import java.util.Stack;

public class Palindrome {
    /*
     * 判断字符串是否为回文,字符串是链式存储，利用栈实现。
     */
	public boolean IsPalindrome(LinkedList<Integer> list) {
		Stack<Integer> stack = new Stack<Integer>();
		/*
		 * 把字符串前半段压栈
		 */
		int size = list.size();
		for(int i = 0; i< size / 2; i++) {
			stack.push(list.get(i));
		}
		
		/*
		 * 字符串前后半段比较
		 */
		int k = size % 2 == 0 ? size / 2 : size / 2 + 1;
        while(k < size) {
        	    int top = stack.pop();
        	    if(top != list.get(k))
        	    	    return false;
        	    k++;
        }	
		return true;
	}
}


