<<<<<<< HEAD
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
		int[] nums = {9,985,3,2};
		LargestNumber ln = new LargestNumber();
		System.out.println(ln.largestNumber(nums));

	}
	
	String largestNumber(int[] nums){
		String[] strs = new String[nums.length];
		for(int i=0; i<nums.length; i++){
			strs[i] = String.valueOf(nums[i]);
		}
		
//		Arrays.sort(strs), new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				String lr = s1 + s2;
//				String rl = s2 + s1;
//				return -lr.compareTo(rl);
//			}
//		});
		StringBuilder sb = new StringBuilder();
		for(String s:strs)
			sb.append(s);
		
		while(sb.charAt(0) == '0' && sb.length()>1)
			sb.deleteCharAt(0);
		return sb.reverse().toString();
		
	}

}
=======
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
		int[] nums = {9,985,3,2};
		LargestNumber ln = new LargestNumber();
		System.out.println(ln.largestNumber(nums));

	}
	
	String largestNumber(int[] nums){
		String[] strs = new String[nums.length];
		for(int i=0; i<nums.length; i++){
			strs[i] = String.valueOf(nums[i]);
		}
		
//		Arrays.sort(strs), new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				String lr = s1 + s2;
//				String rl = s2 + s1;
//				return -lr.compareTo(rl);
//			}
//		});
		StringBuilder sb = new StringBuilder();
		for(String s:strs)
			sb.append(s);
		
		while(sb.charAt(0) == '0' && sb.length()>1)
			sb.deleteCharAt(0);
		return sb.reverse().toString();
		
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
