/**
 * 
 */
package pkg_BitManip;

/**
 * @author Aswin
 *
 */
public class Multiply2Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply2Numbers mn = new Multiply2Numbers();
		System.out.println(mn.multiply(2, 4));

	}
	
	public int multiply(int a, int b){
		int result = 0;
		
		while(b!=0){			
			if((b&1) != 0){
				result = add(result, a);
			}
			a <<= 1;
			b >>= 1;
			
		}
		return result;
	}
	
	public int add(int op1, int op2){
		while(op2!=0){
			int carry = op1 & op2;
			
			op1 = op1 ^ op2;
			
			op2 = carry << 1;
		}
		return op1;
	}	

}
