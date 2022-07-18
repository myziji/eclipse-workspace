package recode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode49GroupAnagrams {

	public static void main(String[] args) {
		String[] s = {"eat","tea","tan","ate","nat","bat"};
		LeetCode49GroupAnagrams lc = new LeetCode49GroupAnagrams();
		System.out.print(lc.groupAnagrams(s));

	}
	 public List<List<String>> groupAnagrams(String[] strs) {
		 HashMap<String,List<String>> map= new HashMap<>();
		 for(String s : strs) {
			 char[] temp =s.toCharArray();
			 Arrays.sort(temp);
			 String key = String.valueOf(temp);
			 if(!map.containsKey(key)) {
				 map.put(key, new ArrayList<>());
			 }
			 map.get(key).add(s);
		 }
		 return new ArrayList<>(map.values());
	 }
}
