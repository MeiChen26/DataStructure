package ch03;
import ch002.Node;

public class LinkStack implements IStack{

	private Node top;    //栈顶元素的引用
	//将栈置空
	@Override
	public void clear() {
		top = null;	
	}
    //判断栈是否为空
	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object peek() {
		if(!isEmpty())         //栈非空
			return top.data;   //返回栈顶元素的值
		else
			return null;
	}

	@Override
	public void push(Object x) throws Exception {
		  
		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void display() {
		Node p = top;
		while(p !=null) {
			System.out.println(p.data.toString() + " ");
			p = p.next;
		}
	}
    
}
