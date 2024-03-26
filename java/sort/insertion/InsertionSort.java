public class InsertionSort {
	public static void printArray(int [] arr) {
		for (int num : arr)
			System.out.print(num + " ");
		System.out.println();
	}
	
	public static void insertionSort(int[] arr) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {64, 34, 25, 12, 22, 11, 90};
		int[] arr1 = {200, 20};
		System.out.println("Original array: ");
		printArray(arr);
		insertionSort(arr);
		insertionSort(arr1);
		System.out.println("Sorted array: ");
		printArray(arr);
		printArray(arr1);
	}
}
