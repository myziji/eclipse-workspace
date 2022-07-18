package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode219 {

	public static void main(String[] args) {
		//Given an integer array nums and an integer k, return true 
		//if there are two distinct indices i and j in the array 
		//such that nums[i] == nums[j] and abs(i - j) <= k.
		int[] nums = { 1, 2, 3, 1,2,3 };
		int k = 2;
		LeetCode219 lc = new LeetCode219();
		System.out.print(lc.containsNearbyDuplicate(nums, k));
	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int j = map.get(nums[i]);
				if (Math.abs(i - j) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}

}
