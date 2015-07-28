/**
 * 
 */
package pkg_Arrays;

import java.util.Arrays;

/**
 * @author Aswin
 *
 */
public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2};
		LargestNumber ln = new LargestNumber();
		System.out.println(ln.largestNumber(nums));

	}
	
	String largestNumber(int[] nums){
		String[] strs = new String[nums.length];
		for(int i=0; i<nums.length; i++){
			strs[i] = String.valueOf(nums[i]);
		}
		
		Arrays.sort(strs);
		StringBuilder sb = new StringBuilder();
		for(String s:strs)
			sb.append(s);
		
		while(sb.charAt(0) == '0' && sb.length()>1)
			sb.deleteCharAt(0);
		return sb.reverse().toString();
		
	}

}
