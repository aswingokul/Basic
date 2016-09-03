/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class ValidSudoku1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public boolean isValidSudoku (char[][] board){
		if(board == null)
			return false;
		int size = board.length;
		for(int i=0; i<size; i++){
			boolean[] colMap = new boolean[size];
			for(int j=0; j<size; j++){
				if(board[i][j] != '.'){
					int diff = board[i][j] - '1';
					System.out.println("colMap[" + diff + "]: " + colMap[diff]);
					if(colMap[diff])
						return false;
					colMap[diff] = true;
				}
			}
			
			boolean[] rowMap = new boolean[size];
			for(int k=0; k<size; k++){
				if(board[k][i] != '.'){
					int diff = board[k][i] -'1';
					System.out.println("rowMap[" + diff + "]: " + rowMap[diff]);
					if(rowMap[diff])
						return false;
					rowMap[diff] = true;
				}
			}
			
			boolean[] map3x3 = new boolean[size];
			for(int m=0; m < size; m++){
				int x = m / 3 + (i/3) * 3;
				int y = m % 3 + (i%3) * 3;
				
				if(board[x][y] != '.'){
					int diff = board[x][y]-'1';
					if(map3x3[diff])
						return false;
					map3x3[diff] = true;
				}
			}
		}
		return true;
	}

}
