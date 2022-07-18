package blind75;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		LongestConsecutiveSequence ss = new LongestConsecutiveSequence();
		System.out.print(ss.longestConsecutive(nums));
	}

	public int longestConsecutive(int[] nums) {
		
		Set<Integer> set =  new HashSet<>();
		int result=0;
		for(int num : nums) {
			set.add(num);
		}
		for(int i =0;i<nums.length;i++) {
			if(!set.contains(nums[i]-1)) {
				int temp=1;
				while(set.contains(nums[i]+1)) {
					nums[i]++;
					temp++;
				}
				if(temp>result) {
					result = temp;
				}
			}
		}
		
		
		
		return result;
	}
}
