<<<<<<< HEAD
/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class ReverseString {
	
	public void reverse(String str){
		String out[] = str.split(" ");
		for(int i=out.length-1;i>=0;i--){
			System.out.print(out[i]+" ");
		}
		
		//return out;
	}
	
	public String reverseRec(String str){
		if(str.length()<=1)
			return str;
		
		return reverseRec(str.substring(1))+str.substring(0,1);
	}
	
	public static void main(String args[]){
		ReverseString rev = new ReverseString();
		System.out.println(rev.reverseRec("This is just a test program"));
	}
}
=======
/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class ReverseString {
	
	public void reverse(String str){
		String out[] = str.split(" ");
		for(int i=out.length-1;i>=0;i--){
			System.out.print(out[i]+" ");
		}
		
		//return out;
	}
	
	public String reverseRec(String str){
		if(str.length()<=1)
			return str;
		
		return reverseRec(str.substring(1))+str.substring(0,1);
	}
	
	public static void main(String args[]){
		ReverseString rev = new ReverseString();
		System.out.println(rev.reverseRec("This is just a test program"));
	}
}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
