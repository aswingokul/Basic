/**
 * 
 */
package pkg_BitManip;

/**
 * @author Aswin
 *
 */
public class UpdateBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateBits ub = new UpdateBits();
		int ans = ub.updateBits(44, 5, 1, 3);
		System.out.println("ans: "+ans);
	}
	
	/*==============================================
	 * This method inserts M into N between i to j
	 * Ex: N = 1000000000, N = 10011 i = 2, j = 6
	 * Ans: 10001001100
	 * ==============================================
	 */
	public int updateBits(int n, int m, int i, int j){
		int allones = ~0;
		int left = allones << (j+1);
		int right = ((1 << i) - 1);
		int mask = left | right;
		
		int n_cleared  = n & mask;
		int m_shifted = m << i;
		return (n_cleared | m_shifted);
	}

}
