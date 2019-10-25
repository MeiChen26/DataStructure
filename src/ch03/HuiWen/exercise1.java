package ch03.HuiWen;

import java.util.LinkedList;
import java.util.Stack;

public class exercise1 {
    public boolean isHuiWen(LinkedList<Integer> list) {
    	    Stack<Integer> st = new Stack<Integer>();
    	    int size = list.size();
    	    for(int i = 0; i<size/2; i++) {
    	    	    st.push(list.get(i));
    	    }
    	    int k = size % 2 == 0 ? size/2 : size/2 + 1;
    	    for(; k<size; k++) {
    	    	    int top = st.pop().intValue();
    	    	    if(top != list.get(k))
    	    	    	    return false;
    	    }
    	    return true;
    }
}
