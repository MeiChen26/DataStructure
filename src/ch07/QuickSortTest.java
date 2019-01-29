package ch07;

public class QuickSortTest {
	public static void main(String[] args) {
		int[] array = {56,38,26,75,6,22,18,69};
	    QuickSort obj = new QuickSort();
	    obj.quickSort(array, 0, array.length - 1);
	}	
}
