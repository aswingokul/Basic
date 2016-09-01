<<<<<<< HEAD
/**
 * 
 */
package pkg_DP;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aswin
 *
 */
public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		WordBreak wb = new WordBreak();
		set.add("");
		set.add("leet");
		set.add("jute");
		boolean out = wb.wordBreakDP("leetcode", set);
		System.out.println(out);

	}
	
	public boolean wordBreakDP(String s, Set<String> dict){
		boolean dp[] = new boolean[s.length()+1];
		dp[0] = true;
		
		for(int i=0; i<s.length();i++){
			if(!dp[i])
				continue;
			
			for(String wd : dict){
				int len = wd.length();
				int end = i+len;
				
				if(end > s.length())
					continue;
				if(dp[end])
					continue;
				
				if(s.substring(i,end).equals(wd)){
					dp[end] = true;					
				}
			}
		}
		return dp[s.length()];
	}

}
=======
/**
 * 
 */
package pkg_DP;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Aswin
 *
 */
public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		WordBreak wb = new WordBreak();
		set.add("");
		set.add("leet");
		set.add("jute");
		boolean out = wb.wordBreakDP("leetcode", set);
		System.out.println(out);

	}
	
	public boolean wordBreakDP(String s, Set<String> dict){
		boolean dp[] = new boolean[s.length()+1];
		dp[0] = true;
		
		for(int i=0; i<s.length();i++){
			if(!dp[i])
				continue;
			
			for(String wd : dict){
				int len = wd.length();
				int end = i+len;
				
				if(end > s.length())
					continue;
				if(dp[end])
					continue;
				
				if(s.substring(i,end).equals(wd)){
					dp[end] = true;					
				}
			}
		}
		return dp[s.length()];
	}

}
>>>>>>> e1183d48c51150798e555e5c155c1abae0f1ee10
