/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class StringToInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToInteger si = new StringToInteger();
		System.out.println(si.myAtoi("+-2"));

	}
	
	int myAtoi(String str){
		if(str == null || str.length()<1)
			return 0;
		str = str.trim();
		
		boolean flag = false;
		if(str.charAt(0) == '-')
			flag = true;
		
		double sum = 0;
		int i;
		if(str.charAt(0) < '0' ||str.charAt(0) >'9') 
			i=1;
		else 
			i= 0;
		for(;i<str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'; i++){			
				sum = sum*10 + (str.charAt(i)-'0');
		}
		
		if(flag)
			sum = -sum;
		
		if(sum > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
		if(sum < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int) sum;
	}

}
