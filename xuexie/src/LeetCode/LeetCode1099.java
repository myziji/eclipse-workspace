package LeetCode;

import java.util.Arrays;

public class LeetCode1099 {

	public static void main(String[] args) {
		int[] nums = {254,914,110,900,147,441,209,122,571,942,136,350,160,127,178,839,201,386,462,45,735,467,153,415,875,282,204,534,639,994,284,320,865,468,1,838,275,370,295,574,309,268,415,385,786,62,359,78,854,944 };
		int target = 200;
		LeetCode1099 lc = new LeetCode1099();
		lc.twoSumLessThanK(nums, target);
		System.out.print(lc.twoSumLessThanK(nums, target));

	}

	public int twoSumLessThanK(int[] nums, int k) {
		int sum =Integer.MIN_VALUE;
		Arrays.sort(nums);
		int j =nums.length-1;
		int i =0;
		while(i<j) {
			int temp = nums[i]+nums[j];
			if(temp<k){
				sum = Math.max(sum, temp);
				i++;
			}else {
				j--;
			}
		}
		if(sum==Integer.MIN_VALUE) {
			return -1;
		}
		return sum;
	}
}
