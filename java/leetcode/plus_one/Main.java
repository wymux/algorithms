import java.util.Arrays;

public class Main {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= n; i--) {
			digits[i]++;
			if (digits[i] == 10)
				digits[i] = 0;
			else
				return digits;
		}
		int[] newDigits = new int[n + 1];
		newDigits[0] = 1;
		return newDigits;
	}
	
	public static void main(String[] args) {
		int[] digits1 = {1, 2, 3};
		int[] result1 = plusOne(digits1);
		System.out.println("Input: " + Arrays.toString(digits1));
		System.out.println("Output: " + Arrays.toString(result1));
    
		int[] digits2 = {9, 9, 9};
		int[] result2 = plusOne(digits2);
		System.out.println("Input: " + Arrays.toString(digits2));
		System.out.println("Output: " + Arrays.toString(result2));
    
		int[] digits3 = {4, 3, 2, 1};
		int[] result3 = plusOne(digits3);
		System.out.println("Input: " + Arrays.toString(digits3));
		System.out.println("Output: " + Arrays.toString(result3));
	}
	
}
