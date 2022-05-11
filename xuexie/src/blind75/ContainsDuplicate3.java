package blind75;

import java.util.Set;
import java.util.TreeSet;

public class ContainsDuplicate3 {
	
	public static void main(String[] agres) {
		int[] arr = {1,0,1,1};
		int k=1;
		int t=2;
		System.out.println(ContainsDuplicate(arr,k,t));
		System.out.println(ContainsDuplicate2(arr,k,t));
	}
	
	public static boolean ContainsDuplicate(int[] nums,int k,int t) {
		for (int i =0;i<nums.length;i++) {
			for (int j=0;j<i;j++) {
				if(Math.abs(i-j)<=k) {
					if(Math.abs(nums[i]-nums[j])<=t) {
						return true;
					}
				}
			}
		}
		return false;
		
		
	}
	 public static boolean ContainsDuplicate2(int[] nums,int k,int t) {
		 TreeSet<Integer> set = new TreeSet<>();
		 for(int i =0;i<nums.length;i++) {
			 if(set.floor(nums[i]) !=null) {
				 int floor = set.floor(nums[i]);
				 if(Math.abs(floor-nums[i])<=t) {
					 return true;
				 }
			 }
			 if(set.ceiling(nums[i]) !=null) {
				 int ceil = set.ceiling(nums[i]);
				 if(  Math.abs(ceil-nums[i])<=t) {
					 return true;
				 }
			 }
			
		
			 
			 set.add(nums[i]);
			 
			 if(set.size()>k) {
				 set.remove(nums[i-k]);
			 }
		 }
		 return false;
	 }
}
