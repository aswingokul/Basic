/**
 * 
 */
package pkgBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Aswin
 *
 */
public class WordPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordPattern wp = new WordPattern();
		String pattern = "abba";
		String str = "dog dog dog dog";
		System.out.println(wp.wordPattern(pattern, str));
	}
	
	public boolean wordPattern(String pattern, String str){
		String[] words = str.split(" ");
		if(pattern.length() != words.length)
			return false;
		Map index = new HashMap();
		for(int i = 0; i<words.length; i++){
			if(!Objects.equals(index.put(pattern.charAt(i), i), index.put(words[i], i)))
				return false;
		}
		return true;
	}

}
