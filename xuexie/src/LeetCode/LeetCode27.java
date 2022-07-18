package LeetCode;

public class LeetCode27 {

	public static void main(String[] args) {
		int[] nums = {0,1,2,2,3,0,4,2 };
		int val = 2;
		LeetCode27 lc = new LeetCode27();

		System.out.println(lc.removeElement(nums, val));

	}

	public int removeElement(int[] nums, int val) {
		int j=0;
		
		for(int i =0;i<nums.length;i++) {
			if(nums[i]!=val) {
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}

}
