/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class MatrixDemo {

	/**
	 * @param args
	 */
	public static void setZero(int[][] matrix){
		System.out.println("In setZero method:");
		printMatrix(matrix);
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		System.out.println("row[] size:"+ row.length);
		System.out.println("column[] size:"+ column.length);
		for(int i=0; i<row.length;i++){
			for(int j=0; j<column.length;j++){
				if(matrix[i][j]==0){
					row[i] = 1;
					column[j] = 1;					
				}
			}
			
		}
		System.out.println("row:");
		printMatrix(row);
		System.out.println("column:");
		printMatrix(column);
		
		for(int i=0; i<row.length;i++){
			for(int j=0; j<column.length;j++){
				if(row[i] ==1 || column[j] ==1){
					matrix[i][j] =0;
				}
			}
		}
		System.out.println("Final result:");
		printMatrix(matrix);
		
	}
	
	public static void printMatrix(int[][] matrix){
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
public static void printMatrix(int[] matrix){
		
		for(int i=0; i<matrix.length;i++){
			System.out.print(matrix[i] + "  ");
			}
			System.out.println();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[3][3];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 0;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		setZero(matrix);
	}

}
