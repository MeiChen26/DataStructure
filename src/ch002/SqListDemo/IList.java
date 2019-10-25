package ch002.SqListDemo;
/*
 * 线性表的抽象类型描述
 */
public interface IList {
	
	
    public void clear();
    public boolean isEmpty();
    public int length();
    public Object get(int i) throws Exception;
    public void insert(int i, Object x) throws Exception;
    public void remove(int i) throws Exception;
    public int indexOf(Object x);
    public void display();
}
