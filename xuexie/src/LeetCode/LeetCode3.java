package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3 {

	public static void main(String[] args) {
		String s = "pwwkew";
		LeetCode3 lc = new LeetCode3();
		System.out.print(lc.lengthOfLongestSubstring(s));

	}

	public int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map = new HashMap<>();
		int left = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				int x = map.get(s.charAt(i))+1;
				left=Math.max(left, x);
			} 
			map.put(s.charAt(i), i);
			
			result = Math.max(result, i - left + 1);
		}
		return result;
	}
}
