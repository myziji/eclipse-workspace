package blind75;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		ProductOfArrayExceptSelf aa = new ProductOfArrayExceptSelf();
		int[] result = aa.productExceptSelf(nums);
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		
	}
	
	public  int[] productExceptSelf(int[] nums) {
		
		int length = nums.length;
		int[] prefix =  new int[length];
		int[] postfix = new int[length];
		int[] result = new int[length];
		prefix[0] = nums[0];
		postfix[length-1] = nums[length-1];
		for(int i=1;i<=length-1;i++) {
			prefix[i] = nums[i]*prefix[i-1];
		}
		for(int i=length-2;i>=0;i--) {
			postfix[i] = nums[i]*postfix[i+1];
		}
		for(int i =0;i<length;i++ ) {
			if(i-1<0) {
				result[i] = postfix[i+1];
			}
			else if(i+1>=length) {
				result[i] = prefix[i-1];
			}else {
				result[i] = prefix[i-1]*postfix[i+1];
			}
			
		}
		return result;
	}

}
