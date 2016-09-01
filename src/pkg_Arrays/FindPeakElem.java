/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class FindPeakElem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPeakElem fpe = new FindPeakElem();
		int[] nums = {1,2,3,1};
		System.out.println(fpe.peak(nums));
	}
	
	/*============================================================================================================== 
	 *peak element is an element that is greater than its neighbors.
	 *Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
	 *The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
	 *You may imagine that num[-1] = num[n] = -∞.
     *For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
	 *============================================================================================================== 
	 */
	int peak(int[] nums) {
		if(nums.length == 0)
			return -1;
		int peak = nums[0], peakind = 0;
		for(int i=1; i<nums.length;i++) {
			if(peak < nums[i]) {
				peak = nums[i];
				peakind = i;
			}
		}
		return peakind;
	}

}
