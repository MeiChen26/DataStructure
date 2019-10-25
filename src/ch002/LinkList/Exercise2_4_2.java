package ch002.LinkList;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

public class Exercise2_4_2 {
	public static void main(String[] args) throws Exception {
		Exercise2_4_2 tst = new Exercise2_4_2();		
        LinkList mylist = new LinkList();
		tst.init(mylist);
		Queue<String> q = new ArrayBlockingQueue<String>(0);
		Stack<String> st = new Stack<String>();
		TreeSet<?> tree = new TreeSet();
	}	
	
	/*
	 * 初始化
	 */
	public void init(LinkList mylist) {
					    
			System.out.println("请输入要进行操作的序号：");
			System.out.println("1. 创建单链表");
			System.out.println("2. 查询第i个数据元素");
			System.out.println("3. 在第i个位置插入数据");
			System.out.println("4. 删除第i个位置数据");
			System.out.println("5. 单链表逆置");
			System.out.println("6. 删除值为x的元素");
			System.out.println("7. 插入值为x的元素");
			
			Scanner sc = new Scanner(System.in);
			while(sc.hasNextInt()) {
				switch(sc.nextInt()) {
			    case 1: createList(mylist);
			            break;
			    case 2: searchList(mylist);
			            break;
			    case 3: insertList(mylist);
				        break;
			    case 4: removeNode(mylist);
				        break;
			    case 5: mylist.reverse(mylist.head);
			            mylist.display();
			            break;
			    case 6: removeData(mylist);
			            break;
			    case 7: insertData(mylist);
			            break;
			    case 0: break;
			}
		}
	}
	
	/*
	 * 创建单链表，在表尾加入元素
	 */
	public void createList(LinkList mylist) {
		System.out.println("请输入要在单链表中加入的元素：");
		Scanner sc = new Scanner(System.in);
	    while(sc.hasNextInt()) {
			mylist.addLast(sc.nextInt());
		}
		mylist.display();
	}
	/*
	 * 查询链表
	 */
    public void searchList(LinkList mylist) {
    	    System.out.println("请输入要查询第几个元素：");
    	    Scanner sc = new Scanner(System.in);
    	    try {
				System.out.println("您要找的元素为："+mylist.get(sc.nextInt()));
			} catch (Exception e) {
				e.printStackTrace();
			}	
    }
    
    /*
     * 在链表中插入数据元素
     */
    public void insertList(LinkList mylist) {
    	    Scanner sc = new Scanner(System.in);
    	    System.out.println("输入要插入的元素的位置及其值：");
        	try {
				mylist.insert(sc.nextInt(),sc.next());
			} catch (Exception e) {
				e.printStackTrace();
			}
        	mylist.display();
    }
    
    /*
     * 删除链表中数据
     */
    public void removeNode(LinkList mylist) {
    	    System.out.println("请输入要删除的位置：");
    	    Scanner sc = new Scanner(System.in);
    	    try {
				mylist.remove(sc.nextInt());
			} catch (Exception e) {
				e.printStackTrace();
			}
    	    mylist.display();
    }
    
    /*
     * 删除带头结点的单链表中数据域值为x的所有节点，并返回个数
     */
    public void removeData(LinkList mylist) {
    	    System.out.println("请输入要删除元素的值：");
    	    Scanner sc = new Scanner(System.in);
    	    int result = mylist.removeAll(sc.nextInt());
    	    mylist.display();
    }


    /*
     * 非递减单链表插入值为x的元素
     */
    public void insertData(LinkList mylist) {
    	    Scanner sc = new Scanner(System.in);
    	    System.out.println("请输入要插入的元素值");
    	    mylist.insert(sc.nextInt());
    	    mylist.display();
    }
}    
