<<<<<<< HEAD
/**
 * 
 */
package pkg_DP;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aswin
 *
 */
public class LongestConsecutiveSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,2,200,1,3,4};
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		System.out.println(lcs.longestConsecutiveSequence(nums));

	}
	
	int longestConsecutiveSequence(int[] nums){
		int max = 0;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<nums.length; i++){
			set.add(nums[i]);
		}
		
		for(int n : nums){
			int left = n-1;
			int right = n+1;
			int count = 1;
			set.remove(n);
			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}
			
			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}
			
			max = Math.max(max, count);
		}
		return max;
	}

}
=======
/**
 * 
 */
package pkg_DP;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aswin
 *
 */
public class LongestConsecutiveSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,2,200,1,3,4};
		LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
		System.out.println(lcs.longestConsecutiveSequence(nums));

	}
	
	int longestConsecutiveSequence(int[] nums){
		int max = 0;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<nums.length; i++){
			set.add(nums[i]);
		}
		
		for(int n : nums){
			int left = n-1;
			int right = n+1;
			int count = 1;
			set.remove(n);
			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}
			
			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}
			
			max = Math.max(max, count);
		}
		return max;
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
