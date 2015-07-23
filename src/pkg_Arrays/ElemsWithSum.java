/**
 * 
 */
package pkg_Arrays;
import insertionSort.InsertionSort;

/**
 * @author Aswin
 *
 */
public class ElemsWithSum {

	/**
	 * @param args
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort ins = new InsertionSort();
		int[] in = {-2,-47,75,43,36,98,39,-54};
		int sum = 32;
		int out[] = new int[in.length];
		out = ins.insertSort(in);
		ins.print(out);
		System.out.println();
		int left = 0, right = out.length-1;
		boolean flag = false;
		while(left < right){
			if((out[left]+out[right]) == sum){
				System.out.println(out[left]+" "+out[right]);
				flag = true;
				left++;
			}else if((out[left]+out[right]) < sum){
				left++;
			}else
				right--;
		}
		if(!flag){
			System.out.println("Couldn't find anything");
		}

	}

}
