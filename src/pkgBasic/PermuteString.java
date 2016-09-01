<<<<<<< HEAD
/**
 * 
 */
package pkgBasic;


/**
 * @author Aswin
 *
 */
public class PermuteString {

	public final String in;
	boolean used[];
	StringBuilder out = new StringBuilder();
	
	public PermuteString(final String str){
		in = str;
		used = new boolean[in.length()];
	}
	
	public void permute(){
		if(out.length() == in.length()){
			System.out.println(out);
			return;
		}
		for(int i=0; i<in.length();i++){
			if(used[i])
				continue;
			out.append(in.charAt(i));
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength(out.length()-1);
		}
		
	}
	public static void main(String[] args) {
		
		PermuteString input = new PermuteString("xyz");
		input.permute();

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
public class PermuteString {

	public final String in;
	boolean used[];
	StringBuilder out = new StringBuilder();
	
	public PermuteString(final String str){
		in = str;
		used = new boolean[in.length()];
	}
	
	public void permute(){
		if(out.length() == in.length()){
			System.out.println(out);
			return;
		}
		for(int i=0; i<in.length();i++){
			if(used[i])
				continue;
			out.append(in.charAt(i));
			used[i] = true;
			permute();
			used[i] = false;
			out.setLength(out.length()-1);
		}
		
	}
	public static void main(String[] args) {
		
		PermuteString input = new PermuteString("xyz");
		input.permute();

	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
