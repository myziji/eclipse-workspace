package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode409 {
	// Given a string s which consists of lowercase or uppercase letters,
	// return the length of the longest palindrome that can be built with those
	// letters.
	public static void main(String[] args) {
		String s = "abccccdd";
		LeetCode409 lc = new LeetCode409();
		System.out.print(lc.longestPalindrome2(s));

	}

	public int longestPalindrome(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int old = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (Character key : map.keySet()) {
			if (map.get(key) % 2 != 0 && old < 1) {
				old++;
				result = result + map.get(key) / 2;
			} else {
				result = result + map.get(key) / 2;
			}
		}

		return result * 2 + old;
	}

	public int longestPalindrome2(String s) {
		int odd = 0;
		int result = 0;
		int[] map = new int[128];
		for (int i = 0; i < s.length(); i++) {
			map[s.charAt(i) - 'A']++;
		}
		for (int i = 0; i < 128; i++) {
			result += map[i] / 2;
			if (map[i] % 2 != 0) {
				odd = 1;
			}

		}
		return result * 2 + odd;
	}
}
