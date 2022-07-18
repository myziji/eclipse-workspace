package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode217 {
	//Given an integer array nums, return true if any value appears at least twice 
	//in the array, and return false if every element is distinct.
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		LeetCode217 lc = new LeetCode217();
		System.out.print(lc.containsDuplicate(nums));
	}
	 public boolean containsDuplicate(int[] nums) {
	 
		Map<Integer,Integer> map  = new HashMap<>();
		
		for (int i = 0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				return true;
			}
			map.put(nums[i], 1);
		}
		
		return false;
		
	 }
}
