package recode;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode219ContainsDuplicateII {

	public static void main(String[] args) {
		int[] nums = { 1,2,3,1};
		int k = 3;
		LeetCode219ContainsDuplicateII lc = new LeetCode219ContainsDuplicateII();
		System.out.print(lc.containsNearbyDuplicate(nums, k));

	}

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashSet<Integer> map = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.contains(nums[i])) {
				return true;
			}
			map.add(nums[i]);
			if (map.size() > k) {
				map.remove(nums[i - k]);
			}
		}
		return false;
	}
}
