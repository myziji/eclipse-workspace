package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode14 {

	public static void main(String[] args) {
		String[] strs  = {"flower","flow","flight"};
		LeetCode14 lc = new LeetCode14();
		System.out.print(lc.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		String prefix =strs[0];
		for(int i=0;i<strs.length;i++) {
			int j=0;
			while(j<prefix.length() && j<strs[i].length()&& prefix.charAt(j)==strs[i].charAt(j)) {
				j++;
			}
			prefix=prefix.substring(0,j);
		}
		return prefix;
		
	}
}
