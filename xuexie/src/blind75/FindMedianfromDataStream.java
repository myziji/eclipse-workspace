package blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
	
	List<Integer> arrlist = new ArrayList<>();
	int[] arr;
	public static void main(String[] args) {
		FindMedianfromDataStream fds = new FindMedianfromDataStream();
		fds.addNum(6);
		fds.addNum(2);
		System.out.println(fds.findMedian());
		fds.addNum(10);
		System.out.println(fds.findMedian());
	}
	
	
    
    public void addNum(int num) {
    	arrlist.add(num);
    	 arr = arrlist.stream().mapToInt(i -> i).toArray();
    	Arrays.sort(arr);
    }
    
    public double findMedian() {
    	int leng = arr.length;
        if((leng)%2 ==0) {
        	int s=(leng/2)-1;
        	int l=leng/2;
        return (double)(arr[s]+arr[l])/2;
        }else {
        	int s=(leng/2);
        	 return (double)arr[s];
        }
        
    }

}
