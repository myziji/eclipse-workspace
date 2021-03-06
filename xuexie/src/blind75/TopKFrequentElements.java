package blind75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.print(topKFrequent(nums));
	}
	
	public static ArrayList<Integer> topKFrequent(int[] nums){
		Map <Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<>(nums.length);
		for(int num :nums) {
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				map.put(num, (map.get(num)+1));
			}
			
		}
		
		for(int i :map.keySet()) {
			res.indexOf(i);
		
			
		}
		return res;
		
	}
	
}
