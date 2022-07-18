package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode163 {

	public static void main(String[] args) {
		int[] nums = {-1};
		int lower = -1;
		int upper = 0;
		LeetCode163 lc = new LeetCode163();
		System.out.print(lc.findMissingRanges(nums, lower, upper));

	}

	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> res = new ArrayList<>();
		if(nums.length==0) {
			if(lower==upper) {
				res.add(String.valueOf(lower));	
			}else {
				res.add(String.valueOf(lower) +"->" + String.valueOf(upper));
			}
		}
		for (int num : nums) {
			if (num == lower) {
				lower++;
			} else if (lower < num) {
				if (lower + 1 == num) {
					res.add(String.valueOf(lower));
				} else {
					res.add(String.valueOf(lower) + "->" + String.valueOf(num-1));
				}
				lower = num + 1;
			}
		}
		if (nums.length>1 && nums[nums.length - 1] < upper) {
			if (nums[nums.length - 1] == upper) {
				res.add(String.valueOf(nums[nums.length - 1]));
			} else {
				res.add(String.valueOf(nums[nums.length - 1] + 1) + "->" + String.valueOf(upper));
			}
		}
		return res;
	}
}
