/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class SortArrayOf0s1s {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,0};
		SortArrayOf0s1s sa = new SortArrayOf0s1s();
		sa.sortArray(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}
	
	void sortArray(int nums[]) {
		int zeros = 0, ones = 0;
		for(int i = 0; i<nums.length; i++) {
			if(nums[i] == 0)
				zeros++;
			else
				ones++;
		}
		int i = 0;
		while(zeros > 0) {
			nums[i] = 0;
			++i; --zeros;
		}
		
		while(ones > 0) {
			nums[i] = 1;
			++i; --ones;
		}
	}

}
