import java.util.LinkedList;

public class Main {

	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;

		StringBuilder[] rows = new StringBuilder[numRows];
		for (int i = 0; i < numRows; i++)
			rows[i] = new StringBuilder();

		int currentRow = 0;
		boolean goingDown = false;

		for (char c : s.toCharArray()) {
			rows[currentRow].append(c);

			if (currentRow == 0 || currentRow == numRows - 1)
				goingDown = !goingDown;
			currentRow += goingDown ? 1 : -1;
		}

		StringBuilder result = new StringBuilder();
		for (StringBuilder row : rows)
			result.append(row);
		return result.toString();
	}
	
	public String convertQuick(String s, int numRows) {
		if (numRows == 1 || s.length() <= numRows)
			return s;

		char[] chars = s.toCharArray();
		int len = chars.length;
		int cycleLen = 2 * numRows - 2;
		char[] result = new char[len];
		int index = 0;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j + i < len; j += cycleLen) {
				result[index++] = chars[j + i];
				if (i != 0 && i != numRows - 1 && j + cycleLen - i < len)
					result[index++] = chars[j + cycleLen - i];
			}
		}
		return String(result);
	}

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		String s1 = convert(s, 4);
		System.out.println("s1: " + s1);
	}
	
}
