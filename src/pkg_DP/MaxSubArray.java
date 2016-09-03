<<<<<<< HEAD
/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class MaxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArray ms = new MaxSubArray();
		int[] a = {-1,4,-2,5,-3,2};
		System.out.println(ms.maxSubArrSum(a));

	}
	
	int maxSubArrSum(int[] arr){
		int maxSum = 0, currSum = 0;
		for(int i=0; i<arr.length;i++){
			currSum = Math.max(currSum+arr[i],arr[i] );
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}

}
=======
/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class MaxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxSubArray ms = new MaxSubArray();
		int[] a = {-1,4,-2,5,-3,2};
		System.out.println(ms.maxSubArrSum(a));

	}
	
	int maxSubArrSum(int[] arr){
		int maxSum = 0, currSum = 0;
		for(int i=0; i<arr.length;i++){
			currSum = Math.max(currSum+arr[i],arr[i] );
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
