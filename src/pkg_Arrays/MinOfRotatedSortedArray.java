/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class MinOfRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinOfRotatedSortedArray mrsa = new MinOfRotatedSortedArray();
		int[] nums = {4,5,6,7,0,1,2,3};
		mrsa.findMin(nums);
	}
	
	void findMin(int[] nums) {
		if(nums.length <= 1)
			System.out.println(nums[0]);
		int min = nums[0];
		int left = 0, right = nums.length-1;
		while(left < right-1) {
			int mid = (left+right)/2;
			if(nums[left] < nums[mid]) {
				min = Math.min(min, nums[left]);
				left = mid+1;
			}else {
				min = Math.min(min, nums[mid]);
				right = mid-1;
			}
		}
		min = Math.min(min, Math.min(nums[left], nums[right]));
		System.out.println(min);		
	}

}
