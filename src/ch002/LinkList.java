package ch002;

import java.util.Scanner;

public class LinkList implements IList{
    public Node head;  //带头节点
    public LinkList() {
    	       head = new Node();
    }
    
    public LinkList(int n, boolean Order) throws Exception{
    	       this();                   //初始化头节点
    	       if(Order)                 //用尾插法顺序建立单链表
    	    	      create1(n);
    	       else
    	    	      create2(n);
    }
    
    //在表尾插入元素。带头节点，动态创建链表
    public void addLast(Object data) {     	    
    	    Node node = new Node(data);
 
        	    Node p = head;
        	    while(p.next != null) {
        	    	    p = p.next;
        	    }
        	    p.next = node;
        
    }
    
    
	@Override
	//清空链表
	public void clear() {
		head.data = null;
	    head.next = null;		
	}

	@Override
	//判断是否为空表
	public boolean isEmpty() {
		return head.next == null;
	}

	@Override
	//返回连表的长度
	public int length() {
		Node p = head.next;
		int length = 0;
		while(p != null) {
			p = p.next;
			length++;
		}
		return length;
	}

	@Override
	//取得第i个位置的数据元素。若i不合法则抛出异常。用的是for循环。
	public Object get(int i) throws Exception {
	    if(i<0 || i>length())
			throw new Exception("第"+i+"个元素不存在");
	    Node p = head.next;
		
		for(int k = 0; k<i; k++){
		      p = p.next;
		  }
		  
		if(p != null)
		      return p.data;
		else 
			  throw new Exception("元素不存在");
		  
	}

	//在第i个位置插入数据
	@Override
	public void insert(int i, Object x) throws Exception {
		Node p = head;
		int j = -1;
		while(p!= null && j<i-1) {
			p = p.next;
			j++;
		}
		if(j>i-1 || p == null)
			throw new Exception("插入位置不合法");
		Node s = new Node(x);
		s.next = p.next;
		p.next = s;			
	}

	@Override
	//删除第i个位置的数据元素
	public void remove(int i) throws Exception {
		Node p = head;
		int j = -1;
		while(p.next!=null && j<i-1) {
			p = p.next;
			j++;
		}
		if(j>i-1 ||p.next ==null)
			throw new Exception("删除位置不合法");
		p.next = p.next.next;	
	}

	//在带头结点的单链表中查找值为x的结点
	@Override
	public int indexOf(Object x) {
		Node p = head.next;
		int j = 0;
		while(p!= null && !p.data.equals(x)) {
			p = p.next;
			j++;
		}	
		if(p!= null)
			return j;
		else
			return -1;	
	}

	@Override
	//打印链表元素
	public void display() {
		Node node = head.next;
		while(node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();;
		
	}
	
	//头插法创建链表
	public void create2(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j<n; j++) {
			insert(0, sc.next());
		}
	}
	
	//尾插法创建链表
	public void create1(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j<n; j++) {
			insert(length(), sc.next());
		}
	}
	
    /*
     * 单链表逆置，不带头结点
     */
    public void reverse(Node head) {
    	    if(head == null)
    	    	    return;	
    	    Node pre = head;
    	    Node cur = head.next;
    	    pre.next = null;
    	    Node ne;
    	    while(cur !=null) {
    	        ne = cur.next;
    	        cur.next = pre;
    	        pre = cur;
    	        cur = ne;
    	    }   	    
    	}
    
    /*
     * 删除带头结点的单链表中数据域值为x的所有节点，并返回个数
     */
    public int removeAll(Object x) {
    	    Node p = head;
    	    int count = 0;
    	    
    	    while( p.next !=null){
    	    	    if(!(p.next.data).equals(x)) {
    	    	    	    p = p.next;
    	    	    } else {
    	    	    	    p.next = p.next.next;
    	    	    	    ++count;
    	    	    }  	    	
    	    }
    	    return count;
    }
    
    /*
     * 非递减单链表插入值为x的数据元素
     */
    public void insert(int x) {
    	    Node p = head.next;
    	    while(p.next != null && ((Integer) p.next.data).intValue()< x) {
    	    	    p = p.next;
    	    }
    	    Node s = new Node(x);
    	    s.next = p.next;
    	    p.next = s;
    }
    
    
}
