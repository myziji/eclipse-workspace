package blind75;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		String s1 = "0330";
		System.out.println(validPalindrome(s1));
		
	}
	
	public static boolean validPalindrome(String s) {
		
		
	for(int i=0,r=s.length()-1;i<r;i++,r--) {
		
			while(i<r && !Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			while(i<r && !Character.isLetterOrDigit(s.charAt(r))) {
				r--;
			}
			
			if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(r))) {
				return false;
			}
			
		}
		
	
		
		return true;
	}

}
