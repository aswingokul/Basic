/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class Duplicate {

	/**
	 * @param args
	 */
	public boolean validate(String str){
		int bucket[] = new int[60];
		for(int i=0;i<str.length();i++){
			bucket[str.charAt(i)-65]++;
			if(bucket[str.charAt(i)-65]>1){
				return true;
			}
		}	
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in= "Abhi";
		Duplicate on = new Duplicate();
		boolean re = on.validate(in);
		if(re)
			System.out.println("Contains Duplicate");
		else
			System.out.println("It's fine!");
			
	}

}
