public class Main {

	public static double findMedianSortedArrays(int[] nums1, int nums2[]) {
		int i = 0, j = 0, k = 0;
		int s1 = nums1.length;
		int s2 = nums2.length;
		int size = s1 + s2;
		int[] arr = new int[size];
		double median = 0;
		while (i < s1 && j < s2) {
			if (nums1[i] < nums2[j])
				arr[k++] = nums1[i++];
			else
				arr[k++] = nums2[j++];

 		}
		while (i < s1)
			arr[k++] = nums1[i++];
		while (j < s2)
			arr[k++] = nums2[j++];

		if (size % 2 == 0)
			median = (arr[((size - 1) / 2)] +  arr[size / 2]) / 2.0;
		else
			median = arr[(size - 1) / 2];
		return median;
	}
	
	public static void main(String[] args) {
		int arr1[] = {1, 2};
		int arr2[] = {3, 4};
		double res = findMedianSortedArrays(arr1, arr2);
		System.out.print("Median: " + res + "\n");
	}
}
