package blind75;

public class BinarySearch {

	public static void main(String[] args) {

		int[] nums = {-1,4,8,5,9,12,22};
		int target =4;
		BinarySearch bs = new BinarySearch();
		System.out.print(bs.binarySearch(nums,target));
		
	}
	
	public  int binarySearch(int[] nums, int target) {
		int x =0;
		int j=nums.length-1;
		while(x<=j) {
			 int mid = (x+j)/2;
			if(nums[mid]==target) {
				return mid;
			}
			if(nums[mid]>target) {
				j = mid-1;
			}else {
				//nums[mid]<target
				x = mid +1;
			}
		}
		
		
		
		return -1;
	}

}
