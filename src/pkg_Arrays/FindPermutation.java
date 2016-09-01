/**
 * 
 */
package pkg_Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Aswin
 *
 */
public class FindPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String init = new String("abc");
		ArrayList<String> op = findPermutation(init);
		System.out.println(op);
	}
	
	public static ArrayList<String> findPermutation(String ini){
		ArrayList<String> combis = new ArrayList<String>();
		System.out.println("============BEGIN============");
		System.out.println("ini: "+ini);
		if(ini.length()<=0)
			return null;
		if(ini.length()==1){
			combis.add(ini);
			System.out.println("Inside the len==1 cond\ncombis:"+combis);
			return combis;
		}
		
		Set<Character> alreadyAdded = new HashSet<Character>();
		for(int i=0; i<ini.length();i++){
			System.out.println("---------------------------");
			System.out.println("Inside for loop\nini: "+ini);
			char ch = ini.charAt(i);
			System.out.println("i: "+i+", ch: "+ch);
			if(alreadyAdded.add(ch)){
				System.out.println("Inside the if part\ni: "+i+", ch: "+ch);
				String part1 = ini.substring(0, i);
				String part2 = ini.substring(i+1);
				//System.out.println("i: "+i);
				System.out.println("part1: "+part1);
				System.out.println("part2: "+part2);
				ArrayList<String> tmpList = findPermutation(part1+part2);
				System.out.println("After the call\n ini: "+ini);
				for(String s : tmpList ){
					combis.add(ch+s);
					System.out.println("ch: "+ch+", s: "+s);
					System.out.println("Adding ch+s to the combis\ncombis:"+combis);
					System.out.println("---------------------------");
				}				
			}
		}
			 
		System.out.println("==========EXIT==============");
		return combis;
	}

}
