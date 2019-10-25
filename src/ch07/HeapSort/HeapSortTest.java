package ch07.HeapSort;

public class HeapSortTest {
    public static void main(String[] args) {
		HeapSort obj = new HeapSort();
		int array[] = {23, 11, 24, 55, 30, 2, 6, 8};
		obj.heapSort(array);
		for(int a : array) {
			System.out.println(a);
		}
	}
}
