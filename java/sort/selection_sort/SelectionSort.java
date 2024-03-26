public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}
	}
	
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {64, 25, 12, 22, 11};
		System.out.println("Original array:");
		printArray(arr);

		selectionSort(arr);

		System.out.println("Sorted array:");
		printArray(arr);
	}
}
