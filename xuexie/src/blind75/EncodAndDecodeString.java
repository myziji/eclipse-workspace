package blind75;

import java.util.ArrayList;
import java.util.List;

public class EncodAndDecodeString {

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("lint");
		str.add("code");
		str.add("love");
		str.add("you");
		EncodAndDecodeString ee = new EncodAndDecodeString();
		
		System.out.print(ee.encode(str));
		System.out.print(ee.decode(ee.encode(str)));
	}

	public String encode(List<String> strs) {
		
		StringBuilder  result =  new StringBuilder();
		for(String str : strs) {
			int length = str.length();
			result.append(length + "#");
			result.append(str);
		}
		return result.toString();
	}
	public List<String> decode(String str) {
		List<String> result = new ArrayList<>();
		int i =0;
		while (i<str.length()) {
			String res ="";
			String length = String.valueOf(str.charAt(i));
			int length12 = Integer.parseInt(length);
			if(str.charAt(i+1)=='#') {
				int j= i+2;
				while (j<i+2+length12) {
					res += str.charAt(j);
					j++;
				}
				i=j;
			}
			
			result.add(res);
		}
		
		
		return result;
	}
	
}
