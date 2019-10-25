package ch002.DulListDemo;

public class DulList {
	//双向循环链表
	public DulNode head;
	
	public DulList() {
		head = new DulNode();		
	}
	
	/*
	 * 创建双向循环链表，值是字母表
	 */
	public void init(DulNode head) {
	   
		DulNode pnode = head;
		
	   for (int i=0; i<26; i++) {
		   //创建新节点
		   DulNode tmp = new DulNode();
		   tmp.data = (char)('A' + i);
		   //改变指针指向
		   pnode.next = tmp;		
		   tmp.prior = pnode;
		   
		   tmp.next = null;
		   pnode = tmp; //移动尾指针
	   }
	   
	   pnode.next = head.next;
	   head.next.prior = pnode;
	   
	}
	
	/*
	 * 根据用户输入，改变字母表的输出顺序
	 */
	public DulNode Caesar(int step) {
		
		DulNode LNode = head.next;
		
		if(step>0) {
			while(step>1) {
			LNode = LNode.next;
			step--;
		  }
		}
		if(step<0) {
		    while(step!=0) {
		    	LNode = LNode.prior;
		    	step++;
		    }
		}
        return LNode;		
	}	

}
