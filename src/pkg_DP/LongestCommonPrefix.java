<<<<<<< HEAD
/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"potato","potat","potatssium"};
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		System.out.println(lcp.longestCommonPrefix(strs));

	}
	
	public String longestCommonPrefix(String[] strs){
		if(strs.length == 0)
			return null;
		if(strs.length == 1)
			return strs[0];
		
		String lcp = strs[0];
		
		for(int i=1; i<=strs.length-1; i++){
			int j = 0;
			while(j<Math.min(lcp.length(), strs[i].length()) && lcp.charAt(j) == strs[i].charAt(j)){
				j++;
			}
			lcp = strs[i].substring(0,j);
		}
		
		return lcp;
	}

}
=======
/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class LongestCommonPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"potato","potat","potatssium"};
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		System.out.println(lcp.longestCommonPrefix(strs));

	}
	
	public String longestCommonPrefix(String[] strs){
		if(strs.length == 0)
			return null;
		if(strs.length == 1)
			return strs[0];
		
		String lcp = strs[0];
		
		for(int i=1; i<=strs.length-1; i++){
			int j = 0;
			while(j<Math.min(lcp.length(), strs[i].length()) && lcp.charAt(j) == strs[i].charAt(j)){
				j++;
			}
			lcp = strs[i].substring(0,j);
		}
		
		return lcp;
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
