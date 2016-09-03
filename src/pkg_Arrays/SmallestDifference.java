/**
 * 
 */
package pkg_Arrays;

import java.util.Arrays;

/**
 * @author Aswin
 *
 */
public class SmallestDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestDifference sd = new SmallestDifference();
		int[] array1 = {22,1,15,2};
		int[] array2 = {23,12,19,127,4,235};
		System.out.println(sd.findSmallest(array1, array2));
	}
	
	public int findSmallest(int[] array1, int[] array2){
		Arrays.sort(array1);
		Arrays.sort(array2);
		int min = Integer.MAX_VALUE;
		int i= 0, j = 0;
		while(i < array1.length && j < array2.length){
			if(min > Math.abs(array1[i] - array2[j])){
				min = Math.abs(array1[i] - array2[j]);
			}
			
			if(array1[i] > array2[j])
				j++;
			else
				i++;
		}
		return min;
	}

}
