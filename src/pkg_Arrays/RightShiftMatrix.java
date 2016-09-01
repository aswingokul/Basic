/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class RightShiftMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		RightShiftMatrix rsm = new RightShiftMatrix(); 
        rsm.shift(a, 0, 3);
        System.out.println("Rotated array...");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + ",");
            }
            System.out.println();
       }

	}
	
	public void shift(int[][] arr, int index, int n ) {
		if((n%2 == 0) && index >=n/2)
			return;
		if(n%2 !=0 && index >n/2)
			return;
		
		int rightTopCorner = arr[index][n-1-index];
		int rightBotCorner = arr[n-1-index][n-1-index];
		int leftBotCorner = arr[n-1-index][index];
		int leftTopCorner = arr[index][index];
		
		int tmp1, tmp2;
		
		tmp1 = leftTopCorner;
		for(int i = index+1; i< n-index; i++) {
			tmp2 = arr[index][i];
			arr[index][i] = tmp1;
			tmp1 = tmp2;
		}
		
		tmp1 = rightTopCorner;
		for(int i = index+1; i< n-index; i++) {
			tmp2 = arr[i][n-1-index];
			arr[i][n-1-index] = tmp1;
			tmp1 = tmp2;			
		}
		
		tmp1 = rightBotCorner;
		for(int i=n-2-index; i>= index; i--) {
			tmp2 = arr[n-1-index][i];
			arr[n-1-index][i] = tmp1;
			tmp1 = tmp2;
		}
		
		tmp1 = leftBotCorner;
		for(int i = n-2-index; i>=index; i--) {
			tmp2 = arr[i][index];
			arr[i][index] = tmp1;
			tmp1 = tmp2;
		}
		shift(arr,index+1,n);
	}

}
