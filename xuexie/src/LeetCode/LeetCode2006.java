package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode2006 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 1 };
		int target = 1;
		LeetCode2006 lc = new LeetCode2006();
		System.out.print(lc.countKDifference(nums, target));

	}

	public int countKDifference(int[] nums, int k) {
		int sum =0;
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int num:nums) {
			
			sum += map.getOrDefault(num-k, 0);
			sum += map.getOrDefault(num+k, 0);
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		return sum;
		
	}
}
