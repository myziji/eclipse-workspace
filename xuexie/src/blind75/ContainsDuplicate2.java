package blind75;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

	public static void main(String[] arges) {
		int[] arr = {1,2,3,4,1};
		int k =4;
		System.out.println(ContainsDuplicate(arr,k));
		System.out.println(ContainsDuplicate2(arr,k));
		
	}
	//solution 1 
	public static boolean ContainsDuplicate(int[] nums, int k) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j] && Math.abs(i-j)<=k) {
					return true;
				}
			}
		}
		return false;
	}
	//solution 2
	
	public static boolean ContainsDuplicate2(int[] nums,int k) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int index =map.get(nums[i]);
				if(Math.abs(i-index)<=k) {
					return true;
				}
			}
			map.put(nums[i],i);
		}
		return false;
	}
	
}
