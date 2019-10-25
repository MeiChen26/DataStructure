package ch03.QueueDemo;

public interface IQueue {

	public void clear();
	public boolean isEmpty();
	public int length();
	public void offer(Object x)throws Exception;
	public Object poll();
	public Object peek();
}
