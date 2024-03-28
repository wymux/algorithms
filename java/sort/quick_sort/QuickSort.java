public class QuickSort {
	public static void quickSort(int[] arr, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);
			quickSort(arr, begin, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, end);
		}
	}

	private static int partition(int[] arr, int begin, int end) {
		int pivot = arr[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}

		int tmp = arr[i + 1];
		arr[i + 1] = arr[end];
		arr[end] = tmp;

		return i + 1;
	}

	public static void traverseArray(int[] a) {
		System.out.print("arr: ");
		for (int num: a)
			System.out.print(num + " ");
		System.out.print("\n");
	}

	
	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		traverseArray(arr);
		quickSort(arr, 0, arr.length - 1);
		traverseArray(arr);
	}
}
