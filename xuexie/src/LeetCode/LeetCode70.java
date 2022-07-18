package LeetCode;

public class LeetCode70 {

	public static void main(String[] args) {
		int n = 5;
		LeetCode70 lc = new LeetCode70();

		System.out.print(lc.climbStairs(n));

	}

	public int climbStairs(int n) {

		int oneStep = 1;
		int twoStep = 1;

		for (int i = 0; i < n - 1; i++) {
			int temp = oneStep;
			oneStep = oneStep + twoStep;
			twoStep = temp;
		}
		return oneStep;
	}
}
