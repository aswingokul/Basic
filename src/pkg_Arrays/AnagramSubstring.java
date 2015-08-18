/**
 * 
 */
package pkg_Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aswin
 *
 */

/*-------------------------------------------------------------
 * This program searches if the given str2 or any anagram of 
 * str2 is a substring of str1
 * ------------------------------------------------------------
 */
public class AnagramSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramSubstring ass = new AnagramSubstring();
		boolean ans = ass.anagramSubStr("Amazon", "oremaz");
		System.out.print("ans:"+ans);

	}
	
	/*=========================================================
	 * Given str1 and str2, check if any anagram of str2 is a
	 * substring of str1
	 * ========================================================
	 */
	boolean anagramSubStr(String str1, String str2) {
		if(str1.length() < str2.length())
			return false;
		List<Character> list2 = new ArrayList<Character>();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		for(int i=0; i<str2.length(); i++) {
			list2.add(str2.charAt(i));			
		}

		for(int i=0; i<str1.length(); i++) {	
			char z = str1.charAt(i);
			if(list2.contains(z) && (!list2.isEmpty())) {
				list2.remove(new Character(z));				
			}
				
		}
		
		if(list2.isEmpty())
			return true;
		
		return false;
	}

}
