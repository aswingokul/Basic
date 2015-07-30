/**
 * 
 */
package pkg_DP;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aswin
 *
 */
public class AllSubSets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSubSets ass = new AllSubSets();
		List<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		List<ArrayList<Integer>> allsubs = ass.getAllSubSets(set, 0);
		System.out.println("{");
		for(ArrayList<Integer> subset : allsubs){
			System.out.print("[");
			for(int i : subset){
				System.out.print(i+" ");				
			}
			System.out.println("]");
		}
		System.out.println("}");

	}
	
	List<ArrayList<Integer>> getAllSubSets(List<Integer> set, int index){
		List<ArrayList<Integer>> allSubSets;
		if(set.size() == index){
			allSubSets = new ArrayList<ArrayList<Integer>>();
			allSubSets.add(new ArrayList<Integer>());
		}else{
			allSubSets = getAllSubSets(set,index+1);
			int item = set.get(index);
			List<ArrayList<Integer>> moreSubSets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset : allSubSets ){
				ArrayList<Integer> newSubSet = new ArrayList<Integer>();
				newSubSet.addAll(subset);
				newSubSet.add(item);
				moreSubSets.add(newSubSet);
			}
			allSubSets.addAll(moreSubSets);
		}
		return allSubSets;
	}

}
