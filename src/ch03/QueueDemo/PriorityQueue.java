package ch03.QueueDemo;

import ch002.LinkList.Node;

public class PriorityQueue implements IQueue{
    private Node front;
    private Node rear;
    
    public PriorityQueue() {
    	front = rear = null;
    }
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isEmpty() {
		return front == null;
	}
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void offer(Object x) throws Exception {
		PriorityData data = (PriorityData)x;
		Node newNode = new Node(data);
		if(front == null) {
			front = rear = newNode;
		}
		else {
			//1->3->5
			Node p = front;
			Node pre = p;
			while(p != null && 
					data.priority > ((PriorityData)p.data).priority) {
				pre = p;
				p = p.next;
			}
            if(p == null) {
            	rear.next = newNode;
            	rear = newNode;
            }
            else if(p == front) {
            	newNode.next = front;
            	front = newNode;
            }
            else {
            	newNode.next = p;
            	pre.next = newNode;
            }
		}
		
	}
		
	@Override
	public Object poll() {
		if(front == null)
			return null; //队列为空
		else {
			if(front == rear) {
				rear = null;
			} //队列只有一个结点
			Node p = front;
			front = front.next;
			return p.data;
		}
	}
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
