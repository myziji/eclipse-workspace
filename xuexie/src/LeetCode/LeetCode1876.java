package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1876 {

	public static void main(String[] args) {
		String s = "aababcabc";
		LeetCode1876 lc = new LeetCode1876();
		System.out.print(lc.countGoodSubstrings(s));
	}

	public int countGoodSubstrings(String s) {
		int count = 0;
		if (s.length() < 3)
			return 0;
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i - 1) != s.charAt(i) && s.charAt(i - 1) != s.charAt(i + 1)
					&& s.charAt(i + 1) != s.charAt(i)) {
				count++;
			}

		}

		return count;
	}
}
