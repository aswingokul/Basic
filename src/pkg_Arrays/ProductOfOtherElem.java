/**
 * 
 */
package pkg_Arrays;

/**
 * @author Aswin
 *
 */
public class ProductOfOtherElem {

	/**
	 * @param args
	 */
	
	/*
	 * Calculates the product of all the elements except the ith
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = {10,3,5,6,2};
		int[] prod = new int[ip.length];
		int temp = 1;
		System.out.println("Left Array");
		System.out.println("-----------");
		for(int i=0; i<ip.length;i++){ //Constructing Left array
			System.out.println("temp: "+temp);
			prod[i] = temp;
			temp *= ip[i]; 
		}
		temp =1;
		System.out.println("Right Array");
		System.out.println("-----------");
		for(int i=ip.length-1; i>=0; i--){
			prod[i] *= temp;
			System.out.println("prod["+i+"]: "+prod[i]);
			temp *= ip[i];
			System.out.println("temp: "+ temp);
		}
		
		for(int i=0; i<ip.length; i++){
			System.out.print(prod[i]+" ");
		}	

	}
	
	

}
