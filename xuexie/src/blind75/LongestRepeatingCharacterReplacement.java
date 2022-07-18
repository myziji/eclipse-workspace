package blind75;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		
		String s = "ABAB";
		int k = 2;
		LongestRepeatingCharacterReplacement ll= new LongestRepeatingCharacterReplacement();
		System.out.print(ll.characterReplacement(s, k));
	}
	
	
	 public int characterReplacement(String s, int k) {
		 int output=0;
		 int maxf = 1;
		 int slow=0,fast=0;
		 HashMap<Character,Integer> map = new HashMap<>();
		 while(fast<s.length()) {
			 char c = s.charAt(fast);
			 int lenth = fast-slow;
			 if(map.containsKey(c)) {
				int temp = map.get(c) +1;
				map.put(c, temp);
				if(temp>maxf) {
					maxf=temp;
				}
			 }else {
				 map.put(c,1);
			 }
			 if((1+lenth)-maxf>k) {
				 map.put(s.charAt(slow), map.get(s.charAt(slow))-1);
				 map.put(c, map.get(c)-1);
				 slow++;
			 }else {
				 fast++; 
				 if(lenth>output) {
					 output=lenth;
				 }
			 }
			 
			 
		 }
		 return output+1;
	 }

}
