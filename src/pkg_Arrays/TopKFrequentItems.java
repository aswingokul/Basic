/**
 * 
 */
package pkg_Arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Aswin
 *
 */
public class TopKFrequentItems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopKFrequentItems obj = new TopKFrequentItems();
		int[] nums = {1,2,2,3,3,3,4};
		System.out.println(obj.kFrequent(nums, 2));

	}
	//
	public List<Integer> kFrequent(int[] nums, int k){
		List<Integer> result = new ArrayList<Integer>();
		int count = 1;
		Map<Integer, Integer> unsortedmap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++){
			if(unsortedmap.containsKey(nums[i])){
				int val = unsortedmap.get(nums[i]);
				unsortedmap.put(nums[i], ++val);
			}else{
				unsortedmap.put(nums[i], 1);
			}
		}
		System.out.println("UnSorted: "+unsortedmap);
		
		Map<Integer, Integer> sortedMap = sortByValue(unsortedmap);
		System.out.println("Sorted: "+ sortedMap);
		
		Set<Integer> keySet = sortedMap.keySet();
		for(Integer i : keySet){
			if(count <= k){
				result.add(i);
				count++;
			}
			else
				break;			
		}
		
		return result;
	}
	
	public Map<Integer,Integer> sortByValue(Map<Integer,Integer> map){
		Comparator<Integer> comparator = new ValueComparator(map);
		Map<Integer, Integer> sorted = new TreeMap<Integer, Integer>(comparator);
		sorted.putAll(map);
		return sorted;
	}

}

class ValueComparator implements Comparator{
	Map<Integer, Integer> sortedMap = new HashMap<Integer,Integer>();
	
	public ValueComparator(Map<Integer,Integer> map){
		sortedMap.putAll(map);
	}
	
	@Override
	public int compare(Object k1, Object k2){
		int v1 = sortedMap.get(k1);
		int v2 = sortedMap.get(k2);
		
		if(v1 > v2)
			return -1;
		else
			return 1;
	}
	
	
}
