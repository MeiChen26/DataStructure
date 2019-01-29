package ch03;
import ch002.Node;

public class exercise2 {
    boolean isHuiWen(Node head) throws Exception {
    	    /*
    	     * 创建快慢指针，慢指针一次挪一步，快指针一次挪两步，
    	     * 快指针速度是慢指针速度的两倍。
    	     */
    	    Node fast = head.next;
    	    Node slow = head.next;
    	    
    	    SqStack stack = new SqStack(100);
    	    
    	    /*
    	     * 未知链表长度，找到链表的中间位置
    	     */
    	    while(fast != null && fast.next != null) {
    	    	    stack.push(Integer.parseInt((String)slow.data));
    	    	    slow = slow.next;
    	    	    fast = fast.next.next;
    	    }
    	    
    	    /*
    	     * 若字符串为奇数，慢指针要跳过中间字符
    	     */
    	    if(fast != null)
    	    	    slow = slow.next;
    	    
    	    /*
    	     * 前后段字符串比较
    	     */
    	    while(slow != null) {
    	    	    int top = (int)stack.pop();
    	    	    if(top != Integer.parseInt((String)slow.data))
    	    	       	return false;
    	    	    slow = slow.next;
    	    }
    	    return true;
    }
}
