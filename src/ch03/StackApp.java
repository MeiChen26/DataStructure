package ch03;

import java.util.HashMap;
import java.util.Stack;

public class StackApp {
    /**
     * 
     * @param str待匹配的字符串
     * @return 返回是否匹配成功
     */
	public boolean IsMatch(String str) {
		//左分隔符作为哈希表的key，右分隔符为value
		HashMap<Character, Character> map = new HashMap<Character, Character>(); 
		map.put('(', ')');
		map.put('[', ']');
		map.put('(', '}');
		
		Stack<Character> stack = new Stack<Character>();
    	    for(int i = 0; i < str.length(); i++) {
    	    	    char c = str.charAt(i);
    	    	    if(map.containsKey(c)) {
    	    	    	    stack.push(c);	 //左分隔符压栈   	    
    	    	    }
    	    	    else {
    	    	    	    if(stack.isEmpty())
    	    	    	    	    return false;   //右比左多
    	    	    	    else if(map.get(stack.peek()) == c)
    	    	    	    	    return true;
    	    	    	    else 
    	    	    	    	    return false;  //左和右不匹配
    	    	    }
    	    }	
    	    return stack.isEmpty();  //判断左是否比右多
    }
}
