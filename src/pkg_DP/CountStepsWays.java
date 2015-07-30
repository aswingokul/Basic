/**
 * 
 */
package pkg_DP;

import java.util.HashMap;

/**
 * @author Aswin
 *
 */
public class CountStepsWays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int countWays(int n){
		if(n<0){
			return 0;
		}else if(n == 0){
			return 1;
		}else{
			return countWays(n-1)+countWays(n-2)+countWays(n-3);
		}
	}
	
	static int countWays(int n, HashMap<Integer,Integer> map){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else if(map.containsKey(n)){
			return map.get(n);
		}else{
			map.put(n, countWays(n-1,map)+countWays(n-2,map)+countWays(n-3,map));
			return map.get(n);
		}
	}

}
