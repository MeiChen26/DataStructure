package ch03;

import java.util.LinkedList;
import ch002.LinkList;

public class ExerciseTest {

	public static void main(String[] args) throws Exception {
		exercise1 tst = new exercise1();
		exercise2 tst2 = new exercise2();
		LinkedList<Integer> list = new LinkedList<Integer>();
		 list.add(1);
		 list.add(2);
		 list.add(4);
		 list.add(3);
		 list.add(2);
		 list.add(1);
		

		if (tst.isHuiWen(list) == true)
			System.out.println("是回文");
		else
			System.out.println("不是回文");

		LinkList list2 = new LinkList();
		list2.create2(6);
		if (tst2.isHuiWen(list2.head) == true)
			System.out.println("是回文");
		else
			System.out.println("不是回文");
	}
}
