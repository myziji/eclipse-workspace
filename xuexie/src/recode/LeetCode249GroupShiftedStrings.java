package recode;

import java.util.List;

public class LeetCode249GroupShiftedStrings {

	public static void main(String[] args) {
		String[] s = { "abc", "bcd", "acef", "xyz", "az", "ba", "a", "z" };
		LeetCode249GroupShiftedStrings lc = new LeetCode249GroupShiftedStrings();
		System.out.print(lc.groupStrings(s));

	}

	public List<List<String>> groupStrings(String[] strings) {
		
		for(String s : strings) {
			String ss = helper(s);
		}
	}
	
	public String helper(String s) {
		int diff = s.charAt(0)-'a';
		
		for(int i=0;i<s.length();i++) {
			
		}
		
	}
}
