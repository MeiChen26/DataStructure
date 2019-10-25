package ch07.SelectionSort;

public class SelectionSortTest {
    public static void main(String[] args) {
		SelectionSort tst = new SelectionSort();
		
		
		int[] array = {8,7,6,5,4,3,2,1};
		tst.selectSort(array);
		
		for(int a : array) {
			System.out.println(a);
		}
	}
}
