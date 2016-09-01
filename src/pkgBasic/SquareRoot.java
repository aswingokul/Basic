/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squareRoot(5);
		SquareRoot sr = new SquareRoot();
		sr.squareRoot2(9);

	}
	
	public static void squareRoot(int n){
		double g1;
		double root = n/2;
		boolean positive = true;
		
		if(n == 0){
			System.out.println("Square Root is "+0);
		}else if(n < 0){
			n = -n;
			positive = false;
		}
		
		do{
			g1 = root;
			root = (g1+(n/g1))/2;
		}while((g1-root)!=0);
		
		if(positive){
			System.out.println("Square Roots are: +"+(-(root))+" and -"+root);
		}else{
			System.out.println("Square Roots are: +"+(-root)+"i and "+root+"i");
		}
	}
	
	public void squareRoot2(int num){
		double sqrt = num/2;
		double t;
		do{
			t = sqrt;
			sqrt = (t +  (num/t))/2;
		}while((t-sqrt) !=0);
		
		System.out.println(sqrt);
	}

}
