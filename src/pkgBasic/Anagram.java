/**
 * 
 */
package pkgBasic;

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
	
	public static void main(String args[]){
		Anagram obj = new Anagram();
		//obj.checkAnagram("fucku", "hear");
		
		obj.sample();
	}

}
