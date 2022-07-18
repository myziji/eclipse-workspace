package LeetCode;

import java.util.Arrays;

public class LeetCode88 {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = { 2,5,6};
		int m = 3;
		int n = 3;
		LeetCode88 lc = new LeetCode88();
		lc.merge(nums1, m, nums2, n);

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {

		for(int i=0;i<n;i++) {
			nums1[m+i] = nums2[i];
		}
		Arrays.sort(nums1);
		System.out.print(Arrays.toString(nums1));
	}
}
