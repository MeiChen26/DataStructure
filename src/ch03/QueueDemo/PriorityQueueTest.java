package ch03.QueueDemo;

import java.util.Scanner;

public class PriorityQueueTest {
	public static void main(String[] args) throws Exception {
		 PriorityQueue test = new PriorityQueue();
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("请输入任务和优先级：");
		  while(true) {
			  if(!sc.hasNext("0"))
				  test.offer(new PriorityData(sc.nextInt(),sc.nextInt()));
			  else
                  break;
		  }
//		  test.offer(new PriorityData("a",10));
//		  test.offer(new PriorityData("b",7));
//		  test.offer(new PriorityData("c",12));
			 while(!test.isEmpty()) {
				 PriorityData p = (PriorityData)test.poll();
			     System.out.println(p.elem 
			    		 + "\t" + p.priority);	 
	}
	}
   
    

	
}
