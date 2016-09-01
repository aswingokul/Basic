/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class MinPathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = {
				{1,2}
		};
		MinPathSum mps = new MinPathSum();
		System.out.println(mps.minPathSum(nums));

	}
	
	public int minPathSum(int[][] nums){
		if(nums == null)
			return 0;
		int row = 0, col = 0, sum = nums[0][0];
		int m = nums.length, n = nums[0].length;
		while(row < m-1 && col < n-1){
			int down = sum+nums[row+1][col];
			int right = sum+nums[row][col+1];
			
			sum = Math.min(down, right);
			if(down < right)
				row++;
			else
				col++;
		}
		sum = sum + nums[m-1][n-1];
		return sum;
	}

}
