public class Main {

	public static int lengthOfLongestSubstring(String s) {
		int max = 0;
		int len = s.length();
		String s1 = "";
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			int found = s1.indexOf(c);
			if (found != -1)
				s1 = s1.substring(found + 1);
			s1 += c;
			max = Math.max(max, s1.length()); 
		}
		return max;
	}

	public static int lengthOfLongestSubstringHash(String s) {
		int len = s.length;
		int max = 0;
		int[] arr = new int[128];
		for (int start = 0, end = 0; end < len; end++) {
			char c = s.charAt(end);
			if (arr[c] > 0)
				start = Math.max(start, arr[c]);
			max = Math.max(max, end - start + 1);
			arr[c] = end + 1;
		}
		return max;
	}

	
	public static void main(String[] args) {
		String s1 = "Hello World";
		int length = lengthOfLongestSubstring(s1);
		int len = lengthOfLongestSubstringHash(s1);
		System.out.print("Length " + length + " " + len + "\n");
	}
}
