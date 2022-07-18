package LeetCode;

import java.util.Arrays;

public class LeetCode66 {

	public static void main(String[] args) {
		int[] nums = { 5 };
		LeetCode66 lc = new LeetCode66();
		int[] result = lc.plusOne(nums);
		System.out.print(Arrays.toString(result));
	}

	public int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i] += 1;
				return digits;
			}
			digits[i] = 0;

		}
		int[] result3 = new int[digits.length + 1];
		result3[0] = 1;
		return result3;
	}
}
