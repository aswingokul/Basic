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
public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,  2,  3,  4,  5,  6},
		        {7,  8,  9,  10, 11, 12},
		        {13, 14, 15, 16, 17, 18}}; // output: 1 2 3 6 9 8 7 4 5
				
		printSpiral(mat.length, mat[0].length, mat);

	}
	/*
	 * Prints a matrix in the spiral fashion
	 */
	static void printSpiral(int endRowIndex, int endColIndex, int[][] matrix ){
		int startRowIndex = 0, startColIndex = 0, i;
		
		while(startRowIndex < endRowIndex && startColIndex < endColIndex){
			
			//print the first row apart from the rest of the matrix
			for(i = startColIndex; i < endColIndex; i++){
				System.out.print(matrix[startRowIndex][i] + " ");
			}
			startRowIndex++; //move this var to next row for the next iteration of the while loop
			System.out.println();
			
			//print the last column apart from the rest of the matrix
			for(i = startRowIndex; i < endRowIndex; i++){
				System.out.print(matrix[i][endColIndex-1] + " ");
			}
			endColIndex--; //move this var to the col to the left for the next iteration of the while loop
			System.out.println();
			
			//print the last row from right to left
			if(startRowIndex < endRowIndex){
				for(i = endColIndex-1; i >= startColIndex; --i){
					System.out.print(matrix[endRowIndex-1][i] + " ");
				}
				endRowIndex--; // move this var to one row above for the next iteration of the while loop  
			}
			System.out.println();
			
			//print the first column from bottom to top
			if(startColIndex < endColIndex){
				for(i = endRowIndex-1; i >= startRowIndex; --i){
					System.out.print(matrix[i][startColIndex] + " ");
				}
				startColIndex++; // move this var to one column right for the next iteration of the while loop
			}
			System.out.println();
		}
		
	}
	
	static void printSpirally(int[][] mat){
		int m = mat.length;
		int n = mat[0].length;
		List<Integer> res = new ArrayList<Integer>();
		int x=0, y=0;
		
		while(m>0 && n>0){
			
			
			if(m==1){
				System.out.println("one row left");
				for(int i=0; i<n; i++){
					res.add(mat[x][y++]);
					System.out.println("x: "+x+"\ty: "+(y-1));
					System.out.println("Element: "+mat[x][y-1]);
				}
			}else if(n==1){
				System.out.println("one col left");
				for(int i=0; i<m; i++){
					res.add(mat[x++][y]);
					System.out.println("x: "+(x-1)+"\ty: "+y);
					System.out.println("Element: "+mat[x-1][y]);
				}
			}
			
			System.out.println("Moving right");
			for(int i=0; i<n-1;i++){				
				res.add(mat[x][y++]);
				System.out.println("x: "+x+"\ty: "+(y-1));
				System.out.println("Element: "+mat[x][y-1]);
			}
			System.out.println("----------------------------");
			System.out.println("Moving down");
			for(int i=0; i<m-1;i++){				
				res.add(mat[x++][y]);
				System.out.println("x: "+(x-1)+"\ty: "+y);
				System.out.println("Element: "+mat[x-1][y]);
			}
			System.out.println("----------------------------");
			System.out.println("Moving left");
			for(int i=0;i<n-1;i++ ){
				res.add(mat[x][y--]);
				System.out.println("x: "+x+"\ty: "+(y+1));
				System.out.println("Element: "+mat[x][y+1]);
			}
			System.out.println("----------------------------");
			System.out.println("Moving up");
			for(int i=0; i<m-1; i++){
				res.add(mat[x--][y]);
				System.out.println("x: "+(x+1)+"\ty: "+y);
				System.out.println("Element: "+mat[x+1][y]);
			}
			x++;
			y++;
			m=m-2;
			n=n-2;
		}
		for(int u:res){
			System.out.print(u+" ");
		}
		
	}
	
	
	
}
