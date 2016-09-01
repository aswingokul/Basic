/**
 * 
 */
package pkg_Arrays;

import java.util.Arrays;

/**
 * @author Aswin
 *
 */
public class ReverseKElems {

	/**
	 * @param args
	 */
	int[] result; int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		ReverseKElems rev = new ReverseKElems();
		rev.reverse(arr, 3);
		System.out.println(Arrays.toString(rev.result));
//		System.out.println(Arrays.toString(arr));
	}
	
	public void reverse(int[] arr, int k){
		this.result = new int[arr.length];
		reverse(arr,0,k);
	}
	
	public void reverse(int[] arr, int start, int k){
		if(start > arr.length){
			return;
		}
		for(int i=Math.min(start+k-1, arr.length-1); i>=start; i--){
			result[this.index++] = arr[i];
		}
		start = Math.min(start+k, arr.length);
			
		reverse(arr,start,k);
	}

}
