package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49 {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		LeetCode49 lc = new LeetCode49();
		System.out.print(lc.groupAnagrams(strs).toString());
	}
	 public List<List<String>> groupAnagrams(String[] strs) {
		 Map<String,List<String>> map = new HashMap<>();
		 for(String s: strs) {
			 char[] temp = s.toCharArray();
			 Arrays.sort(temp);
			 String key = String.valueOf(temp);
			 if(map.containsKey(key)) {
				 map.get(key).add(s);
			 }else {
				 map.put(key, new ArrayList());
				 map.get(key).add(s);
			 }
		 }
		 return new ArrayList(map.values());
	 }
}
