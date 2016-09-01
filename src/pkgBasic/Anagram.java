/**
 * 
 */
package pkgBasic;

import java.util.HashMap;
import java.util.Map;

//import pkgBasic.PermuteString;
/**
 * @author Aswin
 *
 */
public class Anagram {
	
	String str1, str2;
	
	
		
	public void checkAnagram(String str1, String str2){
		int[] bucket1 = new int[60];
		int[] bucket2 = new int[60];
		boolean flag = false;
		if(str1.length()!=str2.length()){
			System.out.println("Not an Anagram!");
		}
		
		for(int i=0;i<str1.length(); i++){
			bucket1[str1.charAt(i)-65]++;
			bucket2[str2.charAt(i)-65]++;
			
		}
		for(int i=0;i<str1.length(); i++){
			if(bucket1[i]==bucket2[i])
				flag = true;
			else
				flag = false;
		}
		
		if(flag)
			System.out.println(" Anagram!");
		else
			System.out.println("Not an Anagram!");
	}
	
	public void sample(){
		int i=0;
		for(;i<5;i++){
			if(i==2)
				break;
			System.out.println(i);
				
		}
	}
	
	public boolean isAnagram(String s, String t) {
        if(s == null && t == null)
            return true;
        
        if(s.length() != t.length())
            return false;
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else
                map.put(s.charAt(i),1);
        }
        
        for(int i=0; i<t.length();i++){
            if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) <=0)
                return false;
            else
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
        }
        return true;
    }
	
	public static void main(String args[]){
		Anagram obj = new Anagram();
		//obj.checkAnagram("fucku", "hear");
		
		obj.sample();
	}

}
