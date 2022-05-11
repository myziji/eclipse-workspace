package blind75;

public class BestTimeToBuySellStock {

	public static void main(String[] args) {
		int[] prices = {7,2,5,3,2,4,1,9};
		System.out.print(BuySellStock(prices));
	}
	
	public static int BuySellStock(int [] p) {
		int profit=0;
		for(int l=0, r=l+1; r<p.length;r++) {
			if(p[l]-p[r]>=0) {
				l=r;
				r++;
			}
			if(p[l]-p[r]<0) {
				int temp =Math.abs(p[l]-p[r]);
				if(temp>profit) {
					profit=temp;
			}
				
				
				
			}
			
		}
		return profit;
	}
}
