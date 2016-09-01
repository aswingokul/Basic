/**
 * 
 */
package pkg_Arrays;

import java.util.Arrays;

/**
 * @author Aswin
 *
 */
public class OneSwapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,5,3,4};
		OneSwapSort ob = new OneSwapSort();
//		System.out.println(ob.oneSwap(A));
//		System.out.println(ob.sortArrayWithSingleSwapIfPossible());
		System.out.println(ob.function(A));

	}
	
	public boolean oneSwap(int[] A){
		int leftIndex = findLeftIndex(A);
		int rightIndex = findRightIndex(A);
		if(leftIndex == rightIndex || leftIndex == -1 || rightIndex == -1){
			return false;
		}
		int temp = A[leftIndex];
		A[leftIndex] = A[rightIndex];
		A[rightIndex] = temp;
		System.out.println(Arrays.toString(A));
		return isSorted(A);
	}
	
	private int findRightIndex(int[] A){
		for(int i = A.length-1; i>=0; i--){
			if(A[i-1] > A[i]){
				while(i<A.length-1 && A[i] == A[i+1]){
					i++;
				}
				return i;
			}
				
		}
		return -1;
	}
	
	private int findLeftIndex(int[] A){
		for(int i=0; i<A.length-1; i++){
			if(A[i] > A[i+1]){
				while(i>0 && A[i] == A[i-1]){
					return i;
				}
			}				
		}
		return -1;
	}
	
	private boolean isSorted(int[] A){
		for(int i=0; i<A.length-1; i++){
			if(A[i] > A[i+1])
				return false;
		}
		return true;
	}
	
	private int[] swap (int[] A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		return A;
	}
	
	public boolean sortArrayWithSingleSwapIfPossible() {
        int[] A = {1, 5, 3, 3, 2, 6};
        int temp;
        int swapCount = 0;
        int length = A.length;
        for (int i = 0; i < A.length; i++) {
            if (i == length - 1) {
                break;
            }
            if (A[i] > A[i + 1]) {
                if (((i + 2) < length) && A[i + 1] == A[i + 2]) {
                    temp = A[i];
                    A[i] = A[i + 2];
                    A[i + 2] = temp;
                    ++swapCount;

                } else {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    ++swapCount;
                }
            }

            if (swapCount > 1) {
                return false;
            }
        }
        return true;
    }
	
	private boolean function(int[] data) {
	    int max = data[0], maxIndex = 0;

	    //find the maximum element in the array
	    for(int i=0;i<data.length;i++)
	    {
	        if(data[i] > max)
	        {
	            max = data[i];
	            maxIndex = i;
	        }
	    }

	    //check whether all the elements before max are less than it
	    // if not you need more swaps to sort
	    for(int j=0;j<maxIndex;j++)
	    {
	        if(data[j]>max)
	            return false;
	    }


	    //check what is next smallest element
	    for(int j=maxIndex+1;j<data.length-1;j++)
	    {
	        if(!(max > data[j] && data[j+1] <data[j]))
	            return false;
	    }

	    return true;
	}

}
