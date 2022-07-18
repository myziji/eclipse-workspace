package recode;

public class LeetCode266PalindromePermutation {

	public static void main(String[] args) {
		String s ="code";
		LeetCode266PalindromePermutation lc = new LeetCode266PalindromePermutation();
		System.out.print(lc.canPermutePalindrome(s));

	}
	public boolean canPermutePalindrome(String s) {
		int[] map = new int[26];
		for(char c : s.toCharArray()) {
			map[c-'a']++;
		}
		int count =0;
		for(int i : map) {
			if(i%2!=0) {
				count++;
			}
		}
		if(count>1) {
			return false;
		}
		return true;
	}
}
