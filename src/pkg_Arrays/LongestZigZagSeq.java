/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class LongestZigZagSeq {

	/**
	 * @param args
	 */
	static boolean greaterOp = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inp = {3, 5, 8};
		LZZS(inp);

	}
	
	private static void LZZS(int[] input){
		int[] oparray = new int[input.length];
		int len = 2;
		for(int i=0; i<=1; i++){
			oparray[i] = input[i];
		}
		if(oparray[0] > oparray[1]) greaterOp = true;
		else greaterOp = false;
		for(int i=2; i< input.length; i++){
				if(greaterOp){
					if(oparray[len-1] < input[i]){
						oparray[len++] = input[i];						
					}else continue;
				}else{
					if(oparray[len-1] > input[i]){
						oparray[len++] = input[i];
					}else continue;
				}
				greaterOp = !greaterOp;
		}
		printArray(oparray);
	}
	
	private static void printArray(int[] array){
		System.out.print("Array Elements: ");
		for(int i=0; i<array.length;i++){
			System.out.print(array[i] + " ");			
		}
		System.out.println();
		System.out.println("Length: "+array.length);
	}
	
}
