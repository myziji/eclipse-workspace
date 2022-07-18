package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode266 {
	//Given a string s, return true if a permutation of the string could form a palindrome.
	public static void main(String[] args) {
		String s = "aab";
		LeetCode266 lc = new LeetCode266();
		System.out.print(lc.canPermutePalindrome2(s));
	}

	public boolean canPermutePalindrome(String s) {
		
		Map<Character,Integer> map = new HashMap<>();
		int old=0;
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Character key : map.keySet()) {
			if(map.get(key)%2!=0) {
				old++;
			}
			if(old>1) {
				return false;
			}
			
		}
		
		return true;
		
	}

	public boolean canPermutePalindrome2(String s) {
		int[] map = new int[26];
		int count =0;
		for(int i=0;i<s.length();i++) {
			map[s.charAt(i)-'a']++;
		}
		for(int i =0;i<map.length;i++) {
			if(map[i]%2!=0) {
				count++;
			}
		}
		if(count>1) {
			return false;
		}
		return true;
	}

}
