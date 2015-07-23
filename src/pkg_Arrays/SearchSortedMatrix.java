/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class SearchSortedMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		searchMatrix(mat, 3);
	}
	
	static void searchMatrix(int[][] mat, int target){
		boolean found = false;
		int m=mat.length;
		int n=mat[0].length;
		
		int start = 0;
		System.out.println("start: "+start);
		int end = m*n-1;
		System.out.println("end: "+end);
		
		while(start<=end){
			int mid = (start+end)/2;
			System.out.println("mid: "+mid);
			int midX = mid/n;
			System.out.println("midX: "+midX);
			int midY = mid%n;
			System.out.println("midY: "+midY);
			
			if(mat[midX][midY]==target){
				System.out.println("Line 37...");
				System.out.println("Compared the element in ("+midX+","+midY+"): "+mat[midX][midY]);
				found= true;
			}
				
			if(mat[midX][midY]<target){
				System.out.println("Line 43...");
				System.out.println("Compared the element in ("+midX+","+midY+"): "+mat[midX][midY]);
				start = mid+1;
				System.out.println("new start: "+start);
			}else{
				System.out.println("Line 47...");
				System.out.println("Compared the element in ("+midX+","+midY+"): "+mat[midX][midY]);
				end = mid-1;
				System.out.println("new end: "+end);
			}
		}
		System.out.println("Final ans: "+ found);
	}

}
