package blind75;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String args[]){
        int n = 19;
        HappyNumber happyNumber = new HappyNumber();
        //happyNumber.isHappy(n);
        System.out.println(happyNumber.isHappy(n));
    }



    public  int checkNumber(int n){  
        int number =0;
        while (n > 0){
            int lastNumber = n%10;
            n=n/10;
            number += lastNumber *lastNumber;
        }
        
        System.out.println(number);
        return  number;
    }
    
    public boolean isHappy(int n) {
    	Set<Integer> set = new HashSet<>();
    	 while (n != 1 && !set.contains(n)){
           set.add(n);
           n =checkNumber(n);
         }
    	 if(n==1) {
    		 return true;
    	 }
     return false;
    }



}
