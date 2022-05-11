package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ValidAnagram {
	
	public static void main(String[] args) {
		
		String s= "anagram";
		String t= "tnagaram";
		//System.out.println(validAnagram(s,t));
		System.out.println(validAnagram2(s,t));
	}
	
	public static boolean validAnagram(String s,String t) {

		int count=1;
		Map<Character,Integer> map = new HashMap<>();
		Map<Character,Integer> map2 = new HashMap<>();
		for(int i =0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),count +1);
			}else {
				map.put(s.charAt(i),count);
			}
			if(map2.containsKey(t.charAt(i))) {
				map.put(t.charAt(i),count +1);
			}else {
				map2.put(t.charAt(i),count);
			}
		}
		return false;
		
	}
	
	
	public static boolean validAnagram2(String s,String t) {
		char temparry[] = s.toCharArray();
		char temparry2[] =t.toCharArray();
		Arrays.sort(temparry);
		Arrays.sort(temparry2);
		if(temparry.length != temparry2.length) {
			return false;
		}
		for(int i =0;i<temparry.length;i++) {
			if(temparry[i] != temparry2[i]) {
				return false;
			}
		}
		return true;
	}
	
}
