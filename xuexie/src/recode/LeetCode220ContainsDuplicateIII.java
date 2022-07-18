package recode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class LeetCode220ContainsDuplicateIII {
//return sum==0||sum==1;
	public static void main(String[] args) {
		int[] nums = { -2147483648, 2147483647 };
		int k = 1;
		int t = 1;
		LeetCode220ContainsDuplicateIII lc = new LeetCode220ContainsDuplicateIII();
		System.out.print(lc.containsNearbyAlmostDuplicate(nums, k, t));

	}

	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		TreeSet<Long> map = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.ceiling(1L * nums[i]) != null && Math.abs(map.ceiling(1L * nums[i]) - 1L * nums[i]) <= t)
				return true;
			if (map.floor(1L * nums[i]) != null && Math.abs(1L * nums[i] - map.floor(1L * nums[i])) <= t)
				return true;
			map.add(1L * nums[i]);
			if (map.size() > k) {
				map.remove(1L*nums[i - k]);
			}
		}
		return false;

	}
}
