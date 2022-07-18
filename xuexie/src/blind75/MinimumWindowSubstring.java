package blind75;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String t = "ABC";
	}
	
	public String minWindow(String s,String t) {
		
		Map<Character,Integer> coutmap = new HashMap<>();
		Map<Character,Integer> havemap = new HashMap<>();
		int cout = t.length();
		int have =0;
		int left =0;
		int right =0;
		String result = "" ;
		for(int i=0;i<t.length();i++) {	
			if(coutmap.containsKey(t.charAt(i))) {
				int x = coutmap.get(t.charAt(i))+1;
				coutmap.put(t.charAt(i), x);
			}else {
				coutmap.put(t.charAt(i), 1);
			}
			
		}
		
		for(int i=0;i<s.length();i++) {
			if(coutmap.containsKey(s.charAt(i))) {
				if(havemap.containsKey(s.charAt(i))) {
					int x =  havemap.get(t.charAt(i))+1;
					havemap.put(t.charAt(i), x);
					have++;
				}else {
					havemap.put(t.charAt(i), 1);
					have++;
				}
			 result += Character.toString(s.charAt(i));
			}
			result += Character.toString(s.charAt(i));
		}
		
		
		
		
		
		return result;
	}
}
