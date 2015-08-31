/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class MaxAverageSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxAverageSubArray masa = new MaxAverageSubArray();
		int[] nums = {1, 12, -5, -6, 50, 3};
		int k = 4;
		System.out.println("1. The max avg sub array of len " + k +" begins at index "+ masa.maxAvgSubArray(nums, k));
		System.out.println("2. The max avg sub array of len " + k +" begins at index "+ masa.maxAvgSubArray2(nums, k));
		

	}
	/*===============================================
	 * This method returns the beginning index of the
	 * sub array having the max average for the given
	 * length. Time Complexity = O(n) and  
	 *  Space Complexity = O(n)
	 *===============================================
	 */
	public int maxAvgSubArray(int[] nums,int k) {
		if(k > nums.length)
			return -1;
		int[] csum = new int[nums.length];
		csum[0] = nums[0];
		for(int i=1; i<nums.length; i++) {
			csum[i] = csum[i-1]+ nums[i];
		}
		
		int maxSum = csum[k-1];
		int max_end = k-1;
		
		for(int i = k; i< nums.length; i++) {
			int currSum = csum[i] - csum[i-k];
			if(currSum > maxSum) {
				maxSum = currSum;
				max_end = i;
			}
		}
		return max_end-k+1;
	}
	
	public int maxAvgSubArray2(int[] nums, int k) {
		if(k > nums.length)
			return -1;
		int sum = nums[0];
		for(int i=1;i<k;i++) {
			sum += nums[i];
		}
		int maxSum = sum, maxEnd = k-1;
		for(int i=k; i<nums.length; i++) {
			int csum = sum + nums[i] - nums[i-k];
			if(csum > maxSum) {
				maxSum = csum;
				maxEnd = i;
			}
		}
		return maxEnd-k+1;
	}
	

}
