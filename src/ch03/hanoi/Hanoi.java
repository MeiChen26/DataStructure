package ch03.hanoi;

import java.util.Scanner;

public class Hanoi {
	
	private int c = 1;
	
    public void hanoiMove(int n, char x, char y, char z) {
    	if(n == 1)
    		move(1, x, z);
    	else {
    	    hanoiMove(n-1, x , z, y);
    	    move(n, x, z);
    	    hanoiMove(n-1, y, x, z);
    	}
    }
    
    public void move(int num, char x, char z) {
    	System.out.println("第" + c + "次移动" + num + "号圆盘"
    			+ x + "->" + z);
    	c++;
    }
    
    public static void main(String[] args) {
    	Hanoi test = new Hanoi();
    	System.out.println("请输入移动汉诺塔的数目：");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	test.hanoiMove(n, 'x', 'y', 'z');
    }
}
