<<<<<<< HEAD
/**
 * 
 */
package pkgBasic;

/**
 * @author Aswin
 *
 */
public class RemoveDuplicate {
	
	public static void main(String[] args){
		RemoveDuplicate obj = new RemoveDuplicate();
		StringBuilder in = new StringBuilder("RemoveDuplicate");
		StringBuilder res = obj.remdup(in);
		System.out.println("Output: "+res);
	}
	
	public StringBuilder remdup(StringBuilder str){
		int[] bucket = new int[60];
		for(int i=0;i<str.length();i++){
			bucket[str.charAt(i)-65]++;
			if(bucket[str.charAt(i)-65]>1){
				str.deleteCharAt(i);
			}
		}
		
		return str;
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
public class RemoveDuplicate {
	
	public static void main(String[] args){
		RemoveDuplicate obj = new RemoveDuplicate();
		StringBuilder in = new StringBuilder("RemoveDuplicate");
		StringBuilder res = obj.remdup(in);
		System.out.println("Output: "+res);
	}
	
	public StringBuilder remdup(StringBuilder str){
		int[] bucket = new int[60];
		for(int i=0;i<str.length();i++){
			bucket[str.charAt(i)-65]++;
			if(bucket[str.charAt(i)-65]>1){
				str.deleteCharAt(i);
			}
		}
		
		return str;
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
