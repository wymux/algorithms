public class Main {
	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int[] pivots = partition(arr, low, high);
			sort(arr, low, pivots[0] - 1);
			sort(arr, pivots[1] + 1, high);
		}
	}

	private static int[] partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		int j = high;
		int p = low - 1;
		int q = high;

		while (true) {
			while (arr[++i] < pivot);
			while (arr[--j] > pivot)
				if (j == low)
					break;
			if (i >= j)
				break;

			swap(arr, i, j);
			if (arr[i] == pivot) {
				p++;
				swap(arr, p, i);
			}

			if (arr[j] == pivot) {
				q--;
				swap(arr, j, q);
			}
		}
		swap(arr, i, high);
		int[] pivots = {i, j};
		int k = low - 1;

		while (k < p) {
			swap(arr, j, k);
			k++;
			j--;
		}

		while (k > q) {
			swap(arr, i, k);
			k--;
			i++;
		}

		return pivots;
	}

	private static void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
	
	public static void traverseArray(int[] a) {
		System.out.print("arr: ");
		for (int num: a)
			System.out.print(num + " ");
		System.out.print("\n");
	}


	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		sort(arr);
		traverseArray(arr);
	}
	
}
