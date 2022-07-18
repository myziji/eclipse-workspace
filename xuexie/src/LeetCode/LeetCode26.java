package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LeetCode26 {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		LeetCode26 lc = new LeetCode26();
		
		System.out.println(lc.removeDuplicates(nums));

	}

	public int removeDuplicates(int[] nums) {
		 if (nums.length == 0) return 0;
		    int i = 0;
		    for (int j = 1; j < nums.length; j++) {
		        if (nums[j] != nums[i]) {
		            i++;
		            nums[i] = nums[j];
		        }
		    }
		    return i + 1;
	}
}
