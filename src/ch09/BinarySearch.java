package ch09;

public class BinarySearch {
	/**
	 * 
	 * @param key
	 *            要查找的关键字
	 * @param array
	 *            已排序的整型数组
	 * @return 待查找的关键字的下标
	 */
	public int binarySearch(int key, int[] array) {
		if (array.length <= 0)
			return -1;
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		while (low <= high) {
			if (array[mid] == key) {
				return mid;
			} else if (array[mid] > key) {
				high = mid - 1;  //查找范围缩小到前半段
			} else {
				low = mid + 1;   //查找范围缩小到后半段
			}

		}
		return -1;

	}
}
