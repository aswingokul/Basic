/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class PalindromeInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeInteger pn = new PalindromeInteger();
		System.out.println(pn.isPalinNum(82728));

	}
	
	boolean isPalinNum(int x){
		if(x < 0)
			return false;
		//Initialize number of zeros
		int div = 1;
		int pl = x/div;
		while(pl >= 10){
			div *= 10;
			pl = x/div;
		}
		
		while(x!=0){
			int left = x / div;
			int right = x%10;
			
			if(left != right)
				return false;
			int intr = x%div;
			x = intr/10;
			div = div/100;
		}
		
		return true;
	}

}
