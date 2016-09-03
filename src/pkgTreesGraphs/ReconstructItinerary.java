/**
 * 
 */
package pkgTreesGraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Aswin
 *
 */
public class ReconstructItinerary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] tickets = {
				{"JFK", "KUL"},
				{"JFK", "NTR"},
				{"NTR", "JFK"}
		};
		ReconstructItinerary ri = new ReconstructItinerary();
		System.out.println(ri.reconstruct(tickets));

	}
	
	public List<String> reconstruct(String[][] tickets){
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> result = new ArrayList<String>();
		int total = tickets.length+1;
		for(int i=0; i<tickets.length; i++){
			List<String> temp = new ArrayList<String>();
			if(!map.containsKey(tickets[i][0])){
				temp.add(tickets[i][1]);				
			}else{
				temp = map.get(tickets[i][0]);
				temp.add(tickets[i][1]);
				Collections.sort(temp);
			}
			map.put(tickets[i][0], temp);
		}
		
		result.add("JFK");
		helper(map, "JFK", total, 1, result);
		
		return result;
	}
	
	public boolean helper(Map<String, List<String>> map, String curr, int total, int num, List<String> result ){
		if(num >= total)
			return true;
		
		if(!map.containsKey(curr) || map.get(curr).size() == 0){
			return false;
		}
		
		List<String> connections = map.get(curr);
		for(int i=0; i<connections.size(); i++){
			String next = connections.remove(i);
			result.add(next);
			
			if(helper(map, next, total, num+1, result)){
				return true;
			}
			
			result.remove(result.size()-1);
			connections.add(next);
			Collections.sort(connections);
		}
		return false;
	}

}
