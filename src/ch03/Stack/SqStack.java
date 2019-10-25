package ch03.Stack;

public class SqStack implements IStack{
    
	private Object[] stackElem;  //对象数组
	private int top;             //非空栈中，top始终指向栈顶元素的下一个存储位置；栈为空时，top值为0
	
	public SqStack(int maxSize) {
		top = 0;
		stackElem = new Object[maxSize];
	}
	                             
	@Override
	public void clear() {
		top = 0;		
	}

	@Override
	public boolean isEmpty() {
		return top == 0;
	}

	@Override
	public int length() {
		return top;
	}

	@Override
	public Object peek() {
		if(!isEmpty())
			return stackElem[top-1];
		else
			return null;
	}

	@Override
	public void push(Object x) throws Exception {
		if(top == stackElem.length)
			throw new Exception("栈已满");
		else
			stackElem[top++] = x;
		
	}

	@Override
	public Object pop() {
		if(isEmpty())
			return null;
		return stackElem[--top];
	}
	
	public void display() {
		for(int i = top-1; i>=0; i--) {
			System.out.print(stackElem[i]);
		}
		System.out.println();
	}

}
