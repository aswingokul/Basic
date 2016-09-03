/**
 * 
 */
package pkg_Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Aswin
 *
 */
public class RearrangeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeString rs = new RearrangeString();
		String test = "geeksforgeeks";
		System.out.println(rs.rearrange(test, 3));

	}
	
	public String rearrange(String in, int dist){
		int left = 0;
		char[] arr = in.toCharArray();
		char[] res = new char[arr.length];
		Map<Character,Integer> map = new HashMap<Character, Integer>();		
		
		/*Add the chars and its count in the map*/
		for(int i=0; i<arr.length; i++){
			int val = 1;
			if(map.containsKey(arr[i])){
				val = map.get(arr[i]);
				val++;				
			}
			map.put(arr[i], val);
		}
		
		/*Sort map based on value*/
		Map<Character, Integer> sortedMap = sortMapByValue(map);
		for(Map.Entry<Character, Integer> entry : sortedMap.entrySet()){
			int i = left;
			int count = entry.getValue();
			while(count >= 1){
				res[i] = entry.getKey();
				i += dist; count--;
			}
			
			do{
				left++;
			}while(left< res.length && res[left] != '\u0000');
		}
		
		return String.valueOf(res);
	}
	
	private class ValueComparator implements Comparator<Character>{
		
		Map<Character, Integer> _map = new HashMap<Character,Integer>();
		
		ValueComparator(Map<Character,Integer> map){
			_map.putAll(map);
		}

		@Override
		public int compare(Character arg0, Character arg1) {
			// TODO Auto-generated method stub
			if(_map.get(arg0) >= _map.get(arg1))
				return -1;
			else
				return 1;
			
		}
		
	}
	
	private Map<Character,Integer> sortMapByValue(Map<Character, Integer> map){		
		Comparator<Character> comparator = new ValueComparator(map);
		Map<Character, Integer> res = new TreeMap<Character, Integer>(comparator);
		res.putAll(map);
		return res;		
	}

}
