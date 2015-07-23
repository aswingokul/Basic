/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class ReverseIntger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseIntger ri = new ReverseIntger();
		System.out.println(ri.reverseInt(1534236469));

	}
	
	int reverseInt(int x){
		boolean neg = false;
		if(x < 0){
			neg =true;
			x = -x;
		}
		int rev = 0;
		while(x != 0){
			if( rev !=0 && Integer.MAX_VALUE/rev < 10 && Integer.MAX_VALUE/rev > -10)			
				return 0;
			rev = rev*10 + x%10;
			x=x/10;
			
		}
		
		return (neg?(-rev):rev);
	}

}
