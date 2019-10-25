package ch002.StudentManagement;

import java.util.Scanner;

import ch002.SqListDemo.SqList;

public class StudentManagSystem extends SqList {
	
	public StudentManagSystem(int maxSize) {
		super(maxSize);
	}
  //重载父类insert方法，在顺序表尾插入元素
	public void insert(StudentNode node) {
		try {
			super.insert(this.length(), node);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  //覆盖父类的get方法，从顺序表中取出指定学号的学生信息，并返回
	public StudentNode get(int number) {
		for (int i = 0; i < this.length(); i++) {
			try {
				StudentNode tmp = (StudentNode) super.get(i);
				if (tmp.number == number)
					return tmp;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
    //覆盖SqList的remove方法
	public void remove(int number) {
		for (int i = 0; i < length(); i++) {
			try {
				StudentNode tmp = (StudentNode) super.get(i);
				if (tmp.number == number)
					super.remove(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//重载父类display()方法，输出顺序表中所有数据元素
	public void display(){
		for (int i=0;i<length();i++) {
			try {
				System.out.println(super.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
