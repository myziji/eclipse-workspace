package LeetCode;

public class LeetCode58 {

	public static void main(String[] args) {
		String s = "   fly me   to   the moon  ";
		LeetCode58 lc = new LeetCode58();

		System.out.println(lc.lengthOfLastWord(s));

	}

	public int lengthOfLastWord(String s) {
		int i=s.length();
		int length =0;
		while(i>0) {
			i--;
			if(s.charAt(i)!=' ') {
				length++;
			}else if(length>0) {
				return length;
			}
		}
		return length;
	}

}
