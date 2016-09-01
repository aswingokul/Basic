/**
 * 
 */
package pkg_DP;

import java.util.Arrays;

/**
 * @author Aswin
 *
 */
public class TripleSteps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripleSteps ts = new TripleSteps();
		System.out.println(ts.countWays(35));
		System.out.println(ts.backtrack(35));
	}
	
	public int countWays(int n){
		int[] memo = new int[n+1];
		Arrays.fill(memo, -1);
		return countWays(n, memo);
	}
	
	public int countWays(int n, int[] memo){
		if(n < 0 )
			return 0;
		else if(n== 0)
			return 1;
		else if(memo[n] > -1)
			return memo[n];
		else{
			memo[n] = countWays(n-1, memo) + countWays(n-2, memo) + countWays(n-3, memo);
			return memo[n];
		}
	}
	
	public int backtrack(int n){
		if(n < 0)
			return 0;
		else if(n == 0)
			return 1;
		else{
			return backtrack(n-1) + backtrack(n-2) + backtrack(n-3);
		}
	}

}
