/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class UniquePaths {

	/**
	 * @param args
	 */
	static int up = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePaths ups = new UniquePaths();
		ups.uniquePath(2, 2);
		System.out.println("Unique Paths: " + up);
		System.out.println(ups.DPSol(2, 2));
	}
	
	public void uniquePath(int m, int n){
		if(m<0 || n<0) return;
		if(m == 0 && n == 0){ 
			up++;
			return;
		}
		uniquePath(m-1, n);
		uniquePath(m,n-1);
		
	}
	
	public int DPSol(int m, int n){
		int[][] map = new int[m][n];
		for(int i=0; i<m; i++){
			map[i][0] = 1;
		}
		
		for(int j=0; j<n; j++){
			map[0][j] = 1;
		}
		
		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				map[i][j] = map[i-1][j] + map[i][j-1];
			}
		}
		return map[m-1][n-1];
	}
}
