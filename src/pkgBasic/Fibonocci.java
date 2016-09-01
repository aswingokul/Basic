/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class Fibonocci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonocci obj = new Fibonocci();
		obj.fibonocci(25);
		
		System.out.println("Sum: "+obj.add(3, 5));

	}
	
	public void fibonocci(int n){
		int a=0,b=1;
		int i = 1;
		while(i<n){
			a = a+b;
			int t = a;
			a = b;
			b = t;
			i++;
			
		}
		System.out.println(n+"th fibonocci num is: "+ a);
	}
	
	public int add(int a, int b){
		if (b==0)
			return a;
		int sum = a^b;
		int carry = (a&b) << 1;
		return add(sum,carry);
		
	}
	
}
