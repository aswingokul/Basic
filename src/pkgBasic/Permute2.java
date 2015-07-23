/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class Permute2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute("","ABPN");
	}
	static int count = 0;
	private static void permute(String prefix, String str){
		int n = str.length();
		if(n==0)
			System.out.println(prefix);
		else{
			
			for(int i=0; i<n;i++){
//				System.out.println("str.charAt("+i+"): "+str.charAt(i));
//				System.out.println("prefix: "+prefix);
//				System.out.println("prefix + str.charAt("+i+"): "+prefix + str.charAt(i));
//				System.out.println("str.substring(0,"+i+"): "+str.substring(0,i));
//				System.out.println("str.substring(" + (i+1) + "): "+str.substring(i+1));
//				System.out.println("str.substring(0,"+i+")+ str.substring("+(i+1)+"): "+str.substring(0,i)+str.substring(i+1));
				permute(prefix + str.charAt(i),str.substring(0,i)+str.substring(i+1));
//				System.out.println("**************************************************************"); 
			}
		}
	}

}
