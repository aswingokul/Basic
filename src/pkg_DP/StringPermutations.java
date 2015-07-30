/**
 * 
 */
package pkg_DP;

import java.util.ArrayList;


/**
 * @author aswin
 *
 */
public class StringPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutations sp = new StringPermutations();
		String inp = "(())";		 
		ArrayList<String> res = sp.getPerms(inp);		
		sp.printPerms(res);
		System.out.println("Size: "+res.size());
	}

	public ArrayList<String> getPerms(String str) {
		ArrayList<String> perms = new ArrayList<String>();
		if (str == null)
			return null;
		if (str.length() == 0) {
			perms.add("");
			return perms;
		}
			
		char first = str.charAt(0);
		String rest = str.substring(1);
		ArrayList<String> words = getPerms(rest);
		for(String word : words) {
			for(int j=0; j<=word.length();j++) {
				String perm = insertChar(word,first,j);
				perms.add(perm);
			}
		}
		return perms;
	}
	
	public String insertChar(String word, char c, int i) {
		String first = word.substring(0,i);
		String reminder = word.substring(i);
		return first+c+reminder;
	}
	
	void printPerms(ArrayList<String> list) {
		for(String word : list) {
			System.out.println(word);
		}
	}

}
