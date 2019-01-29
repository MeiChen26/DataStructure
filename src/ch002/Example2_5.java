package ch002;

import java.util.Scanner;

public class Example2_5 {
	
	// 初始化待合并的两个链表
	public void init(LinkList LA, LinkList LB) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		System.out.println("请按非递减的方式创建链表LA，键入字母结束");
		LA.create1(4); //尾插法
		LA.display();
		
		System.out.println("请按非递减的方式创建链表LB，键入字母结束");
		LB.create1(5);
		LB.display();
	}

	//合并两个链表，输出一个有序的链表
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
    	       } else {
    	    	       pc.next = pb;
    	    	       pb.next = pb.next;
    	    	       pc = pc.next;
    	       }
    	      pc.next = pa !=null ? pa : pb; 
    	       
       }       
       return LC;
	}
	
	public static void main(String[] args) throws Exception {
		
        Example2_5 tst = new Example2_5();
        
        LinkList LA = new LinkList();
        LinkList LB = new LinkList();
        tst.init(LA, LB);
        
        LinkList LC = tst.mergeList(LA, LB);
        System.out.println("请输入合并后的结果：");
        LC.display();
        
	}
}
