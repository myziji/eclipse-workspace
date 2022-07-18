package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1 {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target=9;
		LeetCode1 lc = new LeetCode1();
		int[] result = lc.twoSum(nums, target);
		System.out.print(Arrays.toString(result));
		
	}
	 public int[] twoSum(int[] nums, int target) {
		 Map<Integer,Integer> map= new HashMap<>(); 
		 if(nums.length<2) {
			 return null;
		 }
		 for(int i =0;i<nums.length;i++) {
			int temp =target-nums[i];
			if(map.containsKey(temp)) {
				return new int[] {i,map.get(temp)};
			}else {
				map.put(nums[i], i);
			}
			
		 }
		 return null;
	 }
}
