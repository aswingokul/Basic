/**
 * 
 */
package pkg_Arrays;

import java.util.Arrays;
import java.util.Collections;


/**
 * @author Aswin
 *
 */
public class NextPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextPermutation np = new NextPermutation();
		int[] nums = {2,2,7,5,4,3,1};
		np.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	public int[] nextPermutation(int[] nums){
		int maxIndex = -1;
		for(int i=nums.length-2; i>=0; i--){
			if(nums[i] < nums[i+1]){
				maxIndex = i;
				break;
			}
		}
		
		if(maxIndex == -1){
			reverse(nums, 0, nums.length-1);
			return nums;
		}
		
		int nextMaxInd = -1;
		for(int i=nums.length-1; i>maxIndex; i--){
			if(nums[i] > nums[maxIndex]){
				nextMaxInd = i;
				break;
			}
		}
		
		int temp = nums[maxIndex];
		nums[maxIndex] = nums[nextMaxInd];
		nums[nextMaxInd] = temp;
		
		reverse(nums, maxIndex+1, nums.length-1);
		return nums;
	}
	
	public void reverse(int[] src, int start, int end){
		while(start < end){
			int temp = src[start];
			src[start] = src[end];
			src[end] = temp;
			start++;
			end--;
		}
	}
	
	

}
