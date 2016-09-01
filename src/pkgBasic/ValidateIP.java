/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class ValidateIP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in = "127.0.0.1";
		System.out.println(validateIP(in));
	}
	
	public static boolean validateIP(String ipaddress){
		if(ipaddress == null)
			return false;
		
		String[] ip = ipaddress.split("\\.");
		if(ip.length != 4)
			return false;
		for(String part : ip ){
			int pt = Integer.parseInt(part);
			if(pt >= 0 && pt <= 255)
				continue;
			else
				return false;
		}
		System.out.println(Integer.class.getSimpleName());
		return true;		
	}

}
