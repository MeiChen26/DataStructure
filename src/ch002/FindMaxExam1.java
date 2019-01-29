package ch002;

public class FindMaxExam1 {
	/*
	 * 找到字符串最大，字符串的比较是依次比较字符的字典排序
	 */
	public static int findMax(String[] a) {
		int k= 0;
		for(int i=1;i<a.length;i++)
			if (a[i].compareTo(a[k])>0)
				k = i;
		return k;
	}
	
	public static void main(String []args) {
        String[] st1 = {"Joe", "Bob", "Bill", "Zeke"};
        System.out.println(findMax(st1));		
	}        
}