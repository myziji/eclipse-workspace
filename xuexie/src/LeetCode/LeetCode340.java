package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode340 {

	public static void main(String[] args) {
		String s = "eceba";
		int k = 2;
		LeetCode340 lc = new LeetCode340();
		System.out.print(lc.lengthOfLongestSubstringKDistinct(s, k));

	}

	public int lengthOfLongestSubstringKDistinct(String s, int k) {
		Map<Character, Integer> map = new HashMap<>();
		int left = 0;
		int result = 0;

		for (int right = 0; right < s.length(); right++) {
			map.put(s.charAt(right), right);
			if (map.size() == k + 1) {
				int leftmost = s.length();
				for (int index : map.values()) {
					leftmost = Math.min(leftmost, index);
				}
				map.remove(s.charAt(leftmost));

				left = leftmost + 1;

			}
			result = Math.max(result, right - left + 1);
		}
		return result;
	}
}
