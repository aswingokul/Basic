/**
 * 
 */
package pkg_Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author aswin
 *
 */
public class SortArrayOfAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"cat", "zero", "bottle", "ozone", "acre", "care", "race"};
		SortArrayOfAnagrams saa = new SortArrayOfAnagrams();
		saa.sortAnagrams(input);
		for(String s : input) {
			System.out.print(s + " ");
		}

	}
	
	String sortChars(String s) {
		char[] contents = s.toCharArray();
		Arrays.sort(contents);
		return new String(contents);
	}
	
	void sortAnagrams(String[] array) {
		HashMap<String,LinkedList<String>> map = new HashMap<String,LinkedList<String>>();
		for(String s : array) {
			String tmp = sortChars(s);
			if(!map.containsKey(tmp)) {
				map.put(tmp, new LinkedList<String>());
			}
			LinkedList<String> t = map.get(tmp);
			t.push(s);
			
		}
		int index = 0;
		for(String s : map.keySet()) {
			LinkedList<String> tmp = map.get(s);
			for(String t : tmp) {
				array[index] = t;
				index++;
			}
		}
	}

}
