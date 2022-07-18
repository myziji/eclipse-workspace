package LeetCode;

public class LeetCode209 {

	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		int target = 7;
		LeetCode209 lc = new LeetCode209();
		System.out.print(lc.minSubArrayLen(target, nums));
	}

	public int minSubArrayLen(int target, int[] nums) {
		int left = 0;
		int sum = 0;
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			while (sum >= target) {
				result= Math.min(result, i-left+1);
				sum-=nums[left];
				left++;
			}
		}
		if(result==Integer.MAX_VALUE) {
			return 0;
		}
		return result;
	}
}
