package ch07.ShellSort;

public class ShellSortTest {
    public static void main(String[] args) {
		int d[] = {5,3,1};
		int array[] = {52,39,67,95,70,8,25,52,56,5};
		ShellSort shellsort = new ShellSort();
		shellsort.shellSort(d, array);
	}
    
}
