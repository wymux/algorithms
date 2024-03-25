import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void printArr(int[] arr) {
		for (int num: arr) {
			System.out.print(num + " ");
		}
		System.out.print("\n");
	}

	public static int[] twoSum(int[] num, int target) {
		int[] Solution = new int[2];
		int len = num.length;
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (num[i] + num[j] == target) {
					Solution[0] = i;
					Solution[1] = j;
					return Solution;
				}
			}
		}
		return Solution;
	}

	public static int[] twoSumHash(int[] num, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < num.length; i++) {
			int complement = target - num[i];
			if (numMap.containsKey(complement)) {
				return new int[]{numMap.get(complement), i};
			}
			numMap.put(num[i], i);
		}
		throw new IllegalArgumentException("No two numbers add up to the target.");
	}
	 
	public static void main(String[] args) {
		int[] arr1 = {2, 7, 11, 15};
		int[] arr2 = {3, 2, 4};
		int[] arr3 = {3, 3};
		printArr(arr1);
		printArr(arr2);
		printArr(arr3);
		int[] Solution1 = twoSum(arr1, 9);
		int[] Solution1_a = twoSumHash(arr1, 9);
		System.out.println("Solution1: " + Solution1[0] + " " + Solution1[1] + "\n");
		System.out.println("Solution1_a: " + Solution1_a[0] + " " + Solution1_a[1] + "\n");
		
		int[] Solution2 = twoSum(arr2, 6);
		int[] Solution2_a = twoSum(arr2, 6);
		System.out.println("Solution2: " + Solution2[0] + " " + Solution2[1] + "\n");
		System.out.println("Solution2_a: " + Solution2_a[0] + " " + Solution2_a[1] + "\n");
		
		int[] Solution3 = twoSum(arr3, 6);
		int[] Solution3_a = twoSum(arr3, 6);
 		System.out.println("Solution3: " + Solution3[0] + " " + Solution3[1] + "\n");
 		System.out.println("Solution3_a: " + Solution3_a[0] + " " + Solution3_a[1] + "\n");

		
	}
}
