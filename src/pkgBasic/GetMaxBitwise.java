/**
 * 
 */
package pkgBasic;

/**
 * @author aswin
 *
 */
public class GetMaxBitwise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMaxBitwise gmb = new GetMaxBitwise();
		System.out.println(gmb.getMax(-4, 3));

	}
	
	int flip(int bit) {
		return (1^bit);
	}
	
	int sign(int num) {
		return flip((num >> 31) & 1);
	}
	
	int getMax(int a, int b) {
		int c = a - b;
		int sa = sign(a);
		int sb = sign(b);
		int sc = sign(c);
		
		int use_sign_of_a = sa ^ sb;
		int use_sign_of_c = flip(sa^sb);
		
		int k = use_sign_of_a * sa + use_sign_of_c * sc;
		int q = flip(k);
		
		return a*k + b*q;
	}

}
