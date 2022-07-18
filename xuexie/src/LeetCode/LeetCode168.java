package LeetCode;

public class LeetCode168 {

	public static void main(String[] args) {
		int columnNumber = 701;
		LeetCode168 lc = new LeetCode168();
		System.out.print(lc.convertToTitle(columnNumber));
	}

	public String convertToTitle(int columnNumber) {
		char[] dic = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		int x = columnNumber;
		StringBuilder s = new StringBuilder();
		while (x > 0) {
			int tmp = (x - 1) % 26;
			x = (x - 1) / 26;

			s.insert(0, dic[tmp]);

		}
		return s.toString();
	}
}
