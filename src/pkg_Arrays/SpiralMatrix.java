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
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		printSpirally(mat);

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
