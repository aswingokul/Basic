/**
 * 
 */
package pkg_Arrays;

import java.util.ArrayList;

/**
 * @author aswin
 *
 */
public class ArrangeAlternatively {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangeAlternatively aa = new ArrangeAlternatively();
		int[] ip = {1,2,3,4};
		aa.arrange(ip);

	}
	
	void arrange(int[] nums) {
		
		ArrayList<Integer> oddlist = new ArrayList<Integer>();
		ArrayList<Integer> evenlist = new ArrayList<Integer>();
				
		for(int i=0; i<nums.length ;i++) {
			if(nums[i] %2 == 0) {
				evenlist.add(nums[i]) ;				
			}else {
				oddlist.add(nums[i]);
			}
		}
		
		System.out.print("Odd list: "); 
		for(int k : oddlist) {			
			System.out.print(k +" ");			
		}
		System.out.println();
		System.out.print("even list: "); 
		for(int k : evenlist) {			
			System.out.print(k +" ");			
		}
		System.out.println();
		
		int ec = 0;
		for(int i=0; i<nums.length && ec < evenlist.size(); i++) {
			System.out.println("Inserting " + evenlist.get(ec) + " into the " + 2*i +" th position");
			nums[i*2] = evenlist.remove(ec);
			ec++;
			System.out.println("List size: "+evenlist.size());
			System.out.println("Nums size: "+ nums.length);
		}
		int oc = 0;
		for(int i = 1; i < nums.length && i < oddlist.size(); i+=2) {
			System.out.println("Inserting " + oddlist.get(oc) + " into the " + i +" th position");
			nums[i] = oddlist.remove(oc++);
		}
		
		for(int j = 0; j<nums.length; j++) {
			System.out.print(nums[j] + " ");
		}
	}

}
