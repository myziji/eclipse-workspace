
package blind75;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s ="abcabcbb";
		LongestSubstringWithoutRepeatingCharacters ll = new LongestSubstringWithoutRepeatingCharacters();
		System.out.print(ll.longestSubstringWithoutRepeatingCharacters(s));
	}

	
	public int longestSubstringWithoutRepeatingCharacters(String s) {
		Set<Character> set = new HashSet<>();
		int slow=0,fast=0,result =0,temp=0;
		while(fast<s.length()) {
			if(set.add(s.charAt(fast))) {
				fast++;
				temp++;
				if(temp > result) {
					result = temp;
				}
			}else {
				set.remove(s.charAt(slow));
				slow++;
				temp--;
			}
			
		}
		return result;
	}
}
