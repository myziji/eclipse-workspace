package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {

	public static void main(String[] args) {
		int[] nums = { 2,2,1,1,1,2,2};
		
		LeetCode169 lc = new LeetCode169();
		
		System.out.print(lc.majorityElement(nums));

	}

	public int majorityElement(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
		int size = nums.length/2;
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int num:map.keySet()) {
			if(map.get(num) >size) {
				return num;
			}
		}
		return -1;
	}
}
