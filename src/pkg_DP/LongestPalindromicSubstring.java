/**
 * 
 */
package pkg_DP;

/**
 * @author Aswin
 *
 */
public class LongestPalindromicSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//longestPalinDP("ABCCBP");
		System.out.println("Final output: "+ longPalin2("REFABCBA")); 

	}
	
	public static String longPalin2(String str){
		if(str==null)
			return null;
		
		if(str.length()<=1)
			return str;
		
		String longest = str.substring(0,1);
		//System.out.println("str.substring(0,0): "+str.substring(0,0));
		System.out.println("longest: "+longest);
		for(int i=0;i<str.length();i++){
			System.out.println("-------------------------for i = "+i+"------------------------------------");
			String temp = helper(str,i,i);
			System.out.println("For helper("+i+","+i+") --> temp: "+temp);
			if(temp.length() > longest.length()){				
				longest = temp;
				System.out.println("New Longest: "+longest);
			}
			
			temp = helper(str,i,i+1);
			System.out.println("For helper("+i+","+(i+1)+") --> temp: "+temp);
			if(temp.length() > longest.length()){
				longest = temp;
				System.out.println("New Longest: "+longest);
			}
			System.out.println("-------------------------End for i = "+i+"---------------------------------");
		}
		return longest;
	}
	
	public static String helper(String s, int begin, int end){
		System.out.println("===================Helper===================");
		System.out.println("String s: "+s);
		System.out.println("begin: "+begin);
		System.out.println("end: "+end);
//		System.out.println("-----------------------------------");
		while(begin>=0 && end<=s.length()-1 && s.charAt(begin)==s.charAt(end)){
			System.out.println("Comparing s.charAt("+begin+")="+s.charAt(begin) +" & s.charAt("+end+")="+s.charAt(end));
			begin--;
			end++;			
		}
		System.out.println("s.substring("+(begin+1)+","+end+"): "+s.substring(begin+1,end));
		System.out.println("===============End of Helper===============\n");
		return s.substring(begin+1,end);
	}

}
