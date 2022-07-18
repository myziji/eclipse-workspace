package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode438 {
	// Given two strings s and p, return an array of all the start indices of p's
	// anagrams in s.
	// You may return the answer in any order.
	public static void main(String[] args) {
		String s = "aa";
		String p = "vv";
		LeetCode438 lc = new LeetCode438();
		System.out.print(lc.findAnagrams(s, p));
	}

	public List<Integer> findAnagrams(String s, String p) {
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < p.length(); i++) {
			map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
		}
		int left = 0;
		for (int right = 0; right < s.length(); right++) {
			if (right - left + 1 < p.length()) {
				map2.put(s.charAt(right), map2.getOrDefault(s.charAt(right), 0) + 1);
			} else {
				map2.put(s.charAt(right), map2.getOrDefault(s.charAt(right), 0) + 1);
				if (map1.equals(map2)) {
					result.add(left);
				}
				if ((int) map2.get(s.charAt(left)) == 1) {
					map2.remove(s.charAt(left));
				} else {
					map2.put(s.charAt(left), (int) map2.get(s.charAt(left)) - 1);
				}

				left++;
			}
		}

		return result;

	}

	public List<Integer> findAnagrams2(String s, String p) {
		int[] map = new int[26];
		int[] map2 = new int[26];
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < p.length(); i++) {
			map[p.charAt(i) - 'a']++;

		}
		int left = 0;
		for (int right = 0; right < s.length(); right++) {
			if (right - left + 1 < p.length()) {
				map2[s.charAt(right) - 'a']++;

			} else {
				map2[s.charAt(right) - 'a']++;

				if (Arrays.equals(map, map2)) {
					result.add(left);
				}
				map2[s.charAt(left) - 'a']--;

				left++;
			}
		}

		return result;

	}

}
