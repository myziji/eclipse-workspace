package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = {-1,0,1,2,-1,4};
		ThreeSum threeSum =  new ThreeSum();
		System.out.println(threeSum.threeSum(nums));
		
	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list= new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0; i<nums.length ;i++) {
			if(i==0 || ( i>0 && nums[i] != nums[i-1])){
				twoSum(nums,i,list);
			}
			
		}
		return list;
	
	}	
		
	public static int[] twoSum(int[] nums,int i,List<List<Integer>> list) {
		int left = i+1;
		int right= nums.length-1;
		
		while (left<right) {
			int sum =nums[left]+nums[right]+nums[i];
			if(sum<0) {
				left++;
			}else if(sum>0) {
				right--;
			}else {
					list.add(Arrays.asList(nums[left]+nums[right]+nums[i]));
					while(left <right && nums[left]==nums[left-1]) {
						left++;
					}
			}
			
		}
		return new int[] {-1,-1};
	}
		
		
	
}
