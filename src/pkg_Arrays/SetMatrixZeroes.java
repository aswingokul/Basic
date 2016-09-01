/**
 * 
 */
package pkg_Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aswin
 *
 */
public class SetMatrixZeroes {

	/**
	 * @param args
	 */
	
	class Point{
		int x, y;
		
		Point(int a, int b){
			x = a; y = b;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {
				{4,1,3},
				{8,10,0},
				{0,13,5}
		};
		
		SetMatrixZeroes smz = new SetMatrixZeroes();
		smz.setMatrixZeroes(matrix);
		smz.printMatrix(matrix);

	}
	
	public void setMatrixZeroes(int[][] matrix){
		List<Point> points = new ArrayList<Point>();
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					points.add(new Point(i, j));
				}
			}
		}
		
		for(Point p : points){
			for(int i=0; i<matrix[0].length; i++){
				matrix[i][p.y] = 0;
			}
			
			for(int j=0; j < matrix.length; j++){
				matrix[p.x][j] = 0;
			}
		}
		
	}
	
	public void printMatrix(int[][] matrix){
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
