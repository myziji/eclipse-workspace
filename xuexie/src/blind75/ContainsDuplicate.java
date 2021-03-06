package blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

	
	public static void main(String agrs[]) {
		// leecode 216
		int[] arr = {1,2,3,4,5,6};
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicate2(arr));
		System.out.println(containsDuplicate3(arr));
		
	}
	
	//solution 1 Time O(n^2) Space O(1)
	public static boolean containsDuplicate(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0; j<i;j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	//solution 2 Time O(nlogn)  space O(1)
	public static boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		for(int i =0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				return true;
			}
			
		}
		return false;
	}
	//solution 2 Time O(n)  space O(n)
	public static boolean containsDuplicate3(int[] nums) {
		Set<Integer> set =  new HashSet<>(nums.length);
		for(int i=0;i<nums.length;i++) {
			if(set.contains(nums[i])) {
				return true;			
			}
			set.add(nums[i]);
		}
		return false;
	}
	
	
	
	
	
}
