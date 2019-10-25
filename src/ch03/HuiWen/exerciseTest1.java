package ch03.HuiWen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.LinkedList;

import ch002.LinkList.LinkList;

public class exerciseTest1 {
    public static void main(String[] args) throws Exception {
		exercise1 tst = new exercise1();
		exercise2 tst2 = new exercise2();
		LinkedList<Integer> list = new LinkedList<Integer>();

	    String line = readfile();
	    for(int i = 0; i<line.length(); i++) {
	       	list.add((int)line.charAt(i));
	    }
		
		if(tst.isHuiWen(list) == true)
			System.out.println("是回文");
		else
			System.out.println("不是回文");
		
		LinkList list2 = new LinkList();
		list2.create2(6);
		if(tst2.isHuiWen(list2.head) == true)
			System.out.println("是回文");
		else
			System.out.println("不是回文");
	}
    
    /*
     * 从文件中读入字符串
     */
    public static String readfile() throws IOException {
        File myfile = new File("HUIWEN");  	    
		FileReader fileReader;
		try {
			fileReader = new FileReader(myfile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;		
			while((line = reader.readLine()) != null) {
			   return line;
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
    }
}
