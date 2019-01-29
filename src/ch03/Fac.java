package ch03;

public class Fac {
    public static void main(String[] args) {
		Fac tst = new Fac();
		System.out.println("非递归实现阶乘： "+tst.fac(5));
		System.out.println("递归实现阶乘："+tst.FacRec(5));
	}
    
    //非递归实现阶乘
    public int fac(int n) {
    	    if(n == 1 || n == 0)
	    	return 1;
    	    
    	    else {
    	    	    int result = 1;
    	    	    for(int i = n; i>=1; i--) {
    	    	    	    result *=i;
    	    	    }
    	    	    return result;
    	    }
    }
    
    //递归实现阶乘
    public int FacRec(int n) {
    	    if(n == 1 || n == 0)
    	    	return 1;
    	    
    	    return n * FacRec(n-1);
    }
    
}
