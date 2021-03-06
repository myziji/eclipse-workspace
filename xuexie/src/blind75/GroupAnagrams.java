package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] agrs) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
	
	public static ArrayList<String> groupAnagrams(String[] s) {
		Map<String,List<String>> map =new HashMap<>();
		
		for(String slist: s) {
		char[] ca=	slist.toCharArray();
		Arrays.sort(ca);
		String key = String.valueOf(ca);
		if(!map.containsKey(key)) {
			map.put(key, new ArrayList());
		}
		map.get(key).add(slist);
		}
		return new ArrayList(map.values());
	}
}
