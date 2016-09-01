/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class PrintMatrixDiagonal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		//printMatrixDiagonally(matrix, matrix.length, matrix[0].length);
		printMatrixNESW(matrix,matrix.length,matrix[0].length);

	}
	/*=============================================
	 * Output
	 *=============================================
	 *1 
	 *2 5 
	 *3 6 9 
	 *4 7 10 13 
	 *8 11 14 
	 *12 15 
	 *16
	 *=============================================	  
	 */
	static void printMatrixDiagonally(int[][] matrix, int endRowIndex, int endColIndex){
		//print the upper half and the main diagonal
		for(int level = 0; level < endColIndex; level++){
			for(int currDiagRowIndex = 0,currDiagColIndex = level; currDiagRowIndex < endRowIndex && currDiagColIndex >= 0; currDiagRowIndex++, currDiagColIndex--){
				System.out.print(matrix[currDiagRowIndex][currDiagColIndex]+" ");
			}
			System.out.println();
		}		
		//print the lower half, below the main diagonal
		for(int level = 1; level < endRowIndex; level++){
			for(int currDiagRowIndex = level, currDiagColIndex = endColIndex-1; currDiagRowIndex < endRowIndex && currDiagColIndex >= 0; currDiagRowIndex++, currDiagColIndex--){
				System.out.print(matrix[currDiagRowIndex][currDiagColIndex]+" ");
			}
			System.out.println();
		}
	}
	/*=============================================
	 * Output
	 *=============================================
	 *4 
	 *8 3 
	 *12 7 2 
	 *16 11 6 1 
	 *15 10 5 
	 *14 9 
	 *13 
	 *=============================================
	 */
	static void printMatrixNESW(int[][] matrix, int endRowIndex, int endColIndex){
		for(int level=0; level < endRowIndex; level++){
			for(int currRowIndex = level, currColIndex = endColIndex-1; currRowIndex >= 0 && currColIndex >= 0; currRowIndex--, currColIndex--){
				System.out.print(matrix[currRowIndex][currColIndex]+" ");
			}
			System.out.println();
		}
		
		for(int level = 1; level < endRowIndex; level++){
			for(int currRowIndex = endRowIndex-1, currColIndex = endColIndex-level-1; currRowIndex >= 0 && currColIndex >= 0; currRowIndex--, currColIndex--){
				System.out.print(matrix[currRowIndex][currColIndex] + " ");
			}
			System.out.println();
		}
	}

}
