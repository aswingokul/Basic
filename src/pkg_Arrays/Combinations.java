<<<<<<< HEAD
/**
 * 
 */
package pkg_Arrays;

import java.util.ArrayList;

/**
 * @author Aswin
 *
 */
public class Combinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations on = new Combinations();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		ans = on.combine(4, 2);
		for(ArrayList<Integer> one : ans){
			System.out.print("[");
			for(Integer in : one){
				System.out.print(in+" ");
			}
			System.out.println("]\n");
		}

	}
	
	public ArrayList<ArrayList<Integer>> combine(int n, int k){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> item = new ArrayList<Integer>();
		dfs(n,k,1,result,item);
		
		return result;
	}
	
	public void dfs(int n, int k, int start, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> item){
		if(item.size() == k){
			//result.add(new ArrayList<Integer>(item));
			result.add(item);
			return;
		}
		
		for(int i=start; i<=n; i++){
			item.add(i+1);
			dfs(n,k,i,result,item);
			item.remove(item.size()-1);
		}
	}

}
=======
/**
 * 
 */
package pkg_Arrays;

import java.util.ArrayList;

/**
 * @author Aswin
 *
 */
public class Combinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combinations on = new Combinations();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		ans = on.combine(4, 2);
		for(ArrayList<Integer> one : ans){
			System.out.print("[");
			for(Integer in : one){
				System.out.print(in+" ");
			}
			System.out.println("]\n");
		}

	}
	
	public ArrayList<ArrayList<Integer>> combine(int n, int k){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> item = new ArrayList<Integer>();
		dfs(n,k,1,result,item);
		
		return result;
	}
	
	public void dfs(int n, int k, int start, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> item){
		if(item.size() == k){
			//result.add(new ArrayList<Integer>(item));
			result.add(item);
			return;
		}
		
		for(int i=start; i<=n; i++){
			item.add(i+1);
			dfs(n,k,i,result,item);
			item.remove(item.size()-1);
		}
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
