/**
 * 
 */
package pkg_DP;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aswin
 *
 */
public class SubArraySumZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySumZero sas = new SubArraySumZero();
		int[] nums = {1,2,3,4,-9,6,7,-8,1,9};
		sas.subArraySumZero(nums);
	}
	
	void subArraySumZero(int[] nums) {
		Map<Integer,Integer> sumMap = new HashMap<Integer,Integer>();
		int currSum = 0;
		for(int i = 0;i<nums.length; i++ ) {
			currSum += nums[i];
			if(currSum == 0) {
				System.out.println("subset: {0 - "+i+"}");
			}else if(sumMap.containsKey(currSum)) {
				System.out.println("subset: {"+(sumMap.get(currSum)+1) +" - "+i+" }");
			}else {
				sumMap.put(currSum, i);
			}
		}
		System.out.println("HashMap has "+sumMap);
	}

}
