package blind75;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n =5;
		ClimbingStairs cs = new ClimbingStairs();
	
		System.out.print(cs.climbStairs(n));
	}
	
	
	public int climbStairs(int n) {
		int one = 1;
		int two = 1;
		for(int i=0;i<n-1;i++) {
			int temp =one;
			one = one +two;
			two =temp;
		}
		return one;
	}

}
