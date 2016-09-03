/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class ArrangeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangeNumber an = new ArrangeNumber();
		System.out.println(an.arrangeNum(353));

	}
	
	public long arrangeNum(int N){
		int num = N;
		int[] times = new int[10];
		while(num!=0){
			int val = num%10;
			times[val]++;
			num /=10;
		}
		
		long largest = 0;
		for(int i=9; i>=0; i--){
			for(int j=0; j< times[i]; j++){
				largest = largest * 10 + i;
			}
		}
		return largest;
	}

}
