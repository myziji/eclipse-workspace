package LeetCode;

import java.util.Arrays;

public class LeetCode9 {

	public static void main(String[] args) {
		int x = 121;
		LeetCode9 lc = new LeetCode9();
		System.out.print(lc.isPalindrome2(x));
	}

	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		String s = String.valueOf(x);
		int right = s.length() - 1;
		int left = 0;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public boolean isPalindrome2(int x) {
		int res =0;
		while(x>res) {
			res=res*10+x%10;
			x=x/10;
		}
		return (x==res||x==res/10);
	}
}
