public class Main {
	
	public static String longestPalindrome(String s) {
		if (s == null || s.length() < 2)
			return s;

		int start = 0;
		int maxLength = 1;

		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);

			if (len > maxLength) {
				start = i - (len - 1) / 2;
				maxLength = len;
			}
		}

		return s.substring(start, start + maxLength);
	}

	public static int expandAroundCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) ==  s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

	public static void main(String[] args) {
		String s1 = "babad";
		String s2 = "cbbd";
		String s3 = "a";
		String s4 = "ac";

		System.out.println("Longest palindromic substring in '" + s1 + "': " + longestPalindrome(s1));
		System.out.println("Longest palindromic substring in '" + s2 + "': " + longestPalindrome(s2));
		System.out.println("Longest palindromic substring in '" + s3 + "': " + longestPalindrome(s3));
		System.out.println("Longest palindromic substring in '" + s4 + "': " + longestPalindrome(s4));
	}
}
