package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242 {
	//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
	public static void main(String[] args) {
		String s = "anagvam";
		String t = "cagaram";
		LeetCode242 lc = new LeetCode242();
		System.out.print(lc.isAnagram2(s, t));
	}
	public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()) {
        	return false;
        }
        for(int i =0; i<s.length();i++) {
        	if(map.containsKey(s.charAt(i))) {
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	}else {
        		map.put(s.charAt(i), 1);
        	}
        	
        }
        
        for(int i=0; i<t.length();i++) {
        	if(!map.containsKey(t.charAt(i))) {
        		return false;
        	}
        	if(map.containsKey(t.charAt(i))) {
        		map.put(t.charAt(i), map.get(t.charAt(i))-1);
        		if(map.get(t.charAt(i))<0) {
        			return false;
        		}
        	}
        }
        return true;
        
    }

	public boolean isAnagram2(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    int[] counter = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	        counter[s.charAt(i) - 'a']++;
	        counter[t.charAt(i) - 'a']--;
	    }
	    for (int count : counter) {
	        if (count != 0) {
	            return false;
	        }
	    }
	    return true;
	}



}
