package blind75;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] myNum1 = {1,9,3};
		int[] myNum2 = {1,1,9};
		int[] myNum3 = {1,9,9};
		int[] myNum4 = {9,9,9};
		PlusOne plusone =  new PlusOne();
		//System.out.print(Arrays.toString(plusone.plusOne(myNum1)));
		//System.out.print(Arrays.toString(plusone.plusOne(myNum2)));
		//System.out.print(Arrays.toString(plusone.plusOne(myNum3)));
		System.out.print(Arrays.toString(plusone.plusOne(myNum4)));

	}
	
	public  int[] plusOne(int[] num) {
		for(int i=num.length-1; i>=0;i--) {
			if(num[i]<9) {
				num[i] += 1;
				return num;
			}
			num[i]=0;
		}
		
		int[] result = new int[num.length+1]; 
		result[0] =1;
		return result;
	}

}
