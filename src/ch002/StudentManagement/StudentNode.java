package ch002.StudentManagement;

import java.util.Scanner;

public class StudentNode {
    public int number;
    public String name;
    public String sex;
    public double english;
    public double math;
    public StudentNode() {
    	    this(0,null,null,0.0,0.0);
    }
    //有参时的构造方法
	public StudentNode(int number, String name, String sex, double english, double math) {
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.english = english;
		this.math = math;
	}
	
	public StudentNode(Scanner sc) {
		this(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
	}
	
	public String toString() {
		return "学号: "+number +" 姓名: "+name + " 性别："+sex +" 大学英语成绩: "+english +" 高等数学成绩："+math;
	}
}
