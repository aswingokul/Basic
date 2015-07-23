/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class MatrixElemSort {

	/**
	 * @param args
	 */
	
	static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = {{10, 20, 30},	{11,21,31}, {12,22,32}};
		MatrixElemSort mo = new MatrixElemSort();
		int size = m.length;
		for(int i = 0; i<size*size; i++){
			System.out.print(mo.extractMin(m)+" ");
		}
	}
	
	private int extractMin(int m[][]){
		int ret = m[0][0];
		m[0][0] = INF;	
		youngify(m,0,0);
		return ret;
	}
	
	private void youngify(int m[][],int i, int j){
		int N = m.length;
		int downval = (i+1<N)?m[i+1][j]:INF;
		int rightval = (j+1<N)?m[i][j+1]:INF;
		
		//If m[i][j] is down right corner elem then return
		if(downval == INF && rightval == INF)
			return;
		
		
		if(downval < rightval){
			m[i][j] = downval;
			m[i+1][j] = INF;
			youngify(m,i+1,j);			
		}else{
			m[i][j] = rightval;
			m[i][j+1] = INF;
			youngify(m,i,j+1);
		}
	}

}
