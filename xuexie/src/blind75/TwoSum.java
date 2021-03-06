package blind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] agrs) {
		int[] arr = {3,3,4,15};
		int target = 6;
		int[] answer= twoSum(arr,target);
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]);
		}
	}
	
	public static int[] twoSum(int[] nums,int k) {
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int n = k-nums[i];
			if(map.containsKey(n)) {
				return new int[] {i,map.get(n)};
			}
		map.put(nums[i], i);
		}
		return null;
	}


}
