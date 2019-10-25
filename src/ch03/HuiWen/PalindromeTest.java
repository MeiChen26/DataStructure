package ch03.HuiWen;

import java.util.LinkedList;

public class PalindromeTest {   
    /*
     * 构造字符串链表
     */
    public void init(LinkedList<Integer> list, int x) {
    	    x = 0;
        list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);
    }    
    
    public void output(Palindrome tst, LinkedList<Integer> list) {
       	if(tst.IsPalindrome(list))
		    System.out.println("字符串是回文");
		else
			System.out.println("字符串不是回文");
    }
    
    public static void main(String[] args) {
    	
    	PalindromeTest test = new PalindromeTest();
	    Palindrome tst = new Palindrome();
		LinkedList<Integer> list = new LinkedList<Integer>();
		int x = 1;
	    test.init(list, x);	
	    System.out.println(x);
		test.output(tst,list);
	}	
}
