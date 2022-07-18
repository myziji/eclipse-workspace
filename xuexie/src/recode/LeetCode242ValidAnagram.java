package recode;

public class LeetCode242ValidAnagram {

	public static void main(String[] args) {
		String s ="rat";
		String t ="car";
		LeetCode242ValidAnagram lc = new LeetCode242ValidAnagram();
		System.out.print(lc.isAnagram(s, t));

	}

	public boolean isAnagram(String s, String t) {
		int[] map = new int[26];
		if(s.length()!=t.length() )return false;
		for(char c : s.toCharArray()) {
			map[c-'a']++;
		}
		for(char c : t.toCharArray()) {
			map[c-'a']--;
		}
		for(int i : map) {
			if(i!=0) {
				return false;
			}
		}
		return true;
	}
}
