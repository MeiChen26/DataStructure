package ch002.DulListDemo;

public class DulNode {
	public Object data;
	public DulNode prior; //指向前一个节点的指针域
	public DulNode next;  //指向后一个节点的指针域
	public DulNode() {
		this(null);
	}
	public DulNode(Object data) {
		this.data=data;
		this.prior=null;
		this.next=null;
	}

}
