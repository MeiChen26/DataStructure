package ch002.SqListDemo;

import ch002.SqListDemo.SqList;

public class SqList implements IList {
	private Object[] listElem;       //线性表存储空间
	private int curLen;            //线性表的当前长度
	
	//顺序表的构造函数，构造一个存储空间容量为maxSize的线性表
	public SqList(int maxSize) {
		listElem = new Object[maxSize];
		curLen = 0;
	}

	@Override
	public void clear() {
		curLen = 0;    // 置顺序表的当前长度为0
	}

	@Override
	public boolean isEmpty() {
		return curLen == 0;
	}

	@Override
	public int length() {
		return curLen;
	}

	@Override
	public Object get(int i) throws Exception {
		if (i<0 || i>=curLen)
			throw new Exception("第"+i+"个元素不存在");
		return listElem[i];
			
	}
	
    //返回顺序表中首次出现指定元素的顺序号
	@Override
	public int indexOf(Object x) {
		int index;
		for(index=0;index<curLen;index++) {
			if(listElem[index] == x)
				return index;
		}
		return -1;
	}
	
	//在线性表的第i个位置插入x
	@Override
	public void insert(int i, Object x) throws Exception {
		if (curLen == listElem.length)
			throw new Exception ("顺序表已满");
		if (i<0 || i>curLen)
			throw new Exception ("插入位置不合法");
		for (int j = curLen; j>i; j--) {
			listElem[j] = listElem[j-1];
		}
		listElem[i] = x;
		curLen++;
	}

	//删除第i个元素
	@Override
	public void remove(int i) throws Exception {
		if (i<0 || i>curLen-1)
			throw new Exception("删除位置不合法");
		for (int j = i; j<curLen-1; j++) {
			listElem[j] = listElem[j+1];
		}
		curLen--;
	}
	
    //打印出顺序表中的元素
	@Override
	public void display() {
		for (int i=0;i<curLen;i++) {
			System.out.print(listElem[i]+" ");
		}
		System.out.println();
		
	}
}
