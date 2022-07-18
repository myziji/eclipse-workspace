package LeetCode;

public class LeetCode643 {
//You are given an integer array nums consisting of n elements, and an integer k.
//Find a contiguous subarray whose length is equal to k that has the maximum average value 
//and return this value. 

	public static void main(String[] args) {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		LeetCode643 lc = new LeetCode643();
		System.out.print(lc.findMaxAverage(nums, k));
	}

	public double findMaxAverage(int[] nums, int k) {
		int left = 0;
		int sum = 0;
		int res = Integer.MIN_VALUE;
		for (int right = 0; right < nums.length; right++) {
			if (right - left + 1 < k) {
				sum += nums[right];
			} else {
				sum += nums[right];
				res = Math.max(res, sum);
				sum -=nums[left];
				left++;
			}
		}
		return (double)res / k;
	}
}
//double sum=0;
//for(int i=0;i<k;i++)
//    sum+=nums[i];
//double res=sum;
//for(int i=k;i<nums.length;i++){
//    sum+=nums[i]-nums[i-k];
//        res=Math.max(res,sum);
//}
//return res/k;
//}
