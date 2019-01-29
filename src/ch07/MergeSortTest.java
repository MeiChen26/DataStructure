package ch07;

public class MergeSortTest {
    public static void main(String[] args) {
		int[] array = {56,38,26,75,56,22,18,69,92,45};
		MergeSort obj = new MergeSort();
		obj.mergesort(array, 0, array.length - 1);
//		for(int a : array)
//			System.out.println(a);
	}
}
