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
public class SubSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		SubSets ss = new SubSets();
		ss.subSets(nums);
	}
	
	public void subSets(int[] nums){
		if(nums == null || nums.length == 0)
			return;
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> curr = new ArrayList<Integer>();
		
		subSets(nums, 0, curr, result);
		System.out.println(result);
	}
	
	public void subSets(int[] nums, int start, List<Integer> curr, List<List<Integer>> result){
		result.add(new ArrayList<Integer>(curr));
		for(int i=start; i<nums.length; i++){
			curr.add(nums[i]);
			subSets(nums, i+1, curr, result);
			curr.remove(curr.size()-1);
		}
	}

}
