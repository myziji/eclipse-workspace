package blind75;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "((((())))){}{}[]{{}}";
		System.out.print(validParenthese(s));
	}
	
	public static boolean validParenthese(String s) {
		HashMap<Character,Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');
		char[] c = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		if( (map.containsKey(c[0])) ||map.containsValue(c[c.length-1])) {
			return false;
		}
	
		for(int i=0;i<c.length;i++) {
			if(!map.containsKey(c[i])) {
				stack.push(c[i]);
			}else {
				if(stack.isEmpty()) {
					return false;
				}else {
					if(stack.peek() ==  map.get(c[i])) {
						stack.pop();
					}else {
						return false;
					}
				}
			}
			
			
		}
		if(stack.isEmpty()) {
			return true;
		}
		return false;
	}
}
