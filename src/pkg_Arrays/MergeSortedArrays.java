/**
 * 
 */
package pkg_Arrays;

/**
 * @author aswin
 *
 */
public class MergeSortedArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[8];
		A[0] = 12;
		A[1] = 21;
		A[2] = 25;
		A[3] = 32;
		
		int[] B = {10,15,23,29};
		MergeSortedArrays msa = new MergeSortedArrays();
		msa.mergeArrays(A, B, 4, 4);
		
		for(int i : A) {
			System.out.print(i + " ");
		}

	}
	
	
	
	void mergeArrays(int[] A, int[] B, int lastA, int lastB) {
		int indexA = lastA -1;
		int indexB = lastB -1;
		int indexMerged = lastA+lastB -1;
		
		while(indexA >= 0 && indexB >= 0) {
			if(A[indexA] > B[indexB]) {
				A[indexMerged] = A[indexA];
				indexMerged--;
				indexA--;
			}else {
				A[indexMerged] = B[indexB];
				indexMerged--;
				indexB--;
			}
		}
		
		while(indexB >=0) {
			A[indexMerged] = B[indexB];
			indexMerged--;
			indexB--;
		}
	}

}
