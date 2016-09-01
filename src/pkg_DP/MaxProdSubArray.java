/**
 * 
 */
package pkg_DP;

/**
 * @author aswin
 *
 */
public class MaxProdSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,-3,4,1,-2};
		MaxProdSubArray mpsa = new MaxProdSubArray();
		System.out.println("Max Prod: "+ mpsa.maxProd(nums));
	}
	
	public int maxProd(int[] nums) {
		int res = nums[0];
		int max = nums[0];
		int min = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			int tmax = max;
			int tmin = min;
			max = Math.max(Math.max(tmax*nums[i], tmin*nums[i]), nums[i]);
			min = Math.min(Math.min(tmax*nums[i], tmin*nums[i]), nums[i]);
			res = Math.max(res, max);
		}
		return res;
	}

}
