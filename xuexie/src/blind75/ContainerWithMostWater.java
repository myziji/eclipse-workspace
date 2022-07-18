package blind75;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] hight = {1,1};
		ContainerWithMostWater cc = new ContainerWithMostWater();
		System.out.println(cc.maxArea(hight));

	}
	
	
	public int maxArea(int[] hight) {
		int output =0;
		int left =0;
		int right = hight.length-1;
		for(int i=0;i<hight.length; i++) {
			if(hight[left]>=hight[right]) {
			int	maxarea = hight[right]* Math.abs(left-right);
			if(maxarea>output) {
				output=maxarea;
			}
			right--;
			}else {
			int	maxarea = hight[left]* Math.abs(left-right);
			if(maxarea>output) {
				output=maxarea;
			}
			left++;
			}
		}
		return output;
	}

}
