package LeetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeetCode159 {

	public static void main(String[] args) {
		String s = "cdaba";
		LeetCode159 lc = new LeetCode159();
		System.out.print(lc.lengthOfLongestSubstringTwoDistinct(s));
	}

	public int lengthOfLongestSubstringTwoDistinct(String s) {
		Map<Character, Integer> map = new HashMap<>();
		int left = 0;

		int max_len = 2;
		if (s.length() < 3) {
			return s.length();
		}
		for (int right = 0; right < s.length(); right++) {
			map.put(s.charAt(right), right);

			if (map.size() == 3) {
				// int index = Collections.min(map.values());
				int in = s.length();
				for (int index : map.values()) {

					in = Math.min(in, index);
				}
				map.remove(s.charAt(in));
				left = in + 1;

			}
			max_len = Math.max(max_len, right - left + 1);

		}
		return max_len;
	}
}
