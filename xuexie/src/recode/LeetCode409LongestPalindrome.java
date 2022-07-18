package recode;

public class LeetCode409LongestPalindrome {

	public static void main(String[] args) {
		String s = "ab";
		LeetCode409LongestPalindrome lc = new LeetCode409LongestPalindrome();
		System.out.print(lc.longestPalindrome(s));

	}

	public int longestPalindrome(String s) {
		if (s.length() < 2) {
			return s.length();
		}
		int[] map = new int[128];
		for (char c : s.toCharArray()) {
			map[c - 'A']++;
		}
		int count = 0;
		int sum = 0;
		for (int i : map) {
			if (i % 2 != 0) {
				count = 1;
			}
			sum += i / 2;
		}
		return sum * 2 + count;
	}
}
