package ch03.FlagVerify;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

import ch03.Stack.SqStack;

public class ValidParentheses {
	
	public final int LEFT = 0;
	public final int RIGHT = 1;
	public final int OTHER = 2;
    
	public static void main(String[] args) throws Exception {
		ValidParentheses tst = new ValidParentheses();
		String line = tst.readfile();
	    if(tst.verifyLine(line) )
	    	    System.out.println("分隔符匹配");
	    else
	    	    System.out.println("分隔符不匹配");		
	}
    
    /*
     * 判断分隔符匹配
     */
    public boolean verifyLine(String line) throws Exception {
    	    SqStack stack = new SqStack(100);
    	    for(int i = 0; i<line.length(); i++) {
    	    	    char c = line.charAt(i);   	    	    
    	    	    
    	    	    if(checkLine(c) == LEFT)
    	    	    	    stack.push((Character)c);
    	    	    else if(checkLine(c) == RIGHT){ 	    	    	    
    	    	    	    if(stack.isEmpty())
    	    	    	    	    return false;
    	    	    	    else if(matchLine((char)stack.peek(), c))
    	    	    	    	    stack.pop();
    	    	    	    else
    	    	    	    	    return false;
    	    	    } 	    	    	    
    	    }
    	    return stack.isEmpty();
    }
    
    /*
     * 判断分隔符的类型
     */
    public int checkLine(char c) {
    	    switch(c) {
    	    case '(':
    	    case '[':
    	    case '{':
    	    	    return LEFT;   	    	    
    	    case ')':
    	    case ']':
    	    case '}':
    	        	return RIGHT;
        default: return OTHER;  	        	    	    	   
    	    }	
    }
    
    /*
     * 判断分隔符是否匹配，匹配则返回true,否则返回false
     */
    public boolean matchLine(char c1, char c2) {
    	    switch(c2) {
    	    case ')':
    	    	    return c1 == '(';
    	    case ']':
    	    	    return c1 == '[';
    	    case '}':
    	    	    return c1 == '{';
    	    	default: return false;
    	    }
    }
    
    /*
     * 从文件中读入字符串
     */
    public String readfile() throws IOException {
        File myfile = new File("arr.txt");  	    
		FileReader fileReader;
		try {
			fileReader = new FileReader(myfile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;		
			while((line = reader.readLine()) != null) {
			   return line;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
    }
}

