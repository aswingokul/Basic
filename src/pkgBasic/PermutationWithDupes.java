/**
 * 
 */
package pkgBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Aswin
 *
 */
public class PermutationWithDupes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermutationWithDupes pd = new PermutationWithDupes();
		pd.permutations("AAB");

	}
	
	public Map<Character, Integer> buildFreqMap(String str){
		Map<Character, Integer> frq = new HashMap<Character, Integer> ();
		char[] s = str.toCharArray();
		for(Character c : s){
			if(!frq.containsKey(c)){
				frq.put(c, 0);
			}
			frq.put(c,frq.get(c)+1);
		}
		return frq;
	}
	
	public void permutations(String str){
		List<String> permutes = new ArrayList<String>();
		Map<Character, Integer> map = buildFreqMap(str);
		permutations(map, "", str.length(), permutes);
		System.out.println(permutes);
	}
	
	public void permutations(Map<Character, Integer> map, String str, int remaining, List<String> results){
		if(remaining == 0){
			results.add(str);
			return;
		}
		
		for(Character c : map.keySet()){
			int count = map.get(c);
			if(count > 0){
				map.put(c, count-1);
				permutations(map, str+c, remaining-1, results);
				map.put(c, count);
			}
		}		
	}

}
