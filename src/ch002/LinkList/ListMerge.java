package ch002.LinkList;

import java.util.Scanner;

public class ListMerge {
    
	/*
	 * 创建两个链表
	 */
	public void init(LinkList LA, LinkList LB) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请按非递减的顺序输入链表LA的值，键入字母结束： ");
		LA.create1(4);
		LA.display();
		System.out.println("请按非递减的顺序输入链表LB的值，键入字母结束：");
		LB.create1(6);
		LB.display();	
	}
	
	public LinkList mergeList(LinkList LA, LinkList LB) {
		 Node pa = LA.head.next;
		 Node pb = LB.head.next;
		 LinkList LC = new LinkList();
		 Node pc = LC.head;
		 
		 while(pa != null && pb != null) {
			 int dataA = Integer.parseInt((String)pa.data);
			 int dataB = Integer.parseInt((String)pb.data);
			 if(dataA <= dataB) {
				 pc.next = pa;
				 pa = pa.next;
				 pc = pc.next;
			 }
			 else {
				 pc.next = pb;
				 pb = pb.next;
				 pc = pc.next;
			 }
			 
			 pc.next = pa !=null ? pa : pb;
		 }
		 return LC;
	}
	
	public static void main(String[] args) throws Exception {
    	    
		ListMerge tst = new ListMerge();
    	    LinkList LA = new LinkList();
    	    LinkList LB = new LinkList();
    	    tst.init(LA, LB);
    	    LinkList mergelist =  tst.mergeList(LA, LB);
    	    System.out.println("合并后的链表为：");
    	    mergelist.display();
    }
}
