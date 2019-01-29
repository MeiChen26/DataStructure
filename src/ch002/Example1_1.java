package ch002;

import java.util.Scanner;

public class Example1_1 {
	private static Scanner sc;

	public static void main(String[] args) throws Exception{
      		
        System.out.println("请输入线性表的长度");
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        SqList shunxubiao = new SqList(n);

        for (int i=0; i<n; i++) {
    	        int random = (int)(Math.random()*5);
    	        shunxubiao.insert(i, random);
        }
	    shunxubiao.display();
	    //--------测试删除操作，调用remove(int i)删除第i个数据元素
	    System.out.println("输入删除第几个元素");    
	    shunxubiao.remove(sc.nextInt());
        System.out.println("删除后的结果为：");
        shunxubiao.display();
        //--------测试插入操作，调用insert(int i, Object x)在第i个位置插入数据元素x
        System.out.println("请输入插入元素的位置i：");
        int index = sc.nextInt();
        System.out.println("请输入插入的数据元素：");
        Object data = sc.next();
        shunxubiao.insert(index, data);
        System.out.println("打印线性表：");
        shunxubiao.display();
        System.out.println("线性表的长度为"+shunxubiao.length());
        //--------调用clear()将顺序表置空
        shunxubiao.clear();
        System.out.println("将顺序表置空后打印表中的元素");
        shunxubiao.display();
        if(shunxubiao.isEmpty())
        	   System.out.println("顺序表为空");
        else
        	System.out.println("顺序表不为空");
        
	
	}
}
	
	
