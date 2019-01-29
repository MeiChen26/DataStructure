package ch002;

import java.util.Scanner;

public class CaesarTest {
	public static void main(String []args) {
       //初始化双向链表
	   DulList alphbet = new DulList();
       alphbet.init(alphbet.head);
       
       
       DulNode shead=alphbet.head;
       
       
       //输出结果
       for(int i =0; i<27; i++) {
    	   System.out.print(shead.data+" ");
    	   shead = shead.next;
       }    	   
       
       System.out.println();     	   
       System.out.println("请输入移动的步数");    
       
       Scanner sc = new Scanner(System.in);
       
       while(sc.hasNext()) {
       
    	   //找到要开始输入的位置
       DulNode snode = alphbet.Caesar(sc.nextInt());
       
       for(int i=0; i<26; i++) {
    	       if (snode.data!=null)
    	       System.out.print(snode.data+" ");
    	       snode = snode.next;
       }
     }
	}
}
