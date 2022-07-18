package LeetCode;



public class LeetCode35 {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6,7};
		int target = 7;
		LeetCode35 lc = new LeetCode35();
		System.out.print(lc.searchInsert(nums, target));

	}

	public int searchInsert(int[] nums, int target) {
		int left =0;
		int right =nums.length;
		int mid =0;
		
		while(left<right) {
			mid= left+(right-left)/2;
			if(nums[mid]==target) {
				return mid;
			}
			if(target<nums[mid]) {
				right=mid-1;
			}else
			{
				left=mid+1;
			}
		}
		return left;
		
	}
}
