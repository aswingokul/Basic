/**
 * 
 */
package pkg_DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Aswin
 *
 */
public class RobotGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[][] matrix = {
				{true, false, true},
				{true, true, true},
				{false,true, true}
		};
		RobotGrid rg = new RobotGrid();
		rg.getPath(matrix);

	}
	
	public void getPath(boolean[][] matrix){
		List<Point> path= new ArrayList<Point>();
		//List<List<Point>> result = new ArrayList<List<Point>>();
		getPath(matrix, matrix.length-1,matrix[0].length-1, path);
		printResult(path);
	}
	
	//Not Working
	/*public void getPath(boolean[][] matrix, int row, int col, List<Point> path, List<List<Point>> result){
		if(row >= matrix.length || col >= matrix[0].length)
			return;
		if(!matrix[row][col])
			return;
		if(row == matrix.length-1 && col == matrix[0].length-1){
			path.add(new Point(2,2));
			result.add(new ArrayList<Point>(path));			
			return;
		}
		Point p = new Point(row, col);
		if(!result.contains(path) && !path.contains(p))
			path.add(p);
		getPath(matrix, row+1,col, path, result);
//		path.remove(path.size()-1);
		getPath(matrix, row,col+1, path, result);
//		path.remove(path.size()-1);
	}
	
	*/
	
	public static void printResult(List<Point> result){
		for(Point p: result){
			System.out.print("["+ p.x +", " + p.y + "], ");
		}
	}
	
	public boolean getPath(boolean[][] matrix, int row, int col, List<Point> path){
		if(row < 0 || col < 0 || !matrix[row][col])
			return false;
		boolean isAtOrigin = row == 0 && col == 0;
		if(isAtOrigin || getPath(matrix, row-1,col, path) || getPath(matrix, row,col-1, path)){
			path.add(new Point(row, col));
			return true;
		}
		return false;
	}
	
	public boolean dynamic(boolean[][] matrix, int row, int col, List<Point> path, Set<Point> failedPoints){
		if(row < 0 || col < 0 || !matrix[row][col])
			return false;
		Point p = new Point(row, col);
		if(failedPoints.contains(p))
			return false;
		boolean isAtOrigin = row == 0 && col == 0;
		if(isAtOrigin || dynamic(matrix, row-1,col, path, failedPoints) || dynamic(matrix, row-1,col, path, failedPoints)){
			path.add(new Point(row, col));
			return true;
		}
		failedPoints.add(p);
		return false;
		
	}

}

class Point{
	int x,y;
	
	public Point(int a, int b){
		x = a;y = b;
	}
}
