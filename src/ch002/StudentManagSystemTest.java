package ch002;

import java.util.Scanner;

public class StudentManagSystemTest {
	
	public static void main(String[] args) {
		
    int maxSize = 200;
    StudentManagSystem mylist = new StudentManagSystem(maxSize);    
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入学生的总数：");
    int count = sc.nextInt();
    System.out.println("请按学号、姓名、性别、大学英语和高等数学的顺序输入学生信息:");
    for(int i=0; i<count; i++) {
    	   StudentNode node = new StudentNode(sc);
    	   mylist.insert(node);  	   
    }
    mylist.display();
    
    System.out.println("请输入需要查询的学生学号: ");
    System.out.println(mylist.get(sc.nextInt()));
    System.out.println("请输入需要删除学生的学号：");
    mylist.remove(sc.nextInt());
    mylist.display();
    System.out.println("请输入需要增加的学生信息：");
    mylist.insert(new StudentNode(sc));
    mylist.display();
	}
}
