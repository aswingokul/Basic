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
<<<<<<< HEAD
	
	/*
	 * Source ---------------  http://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/
	 * Time Complexity = O(n log n)
	 * Space Complexity = O(n)
	 * tailTable maintains only the end elements not the entire active list 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {10, 22, 9, 33, 21, 50, 41, 60, 80}; //{2, 5, 3, 7, 11, 8, 10, 13, 6};
		LongestIncreasingSubsequence liso = new LongestIncreasingSubsequence();
		System.out.println(liso.LIS(num));		
	}
	
	public int LIS(int[] A){
		int[] tailTable = new int[A.length];
		int len = 0; // always points an empty slot
		
		tailTable[0] = A[0];
		len = 1;
		for(int i=1; i<A.length; i++){
			//new smallest value
			if(A[i] < tailTable[0])
				tailTable[0] = A[i];
			else if(A[i] > tailTable[len-1])
				tailTable[len++] = A[i];
			else
				tailTable[ceilIndex(tailTable,-1,len-1,A[i])] = A[i];
		}
		for(int i : tailTable)
			System.out.print(i + " ");
		System.out.println();
		return len;
	}
	
	static int ceilIndex(int[] Aux, int l, int r, int key){
		while(r-l > 1){
			int m = l + (r-l)/2;
			if(Aux[m] >= key)
				r = m;
			else
				l = m;
		}
		return r;
	}
	
=======
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

>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
}
