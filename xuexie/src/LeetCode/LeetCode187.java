package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCode187 {

	public static void main(String[] args) {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		LeetCode187 lc = new LeetCode187();
		System.out.print(lc.findRepeatedDnaSequences(s));
	}

	public List<String> findRepeatedDnaSequences(String s) {
		List<String> result = new ArrayList<>();
		Set<String> map = new HashSet<>();
		if (s.length() < 10) {

			return result;
		}
		int left = 0;
		for (int i = 10; i < s.length() + 1; i++) {
			String temp = s.substring(left, i);
			if (map.contains(temp) && !result.contains(temp)) {
				result.add(temp);
			}
			map.add(temp);
			left++;
		}
		return result;
	}

//	public List<String> findRepeatedDnaSequences(String s) {
//		List<String> result = new ArrayList<>();
//		Set<String> map = new HashSet<>();
//		if(s.length()<10) {
//			result.add(s);
//			return result;
//		}
//		int length=s.length()-10+1;
//		for(int i = 0;i <length;i++) {
//			String temp = s.substring(i,i+10);
//			if(map.contains(temp) && !result.contains(temp)) {
//				result.add(temp);
//			}
//			map.add(temp);
//		}
//		return result;
//	}
}
