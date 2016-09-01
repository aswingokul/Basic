/**
 * 
 */
package pkg_DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aswin
 *
 */
public class CombinationSum1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSum1 cs1 = new CombinationSum1();
		int[] nums = {1,2,3};
		cs1.combinationSum1(nums, 5);

	}
	
	public void combinationSum1(int[] nums, int target){
		if(nums == null || nums.length == 0)
			return;
		Arrays.sort(nums);
		List<Integer> curr = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		combinationSum1(nums, target, 0, curr, result);		
		System.out.println(result);
	}
	
	public void combinationSum1(int[] nums, int target, int start, List<Integer> curr, List<List<Integer>> result){
		if(target < 0 )
			return;
		if(target == 0){
			result.add(new ArrayList<Integer>(curr));
			//curr = new ArrayList<Integer>();
		}
		for(int i=start; i<nums.length; i++){
			curr.add(nums[i]);
			combinationSum1(nums, target-nums[i], i, curr, result);
			curr.remove(curr.size()-1);
		}
	}

}
