/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class LongestIncSubSeq {

	/**
	 * @param args
	 */
	
	static int maxRef; //stores LIS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestIncSubSeq lis = new LongestIncSubSeq();
		int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
		//lis.backtrackingLIS(arr);
		System.out.println(lis.dynamic(arr));

	}
	
	//Wrapper function
	public void backtrackingLIS(int[] arr){
		maxRef = 1;
		
		backtracking(arr, arr.length);
		
		System.out.println("Length of LIS: " + maxRef);
	}
	
	/* This function should return 2 things
	 * 1. Length of LIS ending with element arr[n-1]. We use maxEndingHere for this purpose
	 * 2. Overall maximum as the LIS might end well before the last element arr[n-1]. maxRef is used for this purpose
	 * The value of LIS for the full array with length n is stored in the maxRef var. This is our final result
	 * Time complexity is O(2^n) 
	 */
	public int backtracking(int[] arr, int index){
		//base case
		if(index == 1) 
			return 1;
		
		//maxEndingHere is length of LIS of the arr ending with index-1
		int res, maxEndingHere = 1;
		
		/*Recursively get all LIS ending with arr[0], arr[1]....arr[index-2]
		 * If arr[i-1] is smaller than arr[index-1] and max ending with arr[index-1] needs to be updated, then update it		 
		 */
		for(int i=1; i<index; i++){
			res = backtracking(arr, i);
			if(arr[i-1] < arr[index-1] && res+1 > maxEndingHere)
				maxEndingHere = res + 1;
		}
		//compare maxEndingHere with the overall max LIS of the array. 
		//if overall length is less than the max ending till index, then update the overall LIS length
		maxRef = maxRef < maxEndingHere ? maxEndingHere : maxRef;
		
		//return the length of LIS ending with index-1
		return maxEndingHere;
	}
	
	//This function implements the above mentioned backtracking method using dynamic programming
	//Since each recursive function call is calculating the same values till the index, we can store the intermediate results in an array
	//This intermediate storage acts as a lookup for the previous indices
	//Time complexity is O(n^2)
	public int dynamic(int[] arr){
		int[] lis = new int[arr.length];
		int max = 0;
		
		//Initialize the length of LIS for each index to be 1
		//This is the lookup table and will updated everytime there is some sequence till j, where j < index and arr[j] < arr[index]
		//basically this stores the intermediate results 
		for(int i=0; i<arr.length; i++){
			lis[i] = 1;
		}
		
		//compute the optimized LIS values from the bottom-up manner
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(arr[j] < arr[i] && lis[j]+1 > lis[i]){
					lis[i] = lis[j]+1;
				}
			}
		}
		
		//Get the overall max length of LIS for the entire input array
		for(int i=0; i<arr.length; i++){
			if(max < lis[i])
				max = lis[i];
		}
		
		return max;
	}

}
