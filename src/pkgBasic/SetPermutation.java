/**
 * 
 */
package pkgBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aswin
 *
 */
public class SetPermutation {
	static int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetPermutation sp = new SetPermutation();
		int[] A= {1,2,3};
//		sp.permutation(A);
		sp.permutation2(A);

	}
	
	public void permutation(int[] A){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		permutation(A, new ArrayList<Integer>(), result);
		System.out.println(result);
	}
	
	public void permutation(int[] A, List<Integer> curr, List<List<Integer>> result){
		if(curr.size() == A.length){
			result.add(new ArrayList<Integer>(curr));
			return;
		}
		for(int i=0; i<A.length; i++){
			if(curr.contains(A[i]))
				continue;
			curr.add(A[i]);
			permutation(A, curr, result);
			curr.remove(curr.size()-1);
		}
	}
	
	public void permutation2(int[] nums){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for(int i=0; i<nums.length; i++){
			for(int j=0; j<nums.length; j++){
				List<Integer> temp = swap(i, j, nums);
				result.add(new ArrayList<Integer>(temp));
			}
		}
		System.out.println(result);
		
	}
	
	public List<Integer> swap(int i, int j, int[] nums){
		int[] newNums = Arrays.copyOf(nums, nums.length);
		int tmp = newNums[i];
		newNums[i] = newNums[j];
		newNums[j] = tmp;
		return toList(newNums);
	}
	
	public static List<Integer> toList(int[] nums){
		List<Integer> ret = new ArrayList<Integer>();
		for(int i : nums){
			ret.add(i);
		}
		return ret;
	}
}
