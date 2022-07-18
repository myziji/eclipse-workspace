package blind75;

import java.util.HashMap;
import java.util.Map;

public class PermutationinString {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		
	}
	public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> s1map = new  HashMap<>();
        Map<Character,Integer> s2map = new HashMap<>();
        
       for(int i = 0; i<s1.length();i++) {
    	   if(s1map.containsKey(s1.charAt(i))) {
    		   int x=s1map.get(s1.charAt(i))+1;
    		   s1map.put(s1.charAt(i), x);
    		//   s1map.put(s1.charAt(i), s1map.getOrDefault(s1.charAt(i), 0) + 1);
    	   }
    	   s1map.put(s1.charAt(i),1);
       }
//       for(int i = 0; i<s2.length();i++) {
//    	   if(s2map.containsKey(s2.charAt(i))) {
//    		   int x=s2map.get(s2.charAt(i))+1;
//    		   s1map.put(s2.charAt(i), x);
//    	   }
//    	   s1map.put(s2.charAt(i),1);
//       }
       
       int slow =0;
       int fast =0;
     while(fast<s2.length()) {
    	 if(fast-slow==s1.length()) {
    		 if(s1map.containsKey(s2.charAt(slow))) {
 //////////////////////
    			 
    		 }else {
    			 slow++;
    			 fast++;
    		 }
    		 
    	 }
    	 if(fast-slow<s1.length()) {
    		 if(s2map.containsKey(s2.charAt(fast))) {
    	  		   int x=s2map.get(s2.charAt(fast))+1;
    	  		   s1map.put(s2.charAt(fast), x);
    	  	   }
    		 s1map.put(s2.charAt(fast),1);
        	 fast++;
    	 }
    	 
     }
        
        return false;
    }
}
