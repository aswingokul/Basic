/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class CombinationString {

	StringBuilder out = new StringBuilder();
	String in;
	
	CombinationString(String param){
		in = param;
	}
	
	public void combine(){
		combine(0);
	}
	
	public void combine(int start){
		for(int i=start; i<in.length();i++){
			out.append(in.charAt(i));
			System.out.println(out);
			if(i<in.length())
				combine(i+1);
			out.setLength(out.length()-1);
		}
	}
	public static void main(String[] args) {
		CombinationString str = new CombinationString("wxyz");
		str.combine();

	}

}
