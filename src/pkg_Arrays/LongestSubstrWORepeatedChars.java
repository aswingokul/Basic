/**
 * 
 */
package pkg_Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aswin
 *
 */
public class LongestSubstrWORepeatedChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstrWORepeatedChars lsrc = new LongestSubstrWORepeatedChars();
		String testStr = "asdjasdfdsdf";
		System.out.println(lsrc.longestSubStr(testStr));
		System.out.println(lsrc.longestSubString(testStr));

	}
	
	public int longestSubStr(String s){
		int maxlen = 0;
		char[] arr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				maxlen = Math.max(maxlen, map.size());
				i = map.get(arr[i]);
				map.clear();
			}else{
				map.put(arr[i], i);
			}
		}
		return Math.max(maxlen, map.size());
	}
	
	public String longestSubString(String s){
		if(s==null || s.length() == 0) return null;
		char[] arr = s.toCharArray();
		StringBuilder res = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		//Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0; i<arr.length; i++){
			if(res.indexOf(String.valueOf(arr[i])) != -1){
				if(temp.length() <= res.length()){
					temp = new StringBuilder(res);
				}
				int ind = res.indexOf(String.valueOf(arr[i]));
				String subs = res.substring(ind+1);
				res = new StringBuilder(subs);
			}
			res.append(arr[i]);
		}
		return temp.toString();
	}

}
