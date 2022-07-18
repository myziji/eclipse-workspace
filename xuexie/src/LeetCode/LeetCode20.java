package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode20 {

	public static void main(String[] args) {
		String s = "(]";
		LeetCode20 lc = new LeetCode20();
		System.out.print(lc.isValid(s));
	}

	public boolean isValid(String s) {

		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map.containsKey(s.charAt(i))) {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (!stack.pop().equals(map.get(s.charAt(i)))) {
						return false;
					}
				}

			}
		}
		return stack.isEmpty();
	}
}
