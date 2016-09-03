/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class FirstMissingPositiveInt {

	/**
	 * @param args
	 */
	/*
	 * Leetcode link: https://leetcode.com/problems/first-missing-positive/
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingPositiveInt fmpi = new FirstMissingPositiveInt();
		int[] nums = {3,4,-1,1};
		System.out.println(fmpi.findMissingNum(nums));

	}
	
	public int findMissingNum(int[] nums){
		for(int i=0; i<nums.length; i++){
			while(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]){
				int temp = nums[i];
				nums[i] = nums[nums[i]-1];
				nums[temp-1] = temp;
			}
		}
		
		for(int i=0; i<nums.length; i++){
			if(nums[i] != i+1){
				return i+1;
			}
		}
		return nums.length+1;
	}
	


}
