/**
 * 
 */
package pkg_Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Aswin
 *
 */
public class SameContents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sameContents("teaching", "cheating"));
		compare( "teaching", "cheating");

	}
	
	static void  compare(String a, String b){
		if(a.compareToIgnoreCase(b) > 0){
			System.out.println("1: " + a + " " + b);
		}else{
			System.out.println("2: " + b + " " + a);
		}
	}
	
	
	static boolean sameContents(String a, String b) {
        if(a == null && b == null)
            return true;
        
        if(a == null || b == null )
            return false;
        
        if(a.length() != b.length())
            return false;
        
               
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(map.containsKey(c)){
                int val = map.get(c);
                val++;
                map.put(c,val);
            }else{
                map.put(c, 1);
            }
        }
        
        for(int i=0; i< b.length(); i++){
            char c = b.charAt(i);
            if(map.containsKey(c)){
                int val = map.get(c);
                val--;
                map.put(c,val);
            }else{
                return false;
            }
        }
        
        for(Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0)
                return false;
        }
        
        return true;
    }

}
