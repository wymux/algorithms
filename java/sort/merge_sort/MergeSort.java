public class MergeSort {
	public static void mergeSort(int[] arr, int n) {

		if (n < 2)
			return;
		int mid = n / 2;
		int l[] = new int[mid];
		int r[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			l[i] = arr[i];
		for (int i = mid; i < arr.length; i++)
			r[i - mid] = arr[i];
		mergeSort(l, mid);
		mergeSort(r, n - mid);
		merge(arr, l, r, mid, n - mid);
 	}

	public static void merge(int[] a, int[] l, int[] r, int left, int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j])
				a[k++] = l[i++];
			else
				a[k++] = r[j++];
		}
		while (i < left)
			a[k++] = l[i++];
		while (j < right)
			a[k++] = r[j++];
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
		mergeSort(arr, arr.length);
		traverseArray(arr);
	}
	
}
