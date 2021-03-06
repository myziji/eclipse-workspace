package blind75;

public class TwoSumII {
	
	public static void main(String[] arges) {
		int[] arr = {2,7,11,15};
		int target=9;
		int[] anwer =twoSum(arr,target);
		for(int i =0; i<anwer.length;i++) {
			System.out.println(anwer[i]);
		}
	}
	
	public static int[] twoSum(int[] nums,int target) {
		int left = 0;
		int right= nums.length-1;
		
		while (left<right) {
			int sum =nums[left]+nums[right];
			if(sum==target) {
				return new int[] {left+1,right+1}; 
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
			
		}
		return new int[] {-1,-1};
	}
}
