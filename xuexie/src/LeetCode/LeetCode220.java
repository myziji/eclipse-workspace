//package LeetCode;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class LeetCode220 {
//	//Given an integer array nums and two integers k and t, return true 
//	//if there are two distinct indices i and j in the array 
//	//such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.
//	public static void main(String[] args) {
//		int[] nums = {1,2,3,1};
//		int k=3;
//		int t=0;
//
//	}
//	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//        Map<Integer,Integer> map = new HashMap<>();
//        if(nums.length>k) return false;
//        int i=0;
//        int j=1;
//       while(j<nums.length) {
//    	   if(Math.abs(nums[i]-nums[j])<=t && Math.abs(i-j)<=k) {
//    		   return true;
//    	   }
//       }
//    }
//}
