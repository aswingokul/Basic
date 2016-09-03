/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class MinSubArrayMaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,3,1,2,4,3};
		int s = 7;
		MinSubArrayMaxSum msam = new MinSubArrayMaxSum();
		System.out.println(msam.minSubArrayLen(nums, s));

	}
	
	private int minSubArrayLen(int[] nums, int s){
		if(nums == null || nums.length < 0) return 0;
		
		int start = 0, end = 0, sum = 0, min = Integer.MAX_VALUE;
		
		while(end < nums.length){
			sum += nums[end];
			while(sum >= s){
				min = Math.min(min, end-start+1);
				sum -= nums[start++];
			}
			end++;
		}
		return min == Integer.MAX_VALUE ? 0 : min;
	}

}
