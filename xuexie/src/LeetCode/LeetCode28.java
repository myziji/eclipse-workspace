package LeetCode;

public class LeetCode28 {

	public static void main(String[] args) {
	
		String haystack = "hello";
		String needle = "ll";
		LeetCode28 lc = new LeetCode28();
		System.out.print(lc.strStr(haystack, needle));
	}
	public int strStr(String haystack, String needle) {
		int j = needle.length();
		for(int i=0;i<haystack.length();i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(i+j-1<haystack.length()) {
					String s =haystack.substring(i,i+j);
					if(s.equals(needle)) {
						return i;
					}
					
				}
			}
		}
		return -1;
    }
}
