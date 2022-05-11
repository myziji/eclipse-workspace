package blind75;

import java.util.Arrays;

public class TwoSumLessThanK {
	
	public static void main(String[] args) {
		int[] arr= {34,23,1,24,75};
		int tagert = 60;
		System.out.println(twoSumLessThanK(arr,tagert));
	}
	
	public static int twoSumLessThanK(int nums[],int k) {
		
		Arrays.sort(nums);
		int sum=-1;
		int left =0;
		int right = nums.length-1;
		while(left<right) {
			if(nums[left]+nums[right] < k) {
				sum = Math.max(sum, nums[left]+nums[right]);
				left++;
			}else {
				right--;
			}
		}
	
		
			return sum;
		
	}
	
}
