package ch03;

import java.util.HashMap;
import java.util.Stack;

public class Example3_1 {
	/**
	 * @param str要进行匹配的分隔符
	 * @return 返回是否匹配成功
	 */
    public boolean IsMatch(String str) {
    	
    	    //左分隔符作为哈希表的key，右分隔符为value
    	    HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<Character>();
    	    for(int i = 0; i < str.length(); i++) {
    	    	    char c = str.charAt(i);
    	    	    if(map.containsKey(c)) {
    	    	    	    stack.push(c);    //若是左分隔符则压栈
    	    	    }
    	    	    else {
    	    	    	    if(stack.isEmpty())
    	    	    	    	    return false;  //右比左多，不匹配
    	    	    	    else if(map.get(stack.peek()) == c)
    	    	    	    	    stack.pop();   //左和右匹配，弹栈
    	    	    	    else
    	    	    	    	    return false;  //左右不匹配
    	    	    }   
    	    }
    	    return stack.isEmpty();  //如果左比右多，栈不为空，则不匹配
    }
}
