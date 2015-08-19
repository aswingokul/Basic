/**
 * 
 */
package pkg_DP;

/**
 * @author aswin
 *
 */
public class LongestIncreasingSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {-1,-2,-3,-4,-5,-6,-7};
		LongestIncreasingSubsequence liso = new LongestIncreasingSubsequence();
		liso.lis(num);
	}
	
	void lis(int[] num) {
		int start = 0, end = 0;
		int maxlen = 1, diff = 0;
		int left = 0, right =0;
		for(int i=0; i<num.length-1; i++) {
			if(num[i] < num[i+1]) {
				end = i+1;
				left = start;
				right = end;
			}else {				
				start = end = i+1;
			}
			
			diff = end-start+1;
			if(maxlen < diff)
				maxlen = diff;
		}
		
		for(int i = left; i <= right; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
